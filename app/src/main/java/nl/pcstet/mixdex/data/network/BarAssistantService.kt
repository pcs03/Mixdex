package nl.pcstet.mixdex.data.network

import nl.pcstet.core.DataState
import nl.pcstet.mixdex.data.network.dto.Cocktail

interface BarAssistantService {
    suspend fun getCocktails(barId: Int): DataState<List<nl.pcstet.mixdex.data.network.dto.Cocktail>>
}