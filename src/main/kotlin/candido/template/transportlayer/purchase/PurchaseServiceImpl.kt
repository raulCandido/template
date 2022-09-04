package candido.template.transportlayer.purchase

import candido.template.datasource.purchase.PurchaseEntity
import candido.template.datasource.purchase.PurchaseRepository
import candido.template.transportlayer.purchase.events.PurchaseEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class PurchaseServiceImpl(private val purchaseRepository: PurchaseRepository,
                          private val applicationEventPublisher: ApplicationEventPublisher
) {
    fun createEvent(purchaseEntity: PurchaseEntity) =
        applicationEventPublisher.publishEvent(PurchaseEvent(this, purchaseEntity))

    fun saveEvent(purchaseEntity: PurchaseEntity) =
        purchaseRepository.save(purchaseEntity)


}
