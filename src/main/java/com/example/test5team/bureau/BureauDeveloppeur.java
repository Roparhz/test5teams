package com.example.test5team.bureau;

public class BureauDeveloppeur extends Bureau{

    public BureauDeveloppeur(Integer nbPrisesReseau, Integer nbPrisesSecteur, Integer nbPrisesTel, Integer nbChaises, Integer nbTables, Integer nbPersonnes) {
        super(nbPrisesReseau, nbPrisesSecteur, nbPrisesTel, nbChaises, nbTables, nbPersonnes);
    }

    @Override
    public int espaceDispo(){
        return Math.max(0, (nbTables - nbPersonnes) + (nbChaises - nbPersonnes) + (3 * (nbPrisesSecteur - nbPersonnes))
                + (3 * (nbPrisesReseau - nbPersonnes)));
    }
}
