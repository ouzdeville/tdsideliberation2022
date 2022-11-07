package com.tdsi.deliberation.controller;

import com.tdsi.deliberation.model.Filiere;
import com.tdsi.deliberation.service.FiliereService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filiere")
@AllArgsConstructor
public class FiliereController {
    private final FiliereService filiereService;

    @PostMapping("/create")
    public Filiere create(@RequestBody Filiere filiere){
        return filiereService.creer(filiere);
    }

    @GetMapping("/list")
    public List<Filiere> read(){
        return filiereService.lire();
    }

    @PutMapping("/update/{id}")
    public Filiere update(@PathVariable Long id, @RequestBody  Filiere filiere ){
        return filiereService.modifier(id,filiere);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return filiereService.supprimer(id);
    }

}
