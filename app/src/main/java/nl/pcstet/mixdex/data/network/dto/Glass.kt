package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Glass(
    val id: Int,
    val name: String,
    @SerialName("cocktails_count")
    val cocktailsCount: Int,
    val description: String? = null,
    val volume: Double? = null,
    @SerialName("volume_units")
    val volumeUnits: String? = null,
    val images: List<Image> = emptyList()
)

