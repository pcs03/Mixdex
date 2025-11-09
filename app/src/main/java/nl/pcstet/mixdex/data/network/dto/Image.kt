package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Image(
    val id: Int,
    @SerialName("file_path")
    val filePath: String,
    val sort: Int,
    val url: String? = null,
    @SerialName("thumb_url")
    val thumbUrl: String? = null,
    val copyright: String? = null,
    @SerialName("placeholder_hash")
    val placeholderHash: String? = null
)
