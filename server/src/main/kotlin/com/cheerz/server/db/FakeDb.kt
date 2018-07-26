package com.cheerz.server.db

import com.cheerz.server.Repository

enum class Category {
    FOOD, TRAVEL, SERVICES
}

data class Brand(val id: Int, val name: String, val link: String, val tags: Set<Category>)

private val fakeDb = listOf(
        Brand(0, "0", "https://www.linkedin.com/in/charlesbail/", setOf(Category.FOOD)),
        Brand(1, "1", "https://www.linkedin.com/in/charlesbail/", setOf(Category.TRAVEL)),
        Brand(2, "2", "https://www.linkedin.com/in/charlesbail/", setOf(Category.SERVICES)),
        Brand(3, "3", "https://www.linkedin.com/in/charlesbail/", setOf(Category.FOOD, Category.TRAVEL)),
        Brand(4, "4", "https://www.linkedin.com/in/charlesbail/", setOf(Category.FOOD, Category.SERVICES)),
        Brand(5, "5", "https://www.linkedin.com/in/charlesbail/", setOf(Category.TRAVEL, Category.SERVICES)),
        Brand(6, "6", "https://www.linkedin.com/in/charlesbail/", setOf(Category.FOOD)),
        Brand(7, "7", "https://www.linkedin.com/in/charlesbail/", setOf(Category.FOOD)),
        Brand(8, "8", "https://www.linkedin.com/in/charlesbail/", setOf(Category.FOOD)))

class FakeRepository: Repository {
    override fun getBrandsByAreas(): Map<Category, List<Brand>> {
        return Category.values().map { cat ->
            cat to fakeDb.filter { it.tags.contains(cat) }
        }.toMap()
    }

    override fun getBrand(brandId: Int): Brand? {
        return fakeDb.firstOrNull { it.id == brandId }
    }

}


