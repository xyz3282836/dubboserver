package com.rz.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.rz.dao.CityDao;
import com.rz.entity.City;
import com.rz.dubbo.CityDubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ruizhouliu on 2017/2/13.
 */
@Service(version="1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findCityByName(String cityName) {
//        return new City(1L,2L,"温岭","是我的故乡");
        return cityDao.findByName(cityName);
    }

    @Override
    public List<City> findAllCity() {
        return cityDao.findAllCity();
    }

    @Override
    public City findCityById(Long id) {
        return cityDao.findById(id);
    }

    @Override
    public Long saveCity(City city) {
        return cityDao.saveCity(city);
    }

    @Override
    public Long updateCity(City city) {
        return cityDao.updateCity(city);
    }

    @Override
    public Long deleteCity(Long id) {
        return cityDao.deleteCity(id);
    }



}
