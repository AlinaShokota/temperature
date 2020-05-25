package com.example.demo.service;

import com.example.demo.model.Data;
import com.example.demo.repo.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService{

    @Autowired
    private DataRepo dataRepo;

    @Override
    public List<Data> getAllData() {
        return dataRepo.findAll();
    }
}
