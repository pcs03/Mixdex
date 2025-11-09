package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AmountFormat(
    val amount: Double,
    @SerialName("amount_max")
    val amountMax: Double?,
    val units: String,
    @SerialName("full_text")
    val fullText: String
)

@Serializable
data class AmountFormats(
    val ml: AmountFormat,
    val oz: AmountFormat,
    val cl: AmountFormat
)
