package candido.template.core.pokemon

import com.fasterxml.jackson.annotation.JsonAlias


data class Language(
    @JsonAlias("name") val name: String? = null,
    @JsonAlias("url") val url: String? = null
)