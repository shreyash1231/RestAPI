package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.shippment;

@Repository
public interface Dao extends JpaRepository<shippment,Long> {
   @Query(value="select * from shippment where id =:shipper or shipper_id=:shipper", nativeQuery=true)
   public shippment findid(@Param("shipper")Long shipperid); 
}

