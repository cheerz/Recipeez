package com.cheerz.server.db

import com.cheerz.server.Repository
import java.util.*

enum class Industry {
    FOOD, TRAVEL, SERVICES
}

enum class Budget(val budget: String) {
    LESS_THAN_1K("1000"), FROM_1K_TO_10K("10000"), FROM_10K_TO_100K("100000"), ABOVE_100K("∞")
}

enum class Targets {
    MUM, SOUVENIRS, FUN, TRAVEL
}

enum class Interest {
    REVENUE, VISIBILITY, ACQUISITION, LOYALTY
}

data class Brand(val id: Int,
                 val name: String,
                 val link: String,
                 val industries: Set<Industry>,
                 val description: String ="Hello description",
                 val serialPartner: Boolean = true,
                 val maxBudget: String = Budget.values().asList().shuffled().first().budget,
                 val interests: Set<Interest> = setOf(Interest.REVENUE, Interest.VISIBILITY),
                 val targets: Set<Targets> = Targets.values()
                         .asList()
                         .shuffled()
                         .take(Random().nextInt(Targets.values().size -1) +1)
                         .toSet()
)

private val fakeDb = listOf(
        Brand(0, "0", "https://www.linkedin.com/in/charlesbail/", setOf(Industry.FOOD)),
        Brand(1, "1", "https://www.linkedin.com/in/charlesbail/", setOf(Industry.TRAVEL)),
        Brand(2, "2", "https://www.linkedin.com/in/charlesbail/", setOf(Industry.SERVICES)),
        Brand(3, "3", "https://www.linkedin.com/in/charlesbail/", setOf(Industry.FOOD, Industry.TRAVEL)),
        Brand(4, "4", "https://www.linkedin.com/in/charlesbail/", setOf(Industry.FOOD, Industry.SERVICES)),
        Brand(5, "5", "https://www.linkedin.com/in/charlesbail/", setOf(Industry.TRAVEL, Industry.SERVICES)),
        Brand(6, "6", "https://www.linkedin.com/in/charlesbail/", setOf(Industry.FOOD)),
        Brand(7, "7", "https://www.linkedin.com/in/charlesbail/", setOf(Industry.FOOD)),
        Brand(8, "8", "https://www.linkedin.com/in/charlesbail/", setOf(Industry.FOOD)))

class FakeRepository: Repository {
    override fun getBrandsByAreas(): Map<Industry, List<Brand>> {
        return Industry.values().map { cat ->
            cat to fakeDb.filter { it.industries.contains(cat) }
        }.toMap()
    }

    override fun getBrand(brandId: Int): Brand? {
        return fakeDb.firstOrNull { it.id == brandId }
    }

}


