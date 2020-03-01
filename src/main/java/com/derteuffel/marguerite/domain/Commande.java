package com.derteuffel.marguerite.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Commande implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String numero;
    @NotNull
    private Float montantT;
    private int numTable;
    private  int nbreSurTable;
    private String heure;
    private String date;

    @ManyToOne
    private Chambre chambre;
    @ManyToOne
    private Place place;

    @OneToMany(mappedBy = "commande")
    private Collection<Article> articles;
}
