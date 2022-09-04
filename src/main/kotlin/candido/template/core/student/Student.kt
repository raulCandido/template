package candido.template.core.student

import java.time.LocalDate

interface Student {
    var name: String
    var id: Long?
    var codEnroll: String
    var birthDate: LocalDate?
}

