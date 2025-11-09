package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserBasic(
    val id: Int,
    val name: String
)

@Serializable
data class User(
    val id: Int,
    val name: String,
    val email: String,
    @SerialName("is_subscribed")
    val isSubscribed: Boolean,
    val role: UserRole
)

@Serializable
data class UserRole(
    @SerialName("bar_id")
    val barId: Int,
    @SerialName("role_id")
    val roleId: Int? = null,
    @SerialName("role_name")
    val roleName: String? = null
)

