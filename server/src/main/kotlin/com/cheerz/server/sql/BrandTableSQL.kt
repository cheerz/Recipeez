package com.cheerz.server.sql

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object BrandTableSQL : Table() {
    val id: Column<Int> = integer("id").autoIncrement().primaryKey()
    val name: Column<String> = varchar("name", 100).index(isUnique = true)
    val description: Column<String> = varchar("description", 300)
    val industryTag: Column<String> = varchar("industry", 100)
    val linkedinLink: Column<String> = varchar("linkedin_link", 200)
    val recipes: Column<String> = varchar("recipes", 200)
    val maxBudget: Column<String> = varchar("maxBudget", 200)
    val website: Column<String> = varchar("website", 200)
    val gender: Column<String> = varchar("gender", 50)
    val purpose: Column<String> = varchar("purpose", 200)
}

