package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BarBasic(
    val id: Int,
    val slug: String,
    val name: String,
    val subtitle: String? = null
)

@Serializable
data class Bar(
    val id: Int,
    val slug: String,
    val name: String,
    val subtitle: String? = null,
    val description: String? = null,
    @SerialName("invite_code")
    val inviteCode: String? = null,
    val status: BarStatusEnum,
    val settings: BarSettings,
    @SerialName("search_host")
    val searchHost: String? = null,
    @SerialName("search_token")
    val searchToken: String? = null,
    @SerialName("created_at")
    val createdAt: String,
    @SerialName("updated_at")
    val updatedAt: String? = null,
    @SerialName("created_user")
    val createdUser: UserBasic? = null,
    @SerialName("updated_user")
    val updatedUser: UserBasic? = null,
    val access: BarAccess,
    val images: List<Image> = emptyList(),
    @SerialName("is_public")
    val isPublic: Boolean
)

@Serializable
data class BarSettings(
    @SerialName("default_units")
    val defaultUnits: String? = null,
    @SerialName("default_currency")
    val defaultCurrency: String? = null
)

@Serializable
data class BarAccess(
    @SerialName("role_id")
    val roleId: Int,
    @SerialName("can_edit")
    val canEdit: Boolean,
    @SerialName("can_delete")
    val canDelete: Boolean,
    @SerialName("can_activate")
    val canActivate: Boolean,
    @SerialName("can_deactivate")
    val canDeactivate: Boolean
)

@Serializable
data class BarStats(
    @SerialName("total_cocktails")
    val totalCocktails: Int,
    @SerialName("total_ingredients")
    val totalIngredients: Int,
    @SerialName("total_favorited_cocktails")
    val totalFavoritedCocktails: Int,
    @SerialName("total_shelf_cocktails")
    val totalShelfCocktails: Int,
    @SerialName("total_bar_shelf_ingredients")
    val totalBarShelfIngredients: Int,
    @SerialName("total_bar_shelf_cocktails")
    val totalBarShelfCocktails: Int,
    @SerialName("total_shelf_ingredients")
    val totalShelfIngredients: Int,
    @SerialName("total_bar_members")
    val totalBarMembers: Int,
    @SerialName("total_collections")
    val totalCollections: Int,
    @SerialName("favorite_tags")
    val favoriteTags: List<BarStatsFavoriteTag>,
    @SerialName("your_top_ingredients")
    val yourTopIngredients: List<BarStatsIngredient>,
    @SerialName("most_popular_ingredients")
    val mostPopularIngredients: List<BarStatsIngredient>,
    @SerialName("top_rated_cocktails")
    val topRatedCocktails: List<BarStatsCocktail>
)

@Serializable
data class BarStatsCocktail(
    val id: Int,
    val slug: String,
    val name: String,
    @SerialName("avg_rating")
    val avgRating: Int,
    val votes: Int
)

@Serializable
data class BarStatsFavoriteTag(
    val id: Int,
    val name: String,
    @SerialName("cocktails_count")
    val cocktailsCount: Int
)

@Serializable
data class BarStatsIngredient(
    val id: Int,
    val slug: String,
    val name: String,
    @SerialName("cocktails_count")
    val cocktailsCount: Int
)

