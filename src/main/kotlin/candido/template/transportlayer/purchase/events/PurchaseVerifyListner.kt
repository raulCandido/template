package candido.template.transportlayer.purchase.events

import candido.template.transportlayer.purchase.PurchaseServiceImpl
import org.slf4j.LoggerFactory
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component

@Component
class PurchaseVerifyListner(private val purchaseServiceImpl: PurchaseServiceImpl) {

    @Async
    @EventListener
    fun purchaseVerifyListner(purchaseEvent: PurchaseEvent){
        Thread.sleep(2000)
        LOGGER.info("verificando compra")
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(PurchaseVerifyListner::class.java)
    }
}