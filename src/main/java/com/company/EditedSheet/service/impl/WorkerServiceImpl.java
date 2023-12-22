package com.company.EditedSheet.service.impl;

import com.company.EditedSheet.entity.Worker;
import com.company.EditedSheet.repository.WorkerRepository;
import com.company.EditedSheet.service.WorkerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    private final WorkerRepository allWorkerRepository;

    public WorkerServiceImpl(WorkerRepository allWorkerRepository) {
        super();
        this.allWorkerRepository = allWorkerRepository;
    }

    @Override
    public List<Worker> getAllWorkers() {
        return allWorkerRepository.findAll();
    }

    @Override
    public Worker saveWorkers(Worker workers) {
        return allWorkerRepository.save(workers);
    }

    @Override
    public Worker getWorkersById(Long id) {
        return allWorkerRepository.findById(id).get();
    }

    @Override
    public Worker updateWorkers(Long id, Worker workers) {
//        return allWorkerRepository.save(workers);
        Worker existingWorker = allWorkerRepository.findById(id).get();
        existingWorker.setFirstName(workers.getFirstName());
        existingWorker.setLastname(workers.getLastname());
        existingWorker.setNumber(workers.getNumber());
        existingWorker.setEmail(workers.getEmail());
        existingWorker.setMarineDaysOn(workers.getMarineDaysOn());
        existingWorker.setTrainingDays(workers.getTrainingDays());
        existingWorker.setSickDays(workers.getSickDays());
        existingWorker.setVacationDays(workers.getVacationDays());
        existingWorker.setUnpaidWorkingDays(workers.getUnpaidWorkingDays());
        existingWorker.setEducationalVacation(workers.getEducationalVacation());
        existingWorker.setUsername(workers.getUsername());
        existingWorker.setPassword(workers.getPassword());
        return allWorkerRepository.save(existingWorker);
    }

    @Override
    public void deleteWorkersById(Long id) {
        allWorkerRepository.deleteById(id);
    }

}
