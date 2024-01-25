package com.example.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Dao;
import com.example.demo.entity.shippment;
@Service
public class Ser {
    @Autowired
    Dao dao;
    public void data(shippment info) {
        dao.save(info);
    }
    public void del(Long id) {
        dao.deleteById(id);
    }
    public shippment saveLoad(shippment details) {
        return dao.save(details);
    }
    public shippment getLoadById(Long id) {
        return dao.findById(id).get();
    }
    public shippment display(Long id) {
        return dao.findid(id);
    }    
}

