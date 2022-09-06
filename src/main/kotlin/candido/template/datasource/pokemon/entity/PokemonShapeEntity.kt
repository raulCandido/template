package candido.template.datasource.pokemon.entity

import javax.persistence.*

@Entity
@Table(name = "pokemon_specie")
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

