package app.qienuren.rest;

import app.qienuren.controller.PersoonService;

import app.qienuren.model.Persoon;
//import app.qienuren.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserEndpoint {

    @Autowired
    PersoonService persoonService;

    @PostMapping("/add")
    public Persoon newTrainee(@RequestBody Persoon persoon) {
        //persoon.setEmail(persoon.getUserName());
        return persoonService.addPersoon(persoon);
    }

    @GetMapping("/test")
    public String test(){return "het werkt";}

}


