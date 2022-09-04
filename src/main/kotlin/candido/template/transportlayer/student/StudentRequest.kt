package candido.template.transportlayer.student

import candido.template.datasource.student.StudentEntity
import java.time.LocalDate

data class StudentRequest(
    val name: String,
    val codEnroll: String,
    val birthDate: LocalDate? = null,

){
    fun toEntity(): StudentEntity{

        return StudentEntity(null ,codEnroll, null, name)
    }
}

