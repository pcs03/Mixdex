package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BarRequest(
    val name: String,
    val subtitle: String? = null,
    val description: String? = null,
    val slug: String? = null,
    @SerialName("default_units")
    val defaultUnits: DefaultUnitsEnum? = null,
    @SerialName("default_currency")
    val defaultCurrency: String? = null,
    @SerialName("enable_invites")
    val enableInvites: Boolean? = null,
    val options: BarOptionsEnum? = null,
    val images: List<Int> = emptyList(),
    @SerialName("is_public")
    val isPublic: Boolean? = null
)


@Serializable
data class CalculatorBlockRequest(
    val label: String,
    @SerialName("variable_name")
    val variableName: String,
    val value: String,
    val type: CalculatorBlockTypeEnum,
    val settings: CalculatorBlockSettings,
    val description: String? = null,
    val sort: Int
)

@Serializable
data class CalculatorRequest(
    val name: String,
    val blocks: List<CalculatorBlockRequest> = emptyList(),
    val description: String? = null
)

@Serializable
data class CocktailIngredientRequest(
    @SerialName("ingredient_id")
    val ingredientId: Int,
    val amount: Double,
    val units: String,
    val name: String? = null,
    val sort: Int? = null,
    val optional: Boolean? = null,
    @SerialName("is_specified")
    val isSpecified: Boolean? = null,
    val substitutes: List<CocktailIngredientSubstituteRequest> = emptyList(),
    @SerialName("amount_max")
    val amountMax: Double? = null,
    val note: String? = null
)

@Serializable
data class CocktailIngredientSubstituteRequest(
    @SerialName("ingredient_id")
    val ingredientId: Int,
    val amount: Double? = null,
    @SerialName("amount_max")
    val amountMax: Double? = null,
    val units: String? = null
)

@Serializable
data class CocktailMethodRequest(
    val name: String,
    @SerialName("dilution_percentage")
    val dilutionPercentage: Int
)

@Serializable
data class CocktailRequest(
    val name: String,
    val instructions: String,
    val description: String? = null,
    val source: String? = null,
    val garnish: String? = null,
    @SerialName("glass_id")
    val glassId: Int? = null,
    @SerialName("method_id")
    val methodId: Int? = null,
    val tags: List<String> = emptyList(),
    val ingredients: List<CocktailIngredientRequest> = emptyList(),
    val images: List<Int> = emptyList(),
    val utensils: List<Int> = emptyList(),
    @SerialName("parent_cocktail_id")
    val parentCocktailId: Int? = null,
    val year: Int? = null
)

@Serializable
data class CollectionRequest(
    val name: String,
    val description: String? = null,
    @SerialName("is_bar_shared")
    val isBarShared: Boolean? = null,
    val cocktails: List<Int> = emptyList()
)


@Serializable
data class GlassRequest(
    val name: String,
    val description: String? = null,
    val volume: Double? = null,
    @SerialName("volume_units")
    val volumeUnits: String? = null,
    val images: List<Int> = emptyList()
)

@Serializable
data class ImageRequest(
    val image: String? = null,
    val sort: Int,
    val id: Int? = null,
    val copyright: String? = null
)

@Serializable
data class IngredientRequest(
    val name: String,
    val strength: Double? = null,
    val description: String? = null,
    val origin: String? = null,
    val color: String? = null,
    @SerialName("parent_ingredient_id")
    val parentIngredientId: Int? = null,
    val images: List<Int> = emptyList(),
    @SerialName("complex_ingredient_part_ids")
    val complexIngredientPartIds: List<Int> = emptyList(),
    val prices: List<IngredientPriceRequest> = emptyList(),
    @SerialName("calculator_id")
    val calculatorId: Int? = null,
    @SerialName("sugar_g_per_ml")
    val sugarGPerMl: Double? = null,
    val acidity: Double? = null,
    val distillery: String? = null,
    val units: String? = null
)

@Serializable
data class LoginRequest(
    val email: String,
    val password: String,
    @SerialName("token_name")
    val tokenName: String? = null
)

@Serializable
data class MenuItemRequest(
    val id: Int,
    val type: MenuItemTypeEnum,
    @SerialName("category_name")
    val categoryName: String,
    val sort: Int,
    val price: Double,
    val currency: String
)

@Serializable
data class MenuRequest(
    @SerialName("is_enabled")
    val isEnabled: Boolean,
    val items: List<MenuItemRequest>
)


@Serializable
data class NoteRequest(
    val note: String,
    @SerialName("resource_id")
    val resourceId: Int,
    val resource: String
)

@Serializable
data class PersonalAccessTokenRequest(
    val abilities: List<AbilityEnum>,
    val name: String? = null,
    @SerialName("expires_at")
    val expiresAt: String? = null
)

@Serializable
data class PriceCategoryRequest(
    val name: String,
    val currency: String,
    val description: String? = null
)

@Serializable
data class ProfileRequest(
    val name: String,
    val email: String,
    val settings: ProfileSettings? = null,
    @SerialName("bar_id")
    val barId: Int? = null,
    val password: String? = null,
    @SerialName("is_shelf_public")
    val isShelfPublic: Boolean? = null
)

@Serializable
data class RegisterRequest(
    val email: String,
    val name: String,
    val password: String
)

@Serializable
data class ShoppingListRequest(
    val ingredients: List<ShoppingListIngredient>
)

@Serializable
data class TagRequest(
    val name: String
)

@Serializable
data class UserRequest(
    @SerialName("role_id")
    val roleId: Int,
    val email: String,
    val name: String,
    val password: String
)

@Serializable
data class UtensilRequest(
    val name: String,
    val description: String? = null
)

@Serializable
data class ExportRequest(
    val type: ExportTypeEnum? = null,
    val units: ForceUnitConvertEnum? = null,
    @SerialName("bar_id")
    val barId: Int? = null
)

