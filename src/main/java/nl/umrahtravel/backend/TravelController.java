package nl.umrahtravel.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelController {
    final private TravelService travelService;

    public TravelController(TravelService travelService) {
        this.travelService = travelService;
    }

    @PostMapping
    public CreatedTravelDTO createTravel(@RequestBody CreateTravelDTO travelInfo) {
        return new CreatedTravelDTO(travelInfo, this.travelService.createTravel(travelInfo));
    }

    @GetMapping
    public List<CreatedTravelDTO> getAllTravels() {
        return this.travelService.getAllTravels();
    }

}
