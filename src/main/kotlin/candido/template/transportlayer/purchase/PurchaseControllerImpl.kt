package candido.template.transportlayer.purchase

import candido.template.transportlayer.purchase.events.PurchaseListner
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.scheduling.annotation.Async
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/purchases")
class PurchaseControllerImpl(val purchaseService: PurchaseServiceImpl) {

    @PostMapping
    fun purchase(@RequestBody purchaseRequest: PurchaseRequest): ResponseEntity<Unit> {
        LOGGER.info("PurchaseControllerImpl | purchase")
        purchaseService.createEvent(purchaseRequest.toEntity())
        return ResponseEntity.noContent().build()
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(PurchaseControllerImpl::class.java)
    }
}
