package com.tdsi.deliberation.service;

import com.tdsi.deliberation.model.Promo;
import com.tdsi.deliberation.repository.PromoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PromoServiceImpl implements PromoService{


    private  final PromoRepository promoRepository;



    /**
     * @param promo
     * @return
     */
    @Override
    public Promo creer(Promo promo) {
        return promoRepository.save(promo);
    }

    /**
     * @return
     */
    @Override
    public List<Promo> lire() {
        return promoRepository.findAll();
    }

    /**
     * @param id
     * @param promo
     * @return
     */
    @Override
    public Promo modifier(Long id, Promo promo) {
        return promoRepository.findById(id).
                map( p->{
                    p.setAnneescolaire(promo.getAnneescolaire());
                    p.setNiveau(promo.getNiveau());
                    return promoRepository.save(p);
                }).orElseThrow(()-> new RuntimeException("Promo no trouvee"));
    }

    /**
     * @param id
     * @return
     */
    @Override
    public String supprimer(Long id) {
        promoRepository.deleteById(id);
        return "promo supprimer";
    }
}
