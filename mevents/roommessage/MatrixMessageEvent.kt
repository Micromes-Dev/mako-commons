package net.micromes.makocommons.mevents.roommessage

import net.micromes.makocommons.mevents.MatrixRoomEvent

/**
 * Represents a matrix event of type room message event
 */
interface MatrixMessageEvent : MatrixRoomEvent {
    val id: String
    override val content: MessageEventContent
}