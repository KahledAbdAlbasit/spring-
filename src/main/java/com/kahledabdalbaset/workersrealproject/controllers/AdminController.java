package com.kahledabdalbaset.workersrealproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kahledabdalbaset.workersrealproject.models.Admin;
import com.kahledabdalbaset.workersrealproject.services.AdminService;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/")
    public String WelcomePage(Model model) {
        //model.addAttribute("listAdmins", adminService.getAllAdmins());
        return "WelcomePage";
    }

    // display list of employees
    @GetMapping("/Dashboard")
    public String viewHomePage(Model model) {
        model.addAttribute("listAdmins", adminService.getAllAdmins());
        return "index";
    }

    @GetMapping("/showNewAdminForm")
    public String showNewAdminForm(Model model) {
        // create model attribute to bind form data
        Admin admin = new Admin();
        model.addAttribute("admin", admin);
        return "new_admin";
    }

    @PostMapping("/saveAdmin")
    public String saveAdmin(@ModelAttribute("admin") Admin admin) {
        // save employee to database
        adminService.saveAdmin(admin);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{adminSsn}")
    public String showFormForUpdate(@PathVariable(value = "adminSsn") int adminSsn, Model model) {

        // get employee from the service
        Admin admin = adminService.getAdminById(adminSsn);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("admin", admin);
        return "update_admin";
    }

    @GetMapping("/deleteAdmin/{adminSsn}")
    public String deleteEmployee(@PathVariable(value = "adminSsn") int adminSsn) {

        // call delete employee method
        this.adminService.deleteAdminById(adminSsn);
        return "redirect:/";
    }
}