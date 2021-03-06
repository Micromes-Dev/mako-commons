package net.micromes.makocommons.mevents

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import net.micromes.makocommons.mevents.presence.MPresence
import net.micromes.makocommons.mevents.roommessage.MRoomEncrypted
import net.micromes.makocommons.mevents.roommessage.MRoomMessage
import net.micromes.makocommons.mevents.roommessage.MRoomRedaction
import net.micromes.makocommons.mevents.roomstate.*


/**
 * Representation of a matrix event
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = DefaultEvent::class
)
@JsonSubTypes(
    JsonSubTypes.Type(value = MPresence::class),
    JsonSubTypes.Type(value = MRoomJoinRules::class),
    JsonSubTypes.Type(value = MRoomCreate::class),
    JsonSubTypes.Type(value = MRoomName::class),
    JsonSubTypes.Type(value = MRoomMember::class),
    JsonSubTypes.Type(value = MRoomMessage::class),
    JsonSubTypes.Type(value = MRoomEncrypted::class),
    JsonSubTypes.Type(value = MRoomAvatar::class),
    JsonSubTypes.Type(value = MRoomRedaction::class)
)
interface MatrixEvent {
    val sender: String
    val content: EventContent
}