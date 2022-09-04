package candido.template.datasource.student

import candido.template.core.student.Student
import candido.template.core.student.StudentService
import candido.template.transportlayer.student.StudentRequest
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl(val repository: StudentRepository): StudentService {
    override fun getStudents(): List<StudentEntity> = repository.findAll();
    override fun saveStudent(student: StudentRequest): Student = repository.save(student.toEntity());
}