package com.kahledabdalbaset.workersrealproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kahledabdalbaset.workersrealproject.models.Admin;
import com.kahledabdalbaset.workersrealproject.repository.AdminRepository;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public void saveAdmin(Admin admin) {
        this.adminRepository.save(admin);
    }

    @Override
    public Admin getAdminById(int id) {
        Optional<Admin> optional = adminRepository.findById(id);
        Admin employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public void deleteAdminById(int id) {
        this.adminRepository.deleteById(id);
    }
}
