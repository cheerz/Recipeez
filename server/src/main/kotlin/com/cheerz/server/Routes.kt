package com.cheerz.server

import com.cheerz.server.client.NewBrand
import com.cheerz.server.db.FakeRepository
import com.cheerz.server.sql.insertBrand
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.content.resolveResource
import io.ktor.content.resources
import io.ktor.content.static
import io.ktor.features.CallLogging
import io.ktor.features.Compression
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders
import io.ktor.gson.gson
import io.ktor.http.HttpStatusCode
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.response.respondRedirect
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.route
import io.ktor.routing.routing
import org.jetbrains.exposed.sql.transactions.transaction

val repo: Repository = FakeRepository()

val routing: Application.() -> Unit = {
    install(DefaultHeaders)
    install(Compression)
    install(CallLogging)
    install(ContentNegotiation) {
        gson { create() }
    }
    routing {
        static("/static/") {
            resources("static")
        }
        get("/") {
            call.respond(call.resolveResource("index.html")!!)
        }
        route("/brands") {
            get("{brandId}") {
                call.respond(call.resolveResource("brand.html")!!)
            }
            post {
                val brand = call.receive<NewBrand>()
                transaction {
                    insertBrand(brand)
                }
                call.respondRedirect("/")
            }
        }

        route("/api") {
            route("/areas") {
                get {
                    val areas = repo.getBrandsByAreas()
                    call.respond(areas)
                }
            }
            route("/brands/{brandId}") {
                get {
                    val brandId = call.parameters["brandId"]?.toInt()
                    val brand = brandId?.let { repo.getBrand(brandId) }
                    brand?.let { call.respond(it) } ?: call.respond(HttpStatusCode.NotFound)
                }
            }
        }
    }
}

