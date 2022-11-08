/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdsi.deliberation.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "filiere")
@Getter
@Setter
@NoArgsConstructor
public class Filiere {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nom;
    @Column(length = 5,nullable = true)
    private String sigle;
    private String description;
    @OneToMany(mappedBy = "filiere")
    List<Niveau> niveauList;
}
