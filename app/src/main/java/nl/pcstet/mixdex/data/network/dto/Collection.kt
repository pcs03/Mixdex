package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Collection(
    val id: Int,
    val name: String,
    @SerialName("is_bar_shared")
    val isBarShared: Boolean,
    @SerialName("created_at")
    val createdAt: String,
    val description: String? = null,
    @SerialName("created_user")
    val createdUser: UserBasic? = null,
    val cocktails: List<CocktailBasic> = emptyList()
)

