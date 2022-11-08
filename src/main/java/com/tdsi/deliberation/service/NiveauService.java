package com.tdsi.deliberation.service;

import com.tdsi.deliberation.model.Niveau;

import java.util.List;

public interface NiveauService {
    Niveau creer(Niveau niveau);
    List<Niveau> lire();
    Niveau modifier(Long id, Niveau niveau);
    String supprimer(Long id);

}
