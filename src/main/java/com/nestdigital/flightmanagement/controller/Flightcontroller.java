package com.nestdigital.flightmanagement.controller;

import com.nestdigital.flightmanagement.dao.Flightdao;
import com.nestdigital.flightmanagement.model.Flightmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
public class Flightcontroller {


    @Autowired
    private Flightdao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/flightAdd",consumes = "application/json",produces = "application/json")
    public  String flightAdd(@RequestBody Flightmodel flight){
        System.out.println(flight.toString());
        dao.save(flight);
        return "{status:success}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewflight")
    public List<Flightmodel> viewFlight(){
        return (List<Flightmodel>) dao.findAll();
    }
}
