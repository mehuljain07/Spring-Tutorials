package com.example.demo;

import org.springframework.stereotype.Component;

// @Component("lap1")
@Component
public class Desktop implements Computer{
    private int id;
    private String brand;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void compile(){
        System.out.println("Compiliing on a Desktop");
    }
    

    
}
