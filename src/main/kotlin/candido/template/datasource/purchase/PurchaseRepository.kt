package candido.template.datasource.purchase

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PurchaseRepository: JpaRepository<PurchaseEntity, Long> {
}