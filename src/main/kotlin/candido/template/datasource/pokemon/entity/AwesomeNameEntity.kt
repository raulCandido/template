package candido.template.datasource.pokemon.entity

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
data class AwesomeNameEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String? = null,

    @OneToOne(cascade = [CascadeType.ALL])
    val languageEntity: LanguageEntity? = null,
)