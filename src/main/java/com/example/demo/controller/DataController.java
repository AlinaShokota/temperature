package com.example.demo.controller;

import com.example.demo.model.Data;
import com.example.demo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
@CrossOrigin(origins = "*")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/all")
    public ResponseEntity<List<Data>> getAllData(){
        return ResponseEntity.ok(dataService.getAllData());
    }

//    @GetMapping("/latest")
//    public ResponseEntity<Data> getLatestData(){
//        List<Data> allData = dataService.getAllData();
//        Data latestData = allData.get(allData.size() - 1);
//        return ResponseEntity.ok(latestData);
//    }

    @GetMapping("/latest")
    public ResponseEntity<Float> getLatestData(){
        List<Data> allData = dataService.getAllData();
        Data latestData = allData.get(allData.size() - 1);
        return ResponseEntity.ok(latestData.getTValue());
    }

}
