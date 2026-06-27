package SpringBootApp.Learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootApp.Learning.entity.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
    // Write now don't write any code here
    
}
