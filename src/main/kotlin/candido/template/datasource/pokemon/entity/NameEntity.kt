package candido.template.datasource.pokemon.entity

import javax.persistence.*


@Entity
data class NameEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val name: String? = null,

    @OneToOne(cascade = [CascadeType.ALL])
    val languageEntity: LanguageEntity? = null,
)