package com.cheerz.server.sql

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object BrandTableSQL: Table() {
    val id: Column<Int> = integer("id").autoIncrement().primaryKey()
    val name: Column<String> = varchar("name", 100).index(isUnique = true)
    val description: Column<String> = varchar("description", 300)
    val imagePath: Column<String> = varchar("imagePath", 900)
    val industryTag: Column<String> = varchar("industry", 100)
    val linkedinLink: Column<String> = varchar("linkedin_link", 200)
    val recipes: Column<String> = varchar("recipes", 200)
    val maxBudget: Column<Int> = integer("maxBudget")
}

