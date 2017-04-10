package com.rz.controller;

import com.rz.entity.City;
import com.rz.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhou on 2017/4/10.
 */
@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/api/citys")
    public List<City> list(){
        return cityService.findAllCity();
    }

    @GetMapping("/api/city/{id}")
    public City getOneById(@PathVariable Long id){
        return cityService.findCityById(id);
    }
}
