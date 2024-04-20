package com.example.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springmvc.model.Alien;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




// @Controller -> Used for MVC controller. Can return data in both response body and views.
@RestController
public class AlienController {
    @Autowired
    AlienRepo repo;

    @GetMapping(path="aliens", produces={"xml"})
    @ResponseBody
    public List<Alien> getAliens() {
        return repo.findAll();
    }

    @GetMapping("alien/{aid}")
    @ResponseBody
    public Alien getAlienById(@PathVariable("aid") int aid) {
        return repo.findById(aid).orElse(new Alien());
    }

    @PostMapping(path="alien", consumes={"json"})
    public Alien addAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }
    
    
}
