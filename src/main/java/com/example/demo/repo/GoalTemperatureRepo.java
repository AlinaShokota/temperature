package com.example.demo.repo;

import com.example.demo.model.GoalTemperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalTemperatureRepo extends JpaRepository<GoalTemperature, Integer> {
}
