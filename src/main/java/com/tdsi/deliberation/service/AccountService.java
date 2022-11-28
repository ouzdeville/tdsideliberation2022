package com.tdsi.deliberation.service;


import com.tdsi.deliberation.model.Admin;
import com.tdsi.deliberation.model.Personne;
import com.tdsi.deliberation.model.Role;

public interface AccountService
{
    //public void saveUserEtudiant(Etudiant etudiant);
    //public void saveUserEtudiant(Professeur professeur);
    public void saveUserAdmin(Admin admin);
    public Role saveRole(Role role);
    public Personne loadUserByUsername(String username);
    public void addRoleToUser(String username,String rolename);
}
