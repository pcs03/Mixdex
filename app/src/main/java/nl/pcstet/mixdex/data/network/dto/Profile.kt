package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Profile(
    val id: Int,
    val name: String,
    val email: String,
    @SerialName("is_subscribed")
    val isSubscribed: Boolean,
    val memberships: List<BarMembership>,
    @SerialName("oauth_credentials")
    val oauthCredentials: List<OauthCredential>,
    val settings: ProfileSettings
)

@Serializable
data class ProfileSettings(
    val language: String? = null,
    val theme: String? = null
)

@Serializable
data class BarMembership(
    @SerialName("user_id")
    val userId: Int,
    @SerialName("user_name")
    val userName: String,
    @SerialName("bar_id")
    val barId: Int,
    @SerialName("is_shelf_public")
    val isShelfPublic: Boolean
)
