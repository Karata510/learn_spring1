package io.learn.demo1_1.WorkerPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import io.learn.demo1_1.PlacePac.Place;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WorkerController {

    private final WorkerRepo applicationRepo;

    public WorkerController(WorkerRepo applicationRepo) {
        this.applicationRepo = applicationRepo;
    }

    @GetMapping("student")
    @ResponseBody
    public Worker getWorker(@RequestParam WorkerDto worker) {
        return null;
    }
    


    private Worker toWorker(WorkerDto dto){
        var worker = new Worker();
        worker.setName(dto.name());

        var place = new Place();
        place.setId(dto.placeId());

        worker.setPlace(place);

        return worker;
    }

    @PostMapping("/post")
    @ResponseBody
    public Worker post(@RequestBody WorkerDto dto) {

        var worker = toWorker(dto);
        Worker savedEmployee = applicationRepo.save(worker);
        return savedEmployee;
    }
}
