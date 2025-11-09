package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Calculator(
    val id: Int,
    val name: String,
    val blocks: List<CalculatorBlock>,
    val description: String? = null
)

@Serializable
data class CalculatorBlock(
    val sort: Int,
    val label: String,
    @SerialName("variable_name")
    val variableName: String,
    val value: String,
    val description: String? = null,
    val settings: CalculatorBlockSettings,
    val type: String? = null
)

@Serializable
data class CalculatorBlockSettings(
    val suffix: String? = null,
    val prefix: String? = null,
    @SerialName("decimal_places")
    val decimalPlaces: String? = null
)

