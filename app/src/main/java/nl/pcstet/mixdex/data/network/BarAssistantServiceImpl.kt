package nl.pcstet.mixdex.data.network

import io.ktor.client.HttpClient
import io.ktor.client.request.headers
import io.ktor.http.HttpHeaders
import io.ktor.http.path
import nl.pcstet.core.ApiResponse
import nl.pcstet.core.DataState
import nl.pcstet.core.safeRequest
import nl.pcstet.core.toApiException
import nl.pcstet.mixdex.data.network.dto.Cocktail
import nl.pcstet.mixdex.data.network.dto.GetCocktailsDto

class BarAssistantServiceImpl(private val httpClient: HttpClient) : BarAssistantService {
    override suspend fun getCocktails(barId: Int): DataState<List<Cocktail>> {
        val response = httpClient.safeRequest<GetCocktailsDto> {
            url {
                path("cocktails")
                parameters.append("per_page", 100.toString())
            }
            headers {
                append("Bar-Assistant-Bar-Id", barId.toString())
                append(
                    HttpHeaders.Authorization,
                    ""
                )
            }
        }

        return when (response) {
            is ApiResponse.Success -> DataState.Success(data = response.data.data)
            is ApiResponse.Error -> DataState.Error(response.cause.toApiException())
        }
    }
}
