package nl.umrahtravel.backend;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateTravelDTO {
    final private Integer adults;
    final private Integer children;
    @JsonProperty("children_no_bed")
    final private Integer childrenNoBed;
    final private Integer babies;
    @JsonProperty("room_type")
    final private RoomType roomType;
    @JsonProperty("non_eu_travelers")
    final private Integer nonEuTravelers;

    public CreateTravelDTO(Integer adults, Integer children, Integer childrenNoBed, Integer babies, RoomType roomType, Integer nonEuTravelers) {
        this.adults = adults;
        this.children = children;
        this.childrenNoBed = childrenNoBed;
        this.babies = babies;
        this.roomType = roomType;
        this.nonEuTravelers = nonEuTravelers;
    }

    public Integer getAdults() {
        return adults;
    }

    public Integer getChildren() {
        return children;
    }

    public Integer getChildrenNoBed() {
        return childrenNoBed;
    }

    public Integer getBabies() {
        return babies;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Integer getNonEuTravelers() {
        return nonEuTravelers;
    }
}
