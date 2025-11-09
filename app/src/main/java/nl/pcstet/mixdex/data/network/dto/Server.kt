package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ServerVersion(
    val version: String,
    val type: String,
    @SerialName("search_host")
    val searchHost: String,
    @SerialName("search_version")
    val searchVersion: String,
    @SerialName("latest_version")
    val latestVersion: String,
    @SerialName("is_latest")
    val isLatest: Boolean,
    @SerialName("is_feeds_enabled")
    val isFeedsEnabled: Boolean,
    @SerialName("is_password_login_enabled")
    val isPasswordLoginEnabled: Boolean
)

