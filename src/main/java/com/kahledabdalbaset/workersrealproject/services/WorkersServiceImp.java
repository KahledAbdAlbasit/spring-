package com.kahledabdalbaset.workersrealproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kahledabdalbaset.workersrealproject.models.Workers;
import com.kahledabdalbaset.workersrealproject.repository.WorkerRepository;

@Service
public class WorkersServiceImp implements WorkerService{
    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public List<Workers> getAllWorkers() {
        return workerRepository.findAll();
    }
}
