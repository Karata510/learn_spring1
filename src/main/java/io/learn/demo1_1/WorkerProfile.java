package io.learn.demo1_1;

import io.learn.demo1_1.WorkerPackage.Worker;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class WorkerProfile {
    @Id
    @GeneratedValue
    private int id;
    private String bio;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBio() {
        return bio;
    }
    public void setBio(String bio) {
        this.bio = bio;
    }
    public WorkerProfile(int id, String bio) {
        this.id = id;
        this.bio = bio;
    }
    public WorkerProfile() {
    }
    @Override
    public String toString() {
        return "WorkerProfile [id=" + id + ", bio=" + bio + "]";
    }

    @OneToOne
    @JoinColumn
    private Worker worker;
}
