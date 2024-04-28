package com.example.test5team.bureau;

import lombok.*;

@Setter
@Getter

public class Bureau {
    Integer nbPrisesReseau;
    Integer nbPrisesSecteur;
    Integer nbPrisesTel;
    Integer nbChaises;
    Integer nbTables;
    Integer nbPersonnes;

    public Bureau(Integer nbPrisesReseau, Integer nbPrisesSecteur, Integer nbPrisesTel, Integer nbChaises, Integer nbTables, Integer nbPersonnes) {
        this.nbPrisesReseau = nbPrisesReseau;
        this.nbPrisesSecteur = nbPrisesSecteur;
        this.nbPrisesTel = nbPrisesTel;
        this.nbChaises = nbChaises;
        this.nbTables = nbTables;
        this.nbPersonnes = nbPersonnes;
    }

    public int espaceDispo(){
        return Math.max(0, (nbTables - nbPersonnes) + (nbChaises - nbPersonnes) + (nbPrisesTel - nbPersonnes) + (nbPrisesSecteur - nbPersonnes) + (nbPrisesReseau - nbPersonnes));
    }


}
