package com.cheerz.server.sql

import com.cheerz.server.client.NewBrand
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.statements.InsertStatement

fun insertBrand(brand: NewBrand): InsertStatement<Number> {
    return BrandTableSQL.insert {
        it[BrandTableSQL.linkedinLink] = brand.linkedinLink
        it[BrandTableSQL.description] = brand.description
        it[BrandTableSQL.recipes] = brand.recipe
        it[BrandTableSQL.maxBudget] = brand.budget
        it[BrandTableSQL.industryTag] = brand.industryTag
        it[BrandTableSQL.name] = brand.name
    }
}