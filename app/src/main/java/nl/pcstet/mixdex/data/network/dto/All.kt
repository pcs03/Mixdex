package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

// --- Enums ---

// --- Data Classes (Schemas) ---


@Serializable
data class ApiError(
    val type: String,
    val message: String
)


@Serializable
data class CalculatorResult(
    val inputs: Map<String, String>,
    val results: Map<String, String>
)

@Serializable
data class CalculatorSolveRequest(
    val inputs: Map<String, String>
)


@Serializable
data class CocktailExplore(
    val bar: BarBasic,
    val name: String,
    val instructions: String,
    val garnish: String? = null,
    val description: String? = null,
    val source: String? = null,
    val tags: List<String>,
    val glass: String? = null,
    val utensils: List<String>,
    val method: String? = null,
    val images: List<CocktailExploreImage>,
    val ingredients: List<CocktailExploreIngredient>,
    val abv: Double? = null
)

@Serializable
data class CocktailExploreImage(
    val sort: Int? = null,
    @SerialName("placeholder_hash")
    val placeholderHash: String? = null,
    val url: String? = null,
    val copyright: String? = null
)

@Serializable
data class CocktailExploreIngredient(
    val ingredient: IngredientName,
    val amount: Double? = null,
    @SerialName("amount_max")
    val amountMax: Double? = null,
    val units: String? = null,
    val optional: Boolean? = null,
    val note: String? = null,
    val substitutes: List<CocktailExploreIngredientSubstitute> = emptyList()
)

@Serializable
data class CocktailExploreIngredientSubstitute(
    val ingredient: IngredientName,
    val amount: Double? = null,
    @SerialName("amount_max")
    val amountMax: Double? = null,
    val units: String? = null
)

@Serializable
data class CocktailPrice(
    @SerialName("missing_prices_count")
    val missingPricesCount: Int,
    @SerialName("price_category")
    val priceCategory: PriceCategory,
    @SerialName("total_price")
    val totalPrice: Price,
    @SerialName("prices_per_ingredient")
    val pricesPerIngredient: List<CocktailPricePerIngredient>
)

@Serializable
data class CocktailPricePerIngredient(
    val ingredient: IngredientBasic,
    @SerialName("price_per_unit")
    val pricePerUnit: Price,
    @SerialName("price_per_use")
    val pricePerUse: Price,
    val units: String
)

@Serializable
data class Export(
    val id: Int? = null,
    val filename: String? = null,
    @SerialName("created_at")
    val createdAt: String? = null,
    @SerialName("bar_name")
    val barName: String? = null,
    @SerialName("is_done")
    val isDone: Boolean? = null
)

@Serializable
data class FeedsRecipe(
    val source: String,
    val title: String,
    val link: String,
    val date: String? = null,
    val image: String? = null,
    val description: String? = null,
    @SerialName("supports_recipe_import")
    val supportsRecipeImport: Boolean? = null
)

@Serializable
data class FileDownloadLink(
    val url: String? = null,
    val token: String? = null,
    val expires: String? = null
)

@Serializable
data class IngredientName(
    val name: String
)

@Serializable
data class IngredientPrice(
    @SerialName("price_category")
    val priceCategory: PriceCategory,
    val price: Price,
    val amount: Double,
    val units: String,
    @SerialName("created_at")
    val createdAt: String,
    val description: String? = null,
    @SerialName("updated_at")
    val updatedAt: String? = null
)

@Serializable
data class IngredientRecommend(
    // Flattened from allOf: IngredientBasic
    val id: Int,
    val slug: String,
    val name: String,
    val image: Image? = null,
    // Additional properties
    @SerialName("potential_cocktails")
    val potentialCocktails: Int? = null
)


@Serializable
data class IngredientTree(
    val ingredient: IngredientBasic,
    val children: List<IngredientTree>
)


@Serializable
data class Note(
    val id: Int,
    val note: String,
    @SerialName("user_id")
    val userId: Int,
    @SerialName("created_at")
    val createdAt: String
)
@Serializable
data class OauthCredential(
    val provider: SSOProvider,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("updated_at")
    val updatedAt: String? = null
)

@Serializable
data class PersonalAccessToken(
    val id: Int,
    val name: String,
    val abilities: List<String>,
    @SerialName("last_used_at")
    val lastUsedAt: String,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("expires_at")
    val expiresAt: String
)

@Serializable
data class PriceCategory(
    val id: Int,
    val name: String,
    val currency: String,
    val description: String? = null,
    @SerialName("currency_symbol")
    val currencySymbol: String? = null
)


@Serializable
data class ShoppingListIngredient(
    val id: Int? = null,
    val quantity: Int? = null
)

@Serializable
data class SSOProvider(
    val name: String,
    @SerialName("display_name")
    val displayName: String,
    val enabled: Boolean
)


@Serializable
data class Token(
    val token: String
)

@Serializable
data class UserSubscription(
    val prices: List<String>,
    val customer: UserSubscriptionCustomer,
    val subscription: Subscription? = null
)

@Serializable
data class UserSubscriptionCustomer(
    @SerialName("paddle_id")
    val paddleId: String? = null,
    @SerialName("paddle_email")
    val paddleEmail: String? = null,
    @SerialName("paddle_name")
    val paddleName: String? = null
)

@Serializable
data class ValidationError(
    val message: String,
    val errors: Map<String, List<String>>
)