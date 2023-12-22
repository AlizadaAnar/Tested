package com.company.EditedSheet.service;

import com.company.EditedSheet.entity.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> getAdmin();

    Admin saveAdmin(Admin admin);

    Admin getAdminById(Long id);

    Admin updateAdmin(Long id, Admin admin);

    void deleteAdminById(Long id);

    public String getPasswordByUsername(String username);

}
