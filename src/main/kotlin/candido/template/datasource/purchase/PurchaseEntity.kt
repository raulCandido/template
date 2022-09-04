package candido.template.datasource.purchase

import javax.persistence.*

@Entity
@Table(name = "purchase")
data class PurchaseEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "customer_id", length = 36)
    var customerId: String,

    @Column(name = "book_id", length = 36)
    var codEnroll: String,

    )
