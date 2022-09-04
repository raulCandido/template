package candido.template.transportlayer.student

import candido.template.core.student.Student
import candido.template.core.student.StudentService
import candido.template.datasource.purchase.PurchaseEntity
import candido.template.datasource.student.StudentEntity
import candido.template.datasource.student.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl(val repository: StudentRepository): StudentService {
    override fun getStudents(): MutableList<StudentEntity> = repository.findAll();
    override fun saveStudent(student: StudentRequest): Student = repository.save(student.toEntity());
}