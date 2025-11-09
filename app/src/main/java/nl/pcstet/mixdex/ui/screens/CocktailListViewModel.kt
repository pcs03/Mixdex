package nl.pcstet.mixdex.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.scan
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import nl.pcstet.core.ApiException
import nl.pcstet.core.onError
import nl.pcstet.core.onLoading
import nl.pcstet.core.onSuccess
import nl.pcstet.mixdex.data.network.dto.Cocktail
import nl.pcstet.mixdex.data.repository.CocktailRepository

class CocktailListViewModel(private val cocktailRepository: CocktailRepository) : ViewModel() {
    private val _uiState = MutableStateFlow(CocktailListUiState())
    val uiState = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            cocktailRepository.getCocktails().collect { dataState ->
                dataState
                    .onLoading { loading -> _uiState.update { it.copy(isLoading = loading) } }
                    .onSuccess { cocktails -> _uiState.update { it.copy(cocktails = cocktails, error = null) } }
                    .onError { error -> _uiState.update { it.copy(error = error) } }
            }
        }
    }
}

data class CocktailListUiState(
    val isLoading: Boolean = false,
    val cocktails: List<Cocktail> = emptyList(),
    val error: ApiException? = null,
)