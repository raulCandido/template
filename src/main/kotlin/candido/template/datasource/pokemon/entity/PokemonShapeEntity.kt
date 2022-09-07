package candido.template.datasource.pokemon.entity

import candido.template.core.pokemon.*
import org.springframework.stereotype.Component
import javax.persistence.*

@Entity
@Table(name = "pokemon_shape")
data class PokemonShapeEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String? = null,

    @OneToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn(name = "Pokemon_shape_id")
    var awesomeNameEntities: List<AwesomeNameEntity>? = listOf(),

    @OneToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn(name = "Pokemon_shape_id")
    var nameEntities: List<NameEntity> = listOf(),

    @OneToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn(name = "Pokemon_shape_id")
    var pokemonSpecyEntities: List<PokemonSpecieEntity> = listOf(),
)

@Component
class PokemonShapeAssembler(
    private val awesomeNameAssembler: AwesomeNameAssembler,
    private val nameAssembler: NameAssembler,
    private val pokemonSpecieAssembler: PokemonSpecieAssembler,
) {
    fun toEntity(model: PokemonShape) = PokemonShapeEntity(
        id = model.id,
        name = model.name,
        awesomeNameEntities = model.awesomeNameEntities.map(awesomeNameAssembler::toEntity),
        nameEntities = model.nameEntities.map(nameAssembler::toEntity),
        pokemonSpecyEntities = model.pokemonSpecyEntities.map(pokemonSpecieAssembler::toEntity)
    )

}

@Component
class AwesomeNameAssembler(private val languageAssembler: LanguageAssembler) {
    fun toEntity(model: AwesomeName) = AwesomeNameEntity(
        name = model.name,
        languageEntity = model.language?.let(languageAssembler::toEntity)
    )

}

@Component
class LanguageAssembler {
    fun toEntity(model: Language) = LanguageEntity(
        name = model.name,
        url = model.url
    )

}

@Component
class NameAssembler(private val languageAssembler: LanguageAssembler) {
    fun toEntity(model: Name) = NameEntity(
        name = model.name,
        languageEntity = model.language?.let(languageAssembler::toEntity)
    )

}

@Component
class PokemonSpecieAssembler(private val languageAssembler: LanguageAssembler) {
    fun toEntity(model: PokemonSpecie) = PokemonSpecieEntity(
        name = model.name,
        url = model.url
    )

}


















