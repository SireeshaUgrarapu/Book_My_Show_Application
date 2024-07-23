package com.project.BookMyShow.service;

import com.project.BookMyShow.model.City;
import com.project.BookMyShow.model.Theatre;
import com.project.BookMyShow.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InitService {
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private TheatreRepository theatreRepository;
    @Autowired
    private AuditoriumRepository auditoriumRepository;
    @Autowired
    private ShowRepository showRepository;
    @Autowired
    private SeatRepository seatRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ShowSeatRepository showSeatRepository;


    public boolean initialise() {
        City delhi = new City("Delhi");
        City bangalore = new City("Bangalore");
        City canberra = new City("Canberra");

        cityRepository.save(delhi);
        cityRepository.save(bangalore);
        cityRepository.save(canberra);

        City savedDelhi = cityRepository.findCityByName("Delhi");
        Theatre ashishTheatre = new Theatre("AshishMultiplex", "CP, Delhi");
        Theatre nithinTheatre = new Theatre("NithinIMAX", "Select City, Delhi");

        theatreRepository.save(ashishTheatre);
        theatreRepository.save(nithinTheatre);

        Theatre savedAshishTheatre = theatreRepository.findTheatreByName("AshishMultiplex");
        Theatre savedNithinTheatre = theatreRepository.findTheatreByName("NithinIMAX");

        List<Theatre> delhiTheatres = new ArrayList<>();
        delhiTheatres.add(savedAshishTheatre);
        delhiTheatres.add(savedNithinTheatre);
        savedDelhi.setTheatres(delhiTheatres);
        cityRepository.save(savedDelhi);
        return true;
    }
}
