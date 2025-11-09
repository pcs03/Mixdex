package nl.pcstet.mixdex.data.repository

import kotlinx.coroutines.flow.Flow
import nl.pcstet.core.ApiResponse
import nl.pcstet.core.DataState
import nl.pcstet.mixdex.data.network.dto.Cocktail

interface CocktailRepository {
    suspend fun getCocktails(): Flow<DataState<List<Cocktail>>>
}