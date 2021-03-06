package com.derteuffel.marguerite.repository;

import com.derteuffel.marguerite.domain.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {
    Facture findByNumCmdAndCommande_Id(String num,Long id);
    List<Facture> findAllByDate(String date);
    List<Facture> findAllByNumeroTable(int number);
    List<Facture> findAllByMontantTAndBillTraceAndCommande_Id(Double montant,String trace, Long id);

}
