import com.cheerz.server.routing
import com.cheerz.server.sql.BrandTableSQL
import io.ktor.application.call
import io.ktor.content.resolveResource
import io.ktor.content.resources
import io.ktor.content.static
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.SchemaUtils.create
import org.jetbrains.exposed.sql.StdOutSqlLogger
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.transactions.transaction

fun main(args: Array<String>) {
    val env = { name: String -> System.getenv(name) }
    Database.connect(
            url = "jdbc:${env("DB_URI") ?: "postgresql://localhost:5432/partneerz"}",
            driver = "org.postgresql.Driver",
            user = env("DB_USER") ?: "postgres",
            password = env("DB_PASSWORD"))
    transaction {
        addLogger(StdOutSqlLogger)
        SchemaUtils.createMissingTablesAndColumns(BrandTableSQL)
    }

    val server = embeddedServer(Netty, port = System.getenv("PORT")?.toInt() ?: 8080, module = routing)
    server.start(wait = true)
}