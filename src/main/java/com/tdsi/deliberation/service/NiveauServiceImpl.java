package com.tdsi.deliberation.service;

import com.tdsi.deliberation.model.Niveau;
import com.tdsi.deliberation.repository.NiveauRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NiveauServiceImpl implements NiveauService{

    private final NiveauRepository niveauRepository;

    @Override
    public Niveau creer(Niveau niveau) {
        return niveauRepository.save(niveau);
    }

    @Override
    public List<Niveau> lire() {
        return niveauRepository.findAll();
    }

    @Override
    public Niveau modifier(Long id, Niveau niveau) {
        return niveauRepository.findById(id).
                map( p->{
                    p.setNom(niveau.getNom());
                    p.setOptionel(niveau.getOptionel());
                    p.setFiliere(niveau.getFiliere());
                    return niveauRepository.save(p);
                }).orElseThrow(()-> new RuntimeException("Niveau non trouver"));
    }

    @Override
    public String supprimer(Long id) {
        niveauRepository.deleteById(id);
        return "niveau supprimer";
    }
}
