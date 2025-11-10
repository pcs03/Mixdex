package nl.pcstet.mixdex.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import nl.pcstet.core.DataState
import nl.pcstet.mixdex.data.network.BarAssistantService
import nl.pcstet.mixdex.data.network.dto.Cocktail

class CocktailRepositoryImpl(private val service: BarAssistantService) : CocktailRepository {
    override suspend fun getCocktails(): Flow<DataState<List<Cocktail>>> = flow {
        emit(DataState.Loading(true))
        emit(service.getCocktails(1))
        emit(DataState.Loading(false))
    }
}