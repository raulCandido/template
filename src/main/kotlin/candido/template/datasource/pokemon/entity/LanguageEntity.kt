package candido.template.datasource.pokemon.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class LanguageEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val name: String? = null,
    val url: String? = null,
)