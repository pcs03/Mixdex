package nl.pcstet.mixdex.ui.navigation

import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object CocktailList : Route

    @Serializable
    data class CocktailDetails(
        val cocktailId: Int
    ) : Route
}