package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.Serializable


@Serializable
data class Dto<T>(
    val data: T
)
