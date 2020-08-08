package net.micromes.makocommons.mevents.roomstate

import net.micromes.makocommons.mevents.EventContent
import net.micromes.makocommons.mevents.MatrixRoomEvent

interface MatrixStateEvent : MatrixRoomEvent {
    val stateKey: String
    val prevContent: EventContent?
    val id: String?
    override val content: StateEventContent
}