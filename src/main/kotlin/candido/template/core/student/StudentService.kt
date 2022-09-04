package candido.template.core.student

import candido.template.transportlayer.student.StudentRequest

interface StudentService {
    fun getStudents(): List<Student>
    fun saveStudent(student: StudentRequest): Student
}