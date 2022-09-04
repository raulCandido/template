package candido.template.transportlayer.purchase

import candido.template.datasource.purchase.PurchaseEntity
import com.fasterxml.jackson.annotation.JsonAlias
import org.jetbrains.annotations.NotNull

data class PurchaseRequest (

    @field:NotNull
    @JsonAlias("customer_id")
    val customerId: String,

    @field:NotNull
    @JsonAlias("book_id")
    val bookIds: String
){
    fun toEntity(): PurchaseEntity = PurchaseEntity(null, customerId, bookIds)
}
