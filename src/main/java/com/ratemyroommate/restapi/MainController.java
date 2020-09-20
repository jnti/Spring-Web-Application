package com.ratemyroommate.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/home")
public class MainController {
    @Autowired
    private Repository repository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewRoommate(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String schoolName,
                                               @RequestParam SchoolYear schoolYear, @RequestParam Integer rating, @RequestParam Boolean roomAgain,
                                               @RequestParam String description) {
        Roommate r = new Roommate();
        r.setFirstName(firstName);
        r.setLastName(lastName);
        r.setSchoolName(schoolName);
        r.setSchoolYear(schoolYear);
        r.setRating(rating);
        r.setRoomAgain(roomAgain);
        r.setDescription(description);
        repository.save(r);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Roommate> getAllRoommate() {
        return repository.findAll();
    }
}
