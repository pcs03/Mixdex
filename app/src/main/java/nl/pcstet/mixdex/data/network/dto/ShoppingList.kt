package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class ShoppingList(
    val ingredient: IngredientBasic,
    val quantity: Int? = null
)
