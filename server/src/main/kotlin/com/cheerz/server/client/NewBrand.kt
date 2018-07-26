package com.cheerz.server.client

data class NewBrand(val name: String,
                    val budget: Int,
                    val description: String,
                    val recipe: String,
                    val targetedSex: String?,
                    val purpose: List<String>,
                    val freeProducts: Boolean,
                    val linkedinLink: String,
                    val industryTag: String)