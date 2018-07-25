import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, port = System.getenv("PORT")?.toInt() ?: 8080) {
        routing {
            get("/") {
                call.respondText("Let's find a good project name too!")
            }
        }
    }
    server.start(wait = true)
}