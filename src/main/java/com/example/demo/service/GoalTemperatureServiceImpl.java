package com.example.demo.service;

import com.example.demo.model.GoalTemperature;
import com.example.demo.repo.GoalTemperatureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalTemperatureServiceImpl implements GoalTemperatureService{

    @Autowired
    GoalTemperatureRepo goalTemperatureRepo;

    @Override
    public void addGoalTemp(GoalTemperature goalTemperature) {
        goalTemperatureRepo.save(goalTemperature);
    }
}
