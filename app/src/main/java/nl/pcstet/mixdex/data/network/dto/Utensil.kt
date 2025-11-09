package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class Utensil(
    val id: Int,
    val name: String,
    val description: String? = null
)
