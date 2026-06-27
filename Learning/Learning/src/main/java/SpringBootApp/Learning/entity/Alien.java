package SpringBootApp.Learning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Alien {
    @Id
    private int id;
    private String name;
    private String tech;
}
