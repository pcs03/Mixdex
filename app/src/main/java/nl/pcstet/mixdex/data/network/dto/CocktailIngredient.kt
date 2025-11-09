package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CocktailIngredient(
    val sort: Int,
    val amount: Double,
    val units: String,
    val ingredient: IngredientBasic,
    @SerialName("is_specified")
    val isSpecified: Boolean,
    val formatted: AmountFormats,
    @SerialName("amount_max")
    val amountMax: Double? = null,
    val optional: Boolean? = null,
    val substitutes: List<CocktailIngredientSubstitute> = emptyList(),
    @SerialName("variants_in_shelf")
    val variantsInShelf: List<IngredientBasic> = emptyList(),
    val note: String? = null,
    @SerialName("in_shelf")
    val inShelf: Boolean? = null,
    @SerialName("in_shelf_as_variant")
    val inShelfAsVariant: Boolean? = null,
    @SerialName("in_shelf_as_substitute")
    val inShelfAsSubstitute: Boolean? = null,
    @SerialName("in_shelf_as_complex_ingredient")
    val inShelfAsComplexIngredient: Boolean? = null,
    @SerialName("in_bar_shelf")
    val inBarShelf: Boolean? = null,
    @SerialName("in_bar_shelf_as_substitute")
    val inBarShelfAsSubstitute: Boolean? = null,
    @SerialName("in_bar_shelf_as_complex_ingredient")
    val inBarShelfAsComplexIngredient: Boolean? = null,
    @SerialName("in_bar_shelf_as_variant")
    val inBarShelfAsVariant: Boolean? = null
)

@Serializable
data class CocktailIngredientSubstitute(
    val ingredient: IngredientBasic,
    @SerialName("in_shelf")
    val inShelf: Boolean,
    @SerialName("in_bar_shelf")
    val inBarShelf: Boolean,
    val amount: Double? = null,
    @SerialName("amount_max")
    val amountMax: Double? = null,
    val units: String? = null
)

