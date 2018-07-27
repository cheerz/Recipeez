package com.cheerz.server.client

data class NewBrand(val name: String,
                    val website: String,
                    val linkedin: String,
                    val gender: String,
                    val agerange: String,
                    val industry: String,
                    val purpose: List<String>,
                    val budget: String,
                    val description: String,
                    val recipe: String,
                    val tags: String)