package com.cheerz.server.sql

import com.cheerz.server.Repository
import com.cheerz.server.db.Brand
import com.cheerz.server.db.Industry
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

class DBRepository : Repository {
    override fun getBrandsByAreas(): Map<String, List<Brand>> {
        return transaction {
            BrandTableSQL
                    .selectAll()
                    .notForUpdate()
                    .groupBy { it[BrandTableSQL.industryTag] }
                    .mapValues {
                        it.value.map {
                            Brand(
                                    it[BrandTableSQL.id],
                                    it[BrandTableSQL.name],
                                    it[BrandTableSQL.linkedinLink],
                                    setOf(it[BrandTableSQL.industryTag]),
                                    it[BrandTableSQL.description],
                                    maxBudget = it[BrandTableSQL.maxBudget],
                                    website = it[BrandTableSQL.website],
                                    recipe = it[BrandTableSQL.recipes],
                                    interests = it[BrandTableSQL.purpose].split(separator).toSet())
                        }
                    }

        }
    }

    override fun getBrand(brandId: Int): Brand? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}