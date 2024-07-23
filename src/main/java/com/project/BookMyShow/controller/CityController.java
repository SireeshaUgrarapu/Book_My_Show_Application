package com.project.BookMyShow.controller;

import com.project.BookMyShow.dto.CityRequestDTO;
import com.project.BookMyShow.model.City;
import com.project.BookMyShow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO){
        try{
            String cityName = cityRequestDTO.getName();
            if(cityName == null || cityName.isEmpty() || cityName.isBlank()){
                throw new Exception("City name is invalid");
            }
            City savedCity = cityService.saveCity(cityName);
            return ResponseEntity.ok(savedCity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/city/{name}")
    public ResponseEntity getCityByName(@PathVariable("name") String cityName){
        City savedCity = cityService.getCityByName(cityName);
        return ResponseEntity.ok(savedCity);  // we would return cityResponseDTO
    }

    @DeleteMapping("/city/{id}")
    public ResponseEntity deleteCity(@PathVariable("id") int cityId){
        boolean isDeleted = cityService.deleteCity(cityId);
        return ResponseEntity.ok(isDeleted);
    }
}
//"" ->empty
//"     " -> blank