package com.cheerz.server

import com.cheerz.server.db.Brand
import com.cheerz.server.db.Industry

interface Repository {

    fun getBrandsByAreas(): Map<Industry, List<Brand>>

    fun getBrand(brandId: Int): Brand?
}