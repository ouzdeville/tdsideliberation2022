package com.tdsi.deliberation.service;

import com.tdsi.deliberation.model.Filiere;
import com.tdsi.deliberation.repository.FiliereRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FiliereServiceImpl implements FiliereService{

    private final FiliereRepository filiereRepository;

    @Override
    public Filiere creer(Filiere filiere) {
        return filiereRepository.save(filiere);
    }

    @Override
    public List<Filiere> lire() {
        return filiereRepository.findAll();
    }

    @Override
    public Filiere modifier(Long id, Filiere filiere) {
        return filiereRepository.findById(id).
                map( p->{
                   p.setNom(filiere.getNom());
                   p.setDescription(filiere.getDescription());
                   p.setSigle(filiere.getSigle());
                   return filiereRepository.save(p);
                }).orElseThrow(()-> new RuntimeException("Filiere non trouver"));
    }

    @Override
    public String supprimer(Long id) {
        filiereRepository.deleteById(id);
        return "filiere supprimer";
    }
}
