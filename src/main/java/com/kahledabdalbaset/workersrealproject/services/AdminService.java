package com.kahledabdalbaset.workersrealproject.services;

import java.util.List;

import com.kahledabdalbaset.workersrealproject.models.Admin;

public interface AdminService {
    List<Admin> getAllAdmins();

    void saveAdmin(Admin admin);

    Admin getAdminById(int id);

    void deleteAdminById(int id);
}
