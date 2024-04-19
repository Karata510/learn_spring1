package io.learn.demo1_1.PlacePac;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PlaceController {

    private final PlaceRepo repository;

    
    
    public PlaceController(PlaceRepo repository) {
        this.repository = repository;
    }



   @PostMapping("post1")
   @ResponseBody
   public Place savePlace(@RequestBody Place place) {
       //TODO: process POST request
       
       return repository.save(place);
   }
   

    @GetMapping("places")
    @ResponseBody
    public List<Place> getPlaces() {
        return repository.findAll();
    }
    
    
}
