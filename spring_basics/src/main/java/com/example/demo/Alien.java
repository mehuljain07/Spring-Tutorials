package com.example.demo;

// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope(value = "prototype")
public class Alien {
    private int id;
    private int age;
    private String name;
    private String tech;
    // @Qualifier("lap1")
    private Computer com;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Computer getCom() {
        return this.com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Alien(){
        super();
        System.out.println("Object Created");
    }
// named constructor
    // public Alien(int age){
    //     this.age = age;
    // }

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
        // System.out.println(this.tech);
        System.out.println(this.age);
        com.compile();
    }

}
