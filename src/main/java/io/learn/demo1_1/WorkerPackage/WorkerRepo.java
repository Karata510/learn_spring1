package io.learn.demo1_1.WorkerPackage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepo extends JpaRepository<Worker,Integer>{
    
}
