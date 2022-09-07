package candido.template.transportlayer.pokemon

import candido.template.datasource.pokemon.PokemonShapeClient
import candido.template.datasource.pokemon.PokemonShapeRepository
import candido.template.datasource.pokemon.entity.PokemonShapeAssembler
import candido.template.datasource.pokemon.entity.PokemonShapeEntity
import mu.KLogging
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class PokemonService(
    private val repository: PokemonShapeRepository,
    private val pokemonShapeClient: PokemonShapeClient,
    private val pokemonShapeAssembler: PokemonShapeAssembler,
) {

    fun saveEntity(entity: PokemonShapeEntity) = repository.save(entity)

    fun getClient(id: Long): PokemonShapeEntity {
        try {
            logger.info { "PokemonService || getClient || init method" }
            val response = pokemonShapeClient.getPokemonShape(id)
            if (response?.statusCode != HttpStatus.OK) {
                throw Exception("deu ruim")
            }

            logger.info { "PokemonService || getClient || persist" }
            return response.body?.let(pokemonShapeAssembler::toEntity)!!
        } catch (e: Exception) {
            logger.info { "e: ${e.message}" }
            throw Exception(e)
        }
    }

    fun buscandoPokemonShapeParaPersistir(id: Long) = saveEntity(getClient(id))

    companion object : KLogging()
}