package com.tdsi.deliberation.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cohorte")
@Getter
@Setter
@NoArgsConstructor
public class Cohorte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    @ManyToOne
    private Promo promo;
    private int nombre;
}
