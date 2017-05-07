package pl.laszkiewicz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicles {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private String id;
    private String nazwa;

    public Vehicles() {
    }
}