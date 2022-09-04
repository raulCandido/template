package candido.template.datasource.student

import candido.template.core.student.Student
import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "Student")
data class StudentEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    override var id: Long? = null,

    @Column(name = "cod_enroll", length = 36)
    override var codEnroll: String,

    @Column(name = "birth_date")
    override var birthDate: LocalDate? = null,

    @Column(name = "name")
    override var name: String
    ): Student
