package SpringBootApp.Learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApp.Learning.entity.Alien;
import SpringBootApp.Learning.repository.AlienRepo;


@RestController
@RequestMapping("/aliens")
public class AlienController {
    @Autowired
    AlienRepo repo;

    // Now for Getmapping
    @GetMapping
    public List<Alien> getAliens() {
        return repo.findAll();
    }
    
    @PostMapping
    public Alien addAlien(@RequestBody Alien alien) {
        repo.save(alien);
        return alien;
    }


    //Get Request: Fetch a specific alien by ID
    @GetMapping("/{id}")
    public Alien getAlienById(@PathVariable int id) {
        return repo.findById(id).orElse(new Alien());
    }


    // Now if i need to update the details inside the Code what should i do next
    @PutMapping("/{id}")
    public Alien updateAlien(@RequestBody Alien alien,@PathVariable String id, @RequestBody String entity) {
        // I am setting the ID from my side
        
        return entity;
    }

    
    
}
