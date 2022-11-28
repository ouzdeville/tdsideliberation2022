package com.tdsi.deliberation.service;


import com.tdsi.deliberation.model.*;
import com.tdsi.deliberation.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private PersonneRepository personneRepository;
    @Autowired
    private RoleRepository appRoleRepository;
    @Autowired
    private AdminRepository adminRepository;


    @Override
    public void saveUserAdmin(Admin admin) {
        this.adminRepository.save(admin);
        addRoleToUser(admin.getUsername(),"ADMIN");
    }


    @Override
    public Role saveRole(Role role) {
        return appRoleRepository.save(role);
    }

    @Override
    public Personne loadUserByUsername(String username) {
        return personneRepository.findByUsername(username);
    }

    @Override
    public void addRoleToUser(String username, String rolename) {
        Personne appUser=personneRepository.findByUsername(username);
        Role appRole=appRoleRepository.findByRoleName(rolename);
        appUser.getRoles().add(appRole);
    }


}
