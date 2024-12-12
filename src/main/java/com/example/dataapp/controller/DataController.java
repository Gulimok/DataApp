package com.example.dataapp.controller;

import com.example.dataapp.model.Mydata;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {

    private final List<Mydata> dataList = new ArrayList<>();

    @PostMapping("/add")
    public String addData(@RequestBody Mydata data) {
        dataList.add(data);
        return "Data added successfully!";
    }

    @GetMapping("/list")
    public List<Mydata> listData() {
        return dataList;
    }
}
