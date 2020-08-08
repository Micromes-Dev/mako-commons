package net.micromes.makocommons.mevents.roomstate

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName
import net.micromes.makocommons.mevents.ContentEventType
import de.mtorials.dialphone.enums.JoinRule

@JsonTypeName("m.room.join_rules")
class MRoomJoinRules(
    override val sender: String,
    @JsonProperty("event_id")
    override val id: String?,
    override val content: Content,
    @JsonProperty("state_key")
    override val stateKey: String,
    @JsonProperty("prev_content")
    override val prevContent: Content?
) : MatrixStateEvent {
    @ContentEventType(MRoomJoinRules::class)
    data class Content(
        @JsonProperty("join_rule")
        val joinRule: JoinRule
    ) : StateEventContent
}