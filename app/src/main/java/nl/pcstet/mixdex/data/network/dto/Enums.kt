package nl.pcstet.mixdex.data.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class AbilityEnum {
    @SerialName("cocktails.read") COCKTAILS_READ,
    @SerialName("cocktails.write") COCKTAILS_WRITE,
    @SerialName("cocktails.import") COCKTAILS_IMPORT,
    @SerialName("ingredients.read") INGREDIENTS_READ,
    @SerialName("ingredients.write") INGREDIENTS_WRITE,
    @SerialName("bars.read") BARS_READ,
    @SerialName("bars.write") BARS_WRITE
}

@Serializable
enum class BarOptionsEnum {
    @SerialName("ingredients") INGREDIENTS,
    @SerialName("cocktails") COCKTAILS
}

@Serializable
enum class BarStatusEnum {
    @SerialName("provisioning") PROVISIONING,
    @SerialName("active") ACTIVE,
    @SerialName("deactivated") DEACTIVATED
}

@Serializable
enum class CalculatorBlockTypeEnum {
    @SerialName("input") INPUT,
    @SerialName("eval") EVAL
}

@Serializable
enum class DefaultUnitsEnum {
    @SerialName("ml") ML,
    @SerialName("cl") CL,
    @SerialName("oz") OZ
}

@Serializable
enum class DuplicateActionsEnum {
    @SerialName("none") NONE,
    @SerialName("skip") SKIP,
    @SerialName("overwrite") OVERWRITE
}

@Serializable
enum class ExportTypeEnum {
    @SerialName("datapack") DATAPACK,
    @SerialName("schema") SCHEMA,
    @SerialName("md") MD,
    @SerialName("json-ld") JSON_LD,
    @SerialName("xml") XML,
    @SerialName("yaml") YAML
}

@Serializable
enum class ForceUnitConvertEnum {
    @SerialName("none") NONE,
    @SerialName("ml") ML,
    @SerialName("oz") OZ,
    @SerialName("cl") CL
}

@Serializable
enum class MenuItemTypeEnum {
    @SerialName("cocktail") COCKTAIL,
    @SerialName("ingredient") INGREDIENT
}

@Serializable
enum class OauthProvider {
    @SerialName("github") GITHUB,
    @SerialName("google") GOOGLE,
    @SerialName("gitlab") GITLAB,
    @SerialName("authentik") AUTHENTIK,
    @SerialName("authelia") AUTHELIA,
    @SerialName("keycloak") KEYCLOAK,
    @SerialName("pocketid") POCKETID,
    @SerialName("zitadel") ZITADEL
}

