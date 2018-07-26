import io.ktor.application.call
import io.ktor.content.resolveResource
import io.ktor.content.resources
import io.ktor.content.static
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, port = System.getenv("PORT")?.toInt() ?: 8080) {
        routing {
            static("/static/") {
                resources("static")
            }
            get("/") {
                call.respond(call.resolveResource("index.html")!!)
            }
        }
    }
    server.start(wait = true)
}