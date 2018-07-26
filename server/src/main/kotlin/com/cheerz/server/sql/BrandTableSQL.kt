package com.cheerz.server.sql

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object BrandTableSQL: Table() {
    val id: Column<Int> = integer("id").autoIncrement().primaryKey()
    val name: Column<String> = varchar("name", 100)
}