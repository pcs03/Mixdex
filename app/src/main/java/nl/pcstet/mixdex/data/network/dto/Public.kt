package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PublicBarResource(
    val id: Int,
    val slug: String,
    val name: String,
    val images: List<PublicImageResource>,
    @SerialName("is_menu_enabled")
    val isMenuEnabled: Boolean,
    val subtitle: String? = null,
    val description: String? = null
)

@Serializable
data class PublicImageResource(
    val sort: Int,
    @SerialName("placeholder_hash")
    val placeholderHash: String,
    val url: String,
    val copyright: String? = null
)

@Serializable
data class PublicCocktailResource(
    val slug: String,
    val name: String,
    val instructions: String,
    @SerialName("public_id")
    val publicId: String,
    val images: List<PublicImageResource>,
    val tags: List<String>,
    val utensils: List<String>,
    @SerialName("created_at")
    val createdAt: String,
    val ingredients: List<PublicCocktailIngredient>,
    val garnish: String? = null,
    val description: String? = null,
    val source: String? = null,
    @SerialName("public_at")
    val publicAt: String? = null,
    val glass: String? = null,
    val method: String? = null,
    @SerialName("method_dilution_percentage")
    val methodDilutionPercentage: Double? = null,
    @SerialName("volume_ml")
    val volumeMl: Double? = null,
    @SerialName("in_bar_shelf")
    val inBarShelf: Boolean? = null,
    val abv: Double? = null,
    val year: Int? = null
)

@Serializable
data class PublicCocktailIngredient(
    val name: String,
    val amount: Double,
    val units: String,
    @SerialName("units_formatted")
    val unitsFormatted: AmountFormats,
    val optional: Boolean,
    val substitutes: List<PublicCocktailIngredientSubstitute>,
    @SerialName("amount_max")
    val amountMax: Double? = null,
    val note: String? = null
)

@Serializable
data class PublicCocktailIngredientSubstitute(
    val name: String,
    val amount: Double,
    val units: String,
    @SerialName("amount_max")
    val amountMax: Double? = null
)

@Serializable
data class MenuPublic(
    val bar: MenuPublicBar,
    val categories: List<MenuPublicCategory>
)

@Serializable
data class MenuPublicBar(
    val name: String,
    val subtitle: String? = null,
    val description: String? = null,
    val images: List<String> = emptyList()
)

@Serializable
data class MenuPublicCategory(
    val name: String,
    val items: List<MenuPublicItem>
)

@Serializable
data class MenuPublicItem(
    @SerialName("in_bar_shelf")
    val inBarShelf: Boolean,
    val type: MenuItemTypeEnum,
    val sort: Int,
    val price: Price,
    val name: String,
    @SerialName("public_id")
    val publicId: String? = null,
    val description: String? = null,
    val image: String? = null
)
