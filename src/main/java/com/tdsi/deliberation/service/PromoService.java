package com.tdsi.deliberation.service;

import com.tdsi.deliberation.model.Promo;

import java.util.List;

public interface PromoService {

    Promo creer(Promo promo);
    List<Promo> lire();
    Promo modifier(Long id, Promo promo);
    String supprimer(Long id);
}
