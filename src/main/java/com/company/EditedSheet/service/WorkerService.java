package com.company.EditedSheet.service;

import com.company.EditedSheet.entity.Worker;

import java.util.List;

public interface WorkerService {

    List<Worker> getAllWorkers();

    Worker saveWorkers(Worker workers);

    Worker updateWorkers(Long id, Worker workers);

    Worker getWorkersById(Long id);

    void deleteWorkersById(Long id);

}
