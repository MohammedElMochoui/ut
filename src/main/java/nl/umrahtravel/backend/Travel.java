package nl.umrahtravel.backend;

import jakarta.persistence.*;

@Entity
@Table(name = "travels")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer adults;
    private Integer children;
    private Integer childrenNoBed;
    private Integer babies;

    @Enumerated(EnumType.STRING)
    private RoomType roomType;
    private Integer nonEuTravelers;
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Travel() {
    }

    public Travel(Long id, Integer adults, Integer children, Integer childrenNoBed, Integer babies, RoomType roomType, Integer nonEuTravelers, Double price) {
        this.id = id;
        this.adults = adults;
        this.children = children;
        this.childrenNoBed = childrenNoBed;
        this.babies = babies;
        this.roomType = roomType;
        this.nonEuTravelers = nonEuTravelers;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public Integer getChildrenNoBed() {
        return childrenNoBed;
    }

    public void setChildrenNoBed(Integer childrenNoBed) {
        this.childrenNoBed = childrenNoBed;
    }

    public Integer getBabies() {
        return babies;
    }

    public void setBabies(Integer babies) {
        this.babies = babies;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Integer getNonEuTravelers() {
        return nonEuTravelers;
    }

    public void setNonEuTravelers(Integer nonEuTravelers) {
        this.nonEuTravelers = nonEuTravelers;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Travel travel = (Travel) o;
        return id.equals(travel.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Travel{" +
                "id=" + id +
                ", adults=" + adults +
                ", children=" + children +
                ", childrenNoBed=" + childrenNoBed +
                ", babies=" + babies +
                ", roomType=" + roomType +
                ", nonEuTravelers=" + nonEuTravelers +
                '}';
    }
}
