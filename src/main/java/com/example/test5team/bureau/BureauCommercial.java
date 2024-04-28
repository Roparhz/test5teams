package com.example.test5team.bureau;

public class BureauCommercial extends Bureau{
    public BureauCommercial(Integer nbPrisesReseau, Integer nbPrisesSecteur, Integer nbPrisesTel, Integer nbChaises, Integer nbTables, Integer nbPersonnes) {
        super(nbPrisesReseau, nbPrisesSecteur, nbPrisesTel, nbChaises, nbTables, nbPersonnes);
    }

    @Override
    public int espaceDispo(){
        return Math.max(0, (nbTables - nbPersonnes) + (2 * (nbChaises - nbPersonnes)) + (2 * (nbPrisesTel - nbPersonnes))
                + (nbPrisesSecteur - nbPersonnes) + (nbPrisesReseau - nbPersonnes));
    }
}
