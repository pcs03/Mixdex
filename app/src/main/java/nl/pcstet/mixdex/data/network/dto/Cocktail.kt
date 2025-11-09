package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetCocktailsDto(
    val data: List<Cocktail>,
//    val links ,
//    val meta ,
)

@Serializable
data class CocktailBasic(
    val id: Int,
    val slug: String,
    val name: String,
    @SerialName("short_ingredients")
    val shortIngredients: List<String> = emptyList(),
    val image: Image? = null
)

@Serializable
data class Cocktail(
    val id: Int,
    val name: String,
    val slug: String,
    val instructions: String,
    val garnish: String? = null,
    val description: String? = null,
    val source: String? = null,
    @SerialName("public_id")
    val publicId: String? = null,
    @SerialName("public_at")
    val publicAt: String? = null,
    val images: List<Image> = emptyList(),
    val tags: List<CocktailTag> = emptyList(),
    val rating: CocktailRating? = null,
    val glass: Glass? = null,
    val utensils: List<Utensil> = emptyList(),
    val ingredients: List<CocktailIngredient> = emptyList(),
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("updated_at")
    val updatedAt: String? = null,
    val method: CocktailMethod? = null,
    val abv: Double? = null,
    @SerialName("volume_ml")
    val volumeMl: Double? = null,
    @SerialName("alcohol_units")
    val alcoholUnits: Double? = null,
    val calories: Double? = null,
    @SerialName("created_user")
    val createdUser: UserBasic? = null,
    @SerialName("updated_user")
    val updatedUser: UserBasic? = null,
    @SerialName("in_shelf")
    val inShelf: Boolean? = null,
    @SerialName("in_bar_shelf")
    val inBarShelf: Boolean? = null,
    @SerialName("is_favorited")
    val isFavorited: Boolean? = null,
    val access: CocktailAccess? = null,
    @SerialName("parent_cocktail")
    val parentCocktail: CocktailBasic? = null,
    val varieties: List<CocktailBasic> = emptyList(),
    val year: Int? = null
)

@Serializable
data class CocktailTag(
    val id: Int,
    val name: String
)

@Serializable
data class CocktailRating(
    val average: Int,
    @SerialName("total_votes")
    val totalVotes: Int,
    val user: Int? = null
)

@Serializable
data class CocktailMethod(
    val id: Int,
    val name: String,
    @SerialName("dilution_percentage")
    val dilutionPercentage: Int,
    @SerialName("cocktails_count")
    val cocktailsCount: Int? = null
)

@Serializable
data class CocktailAccess(
    @SerialName("can_edit")
    val canEdit: Boolean,
    @SerialName("can_delete")
    val canDelete: Boolean,
    @SerialName("can_rate")
    val canRate: Boolean,
    @SerialName("can_add_note")
    val canAddNote: Boolean
)


