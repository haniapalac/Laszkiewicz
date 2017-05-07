package pl.laszkiewicz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operator {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private String imie;
    private String nazwisko;
    private String inicjaly;
    private Integer wiek;
    private Integer numerTelefonu;

    public Operator() {
    }
}