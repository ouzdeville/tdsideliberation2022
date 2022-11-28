package com.tdsi.deliberation.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "promo")
@Getter
@Setter
@NoArgsConstructor
public class Promo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Niveau niveau;
    @OneToMany(mappedBy = "promo")
    List<Cohorte> cohorteList;
    private  String anneescolaire;

}
