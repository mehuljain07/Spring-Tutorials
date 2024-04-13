package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope(value = "prototype")
public class Alien {
    private int id;
    private String name;
    private String tech;
    @Autowired
    @Qualifier("lap1")
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Alien(){
        super();
        System.out.println("Object Created");
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getTech(){
        return tech;
    }

    public void setTech(String newTech){
        this.tech = newTech;
    }

    public void show(){
        System.out.println("In show");
        laptop.compile();
    }

}
