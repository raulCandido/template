package candido.template.core.pokemon

import candido.template.datasource.pokemon.entity.AwesomeNameEntity
import candido.template.datasource.pokemon.entity.NameEntity
import candido.template.datasource.pokemon.entity.PokemonShapeEntity
import candido.template.datasource.pokemon.entity.PokemonSpecieEntity
import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty


data class PokemonShape(
    @JsonProperty("id") val id: Long? = null,
    @JsonProperty("name") val name: String? = null,
    @JsonProperty("awesome_names") val awesomeNameEntities: List<AwesomeName> = listOf(),
    @JsonProperty("names") val nameEntities: List<Name> = listOf(),
    @JsonProperty("pokemon_species") val pokemonSpecyEntities: List<PokemonSpecie> = listOf(),
) {

}
