package candido.template.core.pokemon

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonSpecie(
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("url") val url: String? = null,
)