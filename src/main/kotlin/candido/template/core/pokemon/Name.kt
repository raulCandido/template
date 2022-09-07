package candido.template.core.pokemon

import candido.template.datasource.pokemon.entity.LanguageEntity
import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty


data class Name(
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("language") val language: Language? = null,
)