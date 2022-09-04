package candido.template.transportlayer.purchase.events

import candido.template.datasource.purchase.PurchaseEntity
import org.springframework.context.ApplicationEvent

class PurchaseEvent (source: Any, val purchaseEntity: PurchaseEntity): ApplicationEvent(source)