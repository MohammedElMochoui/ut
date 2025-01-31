package nl.umrahtravel.backend;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {
    private final TravelRepository travelRepository;

    public TravelService(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }

    public Double createTravel(CreateTravelDTO travelInfo) {
        Double price = calculatePrice(travelInfo);
        Travel t = new Travel(
                null,
                travelInfo.getAdults(),
                travelInfo.getChildren(),
                travelInfo.getChildrenNoBed(),
                travelInfo.getBabies(),
                travelInfo.getRoomType(),
                travelInfo.getNonEuTravelers(),
                price
        );

        return this.travelRepository.save(t).getPrice();
    }

    public List<CreatedTravelDTO> getAllTravels() {
        List<Travel> travels = this.travelRepository.findAll();
        return travels.stream().map(t -> new CreatedTravelDTO(
                t.getAdults(),
                t.getChildren(),
                t.getChildrenNoBed(),
                t.getBabies(),
                t.getRoomType(),
                t.getNonEuTravelers(),
                t.getPrice()
        )).toList();
    }

    public void deleteAllTravels() {
        this.travelRepository.deleteAll();
    }

    private Double calculatePrice(CreateTravelDTO t) {
        return t.getAdults() * 2000.0 +
                t.getChildren() * 2000.0 +
                t.getBabies() * 450.0 +
                t.getNonEuTravelers() * 350.0;
    }
}
