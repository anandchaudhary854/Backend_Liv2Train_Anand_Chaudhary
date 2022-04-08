package com.exampleSenpiper.senPiper.service;

import com.exampleSenpiper.senPiper.model.Center;
import com.exampleSenpiper.senPiper.repository.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CenterServiceImpl implements CenterService {

    @Autowired
    CenterRepository centerRepository;

    @Override
    public void save(Center center){
        this.centerRepository.save(center);
    }

    @Override
    public List<Center> findAll(){
        List<Center> allCenters = centerRepository.findAll();
        return allCenters;
    }

}
