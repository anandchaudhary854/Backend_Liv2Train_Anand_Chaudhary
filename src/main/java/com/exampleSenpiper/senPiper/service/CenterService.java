package com.exampleSenpiper.senPiper.service;

import com.exampleSenpiper.senPiper.model.Center;

import java.util.ArrayList;
import java.util.List;

public interface CenterService {
    void save(Center center);
    List<Center> findAll();
}
