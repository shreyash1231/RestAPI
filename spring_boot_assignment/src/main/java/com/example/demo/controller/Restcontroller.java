package com.example.demo.controller;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.Ser;
import com.example.demo.entity.shippment;
@RestController
public class Restcontroller {
    @Autowired
    private Ser service;
    @PostMapping("/load")
    public String data(@RequestBody shippment info)
    {
        service.data(info);
        return "loads details added successfully";
    }
    @GetMapping("/load/{loadid}")
    public shippment display(@PathVariable("loadid") Long id)
    {
        return service.display(id);
    }
    @PutMapping("/load/{loadid}")
    public shippment update(@PathVariable("loadid") Long id,@RequestBody shippment info)
    {
        shippment details = service.getLoadById(id);
        if (details != null) {
            details.setLoadingPoint(info.getLoadingPoint());
            details.setUnloadingPoint(info.getUnloadingPoint());
            details.setProductType(info.getProductType());
            details.setTruckType(info.getTruckType());
            details.setNoOfTrucks(info.getNoOfTrucks());
            details.setWeight(info.getWeight());
            details.setComment(info.getComment());
            details.setDate(info.getDate());
        }
        return service.saveLoad(details);
    }
    @DeleteMapping("/load/{loadid}")
    public String del(@PathVariable("loadid") Long id)
    {
        service.del(id);
        return "Deleted successfully";
    }
}   
