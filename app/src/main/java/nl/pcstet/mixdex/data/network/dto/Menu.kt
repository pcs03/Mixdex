package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Menu(
    val id: Int,
    @SerialName("is_enabled")
    val isEnabled: Boolean,
    @SerialName("created_at")
    val createdAt: String,
    val categories: List<MenuCategory>,
    @SerialName("updated_at")
    val updatedAt: String? = null
)

@Serializable
data class MenuCategory(
    val name: String,
    val items: List<MenuItem>
)

@Serializable
data class MenuItem(
    val id: Int,
    val type: MenuItemTypeEnum,
    val sort: Int,
    val price: Price,
    val name: String,
    val description: String? = null
)

@Serializable
data class Price(
    val price: Double,
    @SerialName("price_minor")
    val priceMinor: Int,
    @SerialName("formatted_price")
    val formattedPrice: String,
    val currency: String
)

