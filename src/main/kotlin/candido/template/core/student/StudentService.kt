package candido.template.core.student

import candido.template.datasource.purchase.PurchaseEntity
import candido.template.datasource.student.StudentEntity
import candido.template.transportlayer.student.StudentRequest

interface StudentService {

    fun getStudents(): MutableList<StudentEntity>
    fun saveStudent(student: StudentRequest): Student

}