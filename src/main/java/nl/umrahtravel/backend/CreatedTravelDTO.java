package nl.umrahtravel.backend;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatedTravelDTO {
    final private Integer adults;
    final private Integer children;
    @JsonProperty("children_no_bed")
    final private Integer childrenNoBed;
    final private Integer babies;
    @JsonProperty("room_type")
    final private RoomType roomType;
    @JsonProperty("non_eu_travelers")
    final private Integer nonEuTravelers;
    final private Double price;

    public CreatedTravelDTO(CreateTravelDTO travelInfo, Double price) {
        this.adults = travelInfo.getAdults();
        this.children = travelInfo.getChildren();
        this.childrenNoBed = travelInfo.getChildrenNoBed();
        this.babies = travelInfo.getBabies();
        this.roomType = travelInfo.getRoomType();
        this.nonEuTravelers = travelInfo.getNonEuTravelers();
        this.price = price;
    }

    public CreatedTravelDTO(Integer adults, Integer children, Integer childrenNoBed, Integer babies, RoomType roomType, Integer nonEuTravelers, Double price) {
        this.adults = adults;
        this.children = children;
        this.childrenNoBed = childrenNoBed;
        this.babies = babies;
        this.roomType = roomType;
        this.nonEuTravelers = nonEuTravelers;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }
}
