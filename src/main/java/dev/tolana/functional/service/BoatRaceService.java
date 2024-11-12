package dev.tolana.functional.service;

import dev.tolana.functional.model.BoatRace;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class BoatRaceService {


    public List<BoatRace> createBoatRacesFromRange(LocalDate startDate, LocalDate endDate) {
        List<BoatRace> boatRaces = startDate.datesUntil(endDate)
                .filter(date -> date.getDayOfWeek() == DayOfWeek.WEDNESDAY)
                .map(date -> new BoatRace())
    }

}
