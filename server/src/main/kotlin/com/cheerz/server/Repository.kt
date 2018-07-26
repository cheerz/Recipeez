package com.cheerz.server

import com.cheerz.server.db.Brand
import com.cheerz.server.db.Category

interface Repository {

    fun getBrandsByAreas(): Map<Category, List<Brand>>

    fun getBrand(brandId: Int): Brand?
}