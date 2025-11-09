package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class IngredientBasic(
    val id: Int,
    val slug: String,
    val name: String,
    val image: Image? = null
)

@Serializable
data class Ingredient(
    val id: Int,
    val slug: String,
    val name: String,
    @SerialName("created_at")
    val createdAt: String,
    val strength: Double,
    val hierarchy: IngredientHierarchy,
    val description: String? = null,
    val origin: String? = null,
    val color: String? = null,
    @SerialName("updated_at")
    val updatedAt: String? = null,
    @SerialName("materialized_path")
    val materializedPath: String? = null,
    val images: List<Image> = emptyList(),
    @SerialName("cocktails_count")
    val cocktailsCount: Int? = null,
    @SerialName("cocktails_as_substitute_count")
    val cocktailsAsSubstituteCount: Int? = null,
    @SerialName("created_user")
    val createdUser: UserBasic? = null,
    @SerialName("updated_user")
    val updatedUser: UserBasic? = null,
    val access: IngredientAccess? = null,
    @SerialName("in_shelf")
    val inShelf: Boolean? = null,
    @SerialName("in_shelf_as_variant")
    val inShelfAsVariant: Boolean? = null,
    @SerialName("in_bar_shelf")
    val inBarShelf: Boolean? = null,
    @SerialName("in_bar_shelf_as_variant")
    val inBarShelfAsVariant: Boolean? = null,
    @SerialName("in_shopping_list")
    val inShoppingList: Boolean? = null,
    @SerialName("used_as_substitute_for")
    val usedAsSubstituteFor: List<IngredientBasic> = emptyList(),
    @SerialName("can_be_substituted_with")
    val canBeSubstitutedWith: List<IngredientBasic> = emptyList(),
    @SerialName("ingredient_parts")
    val ingredientParts: List<IngredientBasic> = emptyList(),
    val prices: List<IngredientPrice> = emptyList(),
    @SerialName("calculator_id")
    val calculatorId: Int? = null,
    @SerialName("sugar_g_per_ml")
    val sugarGPerMl: Double? = null,
    val acidity: Double? = null,
    val distillery: String? = null,
    val units: String? = null
)

@Serializable
data class IngredientHierarchy(
    @SerialName("path_to_self")
    val pathToSelf: String? = null,
    @SerialName("parent_ingredient")
    val parentIngredient: IngredientBasic? = null,
    val descendants: List<IngredientBasic> = emptyList(),
    val ancestors: List<IngredientBasic> = emptyList(),
    @SerialName("root_ingredient_id")
    val rootIngredientId: String? = null
)

@Serializable
data class IngredientAccess(
    @SerialName("can_edit")
    val canEdit: Boolean? = null,
    @SerialName("can_delete")
    val canDelete: Boolean? = null
)

@Serializable
data class IngredientPriceRequest(
    @SerialName("price_category_id")
    val priceCategoryId: Int,
    val price: Int,
    val amount: Double,
    val units: String,
    val description: String? = null
)

