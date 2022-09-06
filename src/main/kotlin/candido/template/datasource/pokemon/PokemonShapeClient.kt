package candido.template.datasource.pokemon

import candido.template.core.pokemon.PokemonShape
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient("pokemonShape", url = "https://pokeapi.co/api/v2")
interface PokemonShapeClient {

    @GetMapping(value = ["/pokemon-shape/{id}"])
    fun getPokemonShape(@PathVariable id: Long): PokemonShape
}