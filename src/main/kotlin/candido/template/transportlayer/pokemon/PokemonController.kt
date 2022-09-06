package candido.template.transportlayer.pokemon

import candido.template.core.pokemon.PokemonShape
import candido.template.datasource.pokemon.PokemonShapeClient
import mu.KLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/pokemon")
class PokemonController(private val pokemonShapeClient: PokemonShapeClient) {

    @GetMapping("/{id}")
    fun getPokemonShape(@PathVariable id: Long): PokemonShape {
        val pokemonShape = pokemonShapeClient.getPokemonShape(id)
        logger.info("valor é: ${pokemonShape.id}")
        logger.info("valor é: ${pokemonShape.name}")
        logger.info("valor é: ${pokemonShape.nameEntities}")
        return pokemonShape
    }

    companion object : KLogging()
}