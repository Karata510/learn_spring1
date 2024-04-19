package io.learn.demo1_1.WorkerPackage;

import com.fasterxml.jackson.annotation.JsonBackReference;

import io.learn.demo1_1.WorkerProfile;
import io.learn.demo1_1.PlacePac.Place;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private String department;

    
    public Worker() {
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
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
    }

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private Place place;

    @OneToOne(
        mappedBy = "worker"
    )
    @JoinColumn
    private WorkerProfile workerProfile;



    public Place getPlace() {
        return place;
    }


    public void setPlace(Place place) {
        this.place = place;
    }


    public WorkerProfile getWorkerProfile() {
        return workerProfile;
    }


    public void setWorkerProfile(WorkerProfile workerProfile) {
        this.workerProfile = workerProfile;
    }


    public Worker(int id, String name, String department, Place place, WorkerProfile workerProfile) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.place = place;
        this.workerProfile = workerProfile;
    }

    

}
