package com.example.demo.entity;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "shippment")
public class shippment{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private int noOfTrucks;
    private int weight;
    private String comment;
   // @JsonFormat(pattern = "yyyy-MM-dd",shape=Shape.STRING)
   @Column(name="day")
    private LocalDate date;
    private Long shipperId;
     public  shippment() {
        super();
    }
    public shippment(Long id, String loadingPoint, String unloadingPoint, String productType, String truckType,
            int noOfTrucks, int weight, String comment, LocalDate day, Long shipperId) {
        this.id = id;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.date = date;
        this.shipperId = shipperId;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLoadingPoint() {
        return loadingPoint;
    }
    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }
    public String getUnloadingPoint() {
        return unloadingPoint;
    }
    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public String getTruckType() {
        return truckType;
    }
    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }
    public int getNoOfTrucks() {
        return noOfTrucks;
    }
    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Long getShipperId() {
        return shipperId;
    }
    public void setShipperId(Long shipperId) {
        this.shipperId = shipperId;
    }
}

