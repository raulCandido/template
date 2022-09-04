package candido.template.datasource.student

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository: JpaRepository<StudentEntity, Long> {
}