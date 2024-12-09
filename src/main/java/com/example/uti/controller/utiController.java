package com.example.uti.controller;

import com.example.uti.entity.utiEntity;
import com.example.uti.services.utiServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class utiController {

    // post methods
    @Autowired
    private utiServices services;

    @PostMapping("/addDetail")
    public utiEntity addDetail(@RequestBody utiEntity details){
        return services.saveDetail(details);
    }

    @PostMapping("/addDetails")
    public List<utiEntity> addDetails(List<utiEntity> details) {
        return services.saveDetails(details);
    }

    @GetMapping("/Details")
    public List<utiEntity> findAllDetails(){
        return services.getdetails();
    }
    @GetMapping("/DetailsByID/{id}")
    public utiEntity findDetailsById(@PathVariable  Long id){
        return services.getDetailsById(id);

    }

    @PutMapping("/update")
    public utiEntity updateDetail(@RequestBody utiEntity details){
        return services.updateDetails(details);

    }

    @DeleteMapping("/delete/{id}")
    public String deleteDetails(@PathVariable Long id){
        return services.deleteDetails(id);

    }



}
