package dev.tolana.functional.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;

@RequiredArgsConstructor
@Component
public class CodeRunner implements CommandLineRunner {

    private final BoatRaceService boatRaceService;


    @Override
    public void run(String... args) throws Exception {
        boatRaceService.createBoatRacesFromRange(LocalDate.of(2024, Month.MAY,1),LocalDate.of(2024, Month.OCTOBER,1)).forEach(System.out::println);
    }
}
