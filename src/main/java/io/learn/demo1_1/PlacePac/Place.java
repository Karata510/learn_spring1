package io.learn.demo1_1.PlacePac;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.learn.demo1_1.WorkerPackage.Worker;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Place {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    
    public Place(int id, String name) {
        this.id = id;
        this.name = name;
    }

    

    public Place() {
    }



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Place [id=" + id + ", name=" + name + "]";
    }

    @OneToMany(
        mappedBy = "place"
    )
    @JsonManagedReference
    private List<Worker> workers;
    
}
