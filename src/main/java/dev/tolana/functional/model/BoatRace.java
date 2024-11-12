package dev.tolana.functional.model;

import dev.tolana.functional.enums.BoatType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class BoatRace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private BoatType boatType;
    private Date date;
}
