package com.company.EditedSheet.controller;

import com.company.EditedSheet.entity.Worker;
import com.company.EditedSheet.service.WorkerService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class WorkerController {

    private final WorkerService workersService;

    public WorkerController(WorkerService workersService) {
        super();
        this.workersService = workersService;
    }

    //Get:  Brings all data
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping(value = "/workers", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Worker> listWorkers() {
        return workersService.getAllWorkers();
    }


    //Post: Posting a new data
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/workers")
    public void saveWorkers(@RequestBody Worker workers) {
        workersService.saveWorkers(workers);
    }

    //Put: Updates the current data
    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/workers/{wId}")
    public Worker updateWorker(@PathVariable Long wId, @RequestBody Worker workerRequest) {
        return workersService.updateWorkers(wId, workerRequest);
    }


    //Get: Get selected data by id
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/worker/{id}")
    public Worker findWorkerById(@PathVariable long id) {
        return workersService.getWorkersById(id);
    }


    //Delete: Deletes a data by id
    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/workers/{id}")
    public void DELETE(@PathVariable Long id) {
        workersService.deleteWorkersById(id);
    }

}
