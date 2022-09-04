package candido.template.transportlayer.student

import candido.template.core.student.Student
import candido.template.core.student.StudentController
import candido.template.datasource.student.StudentServiceImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/students")
class StudentControllerImpl(
    val service: StudentServiceImpl
): StudentController {

    @GetMapping
    override fun getStudent(): List<Student> = service.getStudents()

    @PostMapping
    fun saveStudent(@RequestBody student: StudentRequest): Student = service.saveStudent(student);
}