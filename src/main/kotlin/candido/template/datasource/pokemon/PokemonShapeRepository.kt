package candido.template.datasource.pokemon

import candido.template.datasource.pokemon.entity.PokemonShapeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PokemonShapeRepository : JpaRepository<PokemonShapeEntity, Long> {
}