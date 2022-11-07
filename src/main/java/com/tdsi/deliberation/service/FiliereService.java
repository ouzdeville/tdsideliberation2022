package com.tdsi.deliberation.service;

import com.tdsi.deliberation.model.Filiere;

import java.util.List;

public interface FiliereService {

    Filiere creer(Filiere filiere);
    List<Filiere> lire();
    Filiere modifier(Long id, Filiere filiere);
    String supprimer(Long id);
}
