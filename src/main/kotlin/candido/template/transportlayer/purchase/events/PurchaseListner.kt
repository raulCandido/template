package candido.template.transportlayer.purchase.events

import candido.template.transportlayer.purchase.PurchaseServiceImpl
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class PurchaseListner(private val purchaseServiceImpl: PurchaseServiceImpl) {

    @Async
    @EventListener
    fun purchaseConfirmListner(purchaseEvent: PurchaseEvent){
        Thread.sleep(2000)
        LOGGER.info("Class: PurchaseListner | method: purchaseConfirmListner")
        LOGGER.info("consumindo mensagem: {}", purchaseEvent.purchaseEntity)
        purchaseServiceImpl.saveEvent(purchaseEvent.purchaseEntity)
        LOGGER.info("mensagem salva")
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(PurchaseListner::class.java)
    }
}