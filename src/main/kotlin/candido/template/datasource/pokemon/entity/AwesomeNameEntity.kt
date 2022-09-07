package candido.template.datasource.pokemon.entity

import javax.persistence.*

@Entity
@Table(name = "awesome_name")
data class AwesomeNameEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String? = null,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "language_id", referencedColumnName = "id")
    val languageEntity: LanguageEntity? = null,
)