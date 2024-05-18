package com.kahledabdalbaset.workersrealproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kahledabdalbaset.workersrealproject.services.WorkerService;

@Controller
public class WorkersController {
    @Autowired
    private WorkerService workerService;

    @GetMapping("/workers/Dashboard")
    public String WelcomePage(Model model) {
        model.addAttribute("listWorkers", workerService.getAllWorkers());
        return "Show_workers";
    }
}
