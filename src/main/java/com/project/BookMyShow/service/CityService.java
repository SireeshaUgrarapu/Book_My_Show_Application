package com.project.BookMyShow.service;


import com.project.BookMyShow.dto.CityRequestDTO;
import com.project.BookMyShow.model.City;
import com.project.BookMyShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City saveCity(String cityName){
        City city = new City();
        city.setName(cityName);// once i have object i need to save it in repository
        return cityRepository.save(city);
    }

    public boolean deleteCity(int cityId){
        cityRepository.deleteById(cityId);
        return  true;
    }

    public City getCityByName(String cityName){
        City city= cityRepository.findCityByName(cityName);
        return city;
    }

    public List<City> getAllCities(){
        return cityRepository.findAll();
    }

    public City getCityById(int cityId){
        return cityRepository.findById(cityId).get();
    }

    public City saveCity(City city){
        return  cityRepository.save(city);
    }


}
