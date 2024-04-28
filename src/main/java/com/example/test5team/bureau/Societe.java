package com.example.test5team.bureau;

import java.util.Random;

public class Societe {
    private BureauCommercial bureauCommercial1;
    private BureauCommercial bureauCommercial2;
    private BureauCommercial bureauCommercial3;
    private BureauDeveloppeur bureauDeveloppeur1;
    private BureauDeveloppeur bureauDeveloppeur2;

    public  Societe() {
        bureauCommercial1 = new BureauCommercial(10, 10, 5, 20, 15, 0);
        bureauCommercial2 = new BureauCommercial(12, 12, 6, 22, 17, 0);
        bureauCommercial3 = new BureauCommercial(8, 8, 4, 18, 13, 0);

        bureauDeveloppeur1 = new BureauDeveloppeur(15, 15, 0, 10, 8, 0);
        bureauDeveloppeur2 = new BureauDeveloppeur(18, 18, 0, 12, 10, 0);
    }

    public void ajoutPersonnel(){
        Random random = new Random();
        boolean isCommercial;

        while(true){
            isCommercial = random.nextBoolean();

            if(isCommercial){
                if(bureauCommercial1.espaceDispo() > 0){
                    bureauCommercial1.setNbPersonnes(bureauCommercial1.getNbPersonnes() + 1);
                }else if(bureauCommercial2.espaceDispo() > 0){
                    bureauCommercial2.setNbPersonnes(bureauCommercial1.getNbPersonnes() +1);
                } else if (bureauCommercial3.espaceDispo() > 0) {
                    bureauCommercial3.setNbPersonnes(bureauCommercial1.getNbPersonnes() +1);
                }else {
                    break;
                }
            }else {
                if(bureauDeveloppeur1.espaceDispo() > 0){
                    bureauDeveloppeur1.setNbPersonnes(bureauDeveloppeur1.getNbPersonnes() +1);
                } else if (bureauDeveloppeur2.espaceDispo() > 0) {
                    bureauDeveloppeur2.setNbPersonnes(bureauDeveloppeur2.getNbPersonnes() +1);
                }else {
                    break;
                }
            }
            afficherInformations();
        }
    }

    private void afficherInformations() {
        System.out.println("Nombre de commerciaux dans bureauCommercial1 : " + bureauCommercial1.getNbPersonnes());
        System.out.println("Nombre de commerciaux dans bureauCommercial2 : " + bureauCommercial2.getNbPersonnes());
        System.out.println("Nombre de commerciaux dans bureauCommercial3 : " + bureauCommercial3.getNbPersonnes());
        System.out.println("Nombre de développeurs dans bureauDeveloppeur1 : " + bureauDeveloppeur1.getNbPersonnes());
        System.out.println("Nombre de développeurs dans bureauDeveloppeur2 : " + bureauDeveloppeur2.getNbPersonnes());
        System.out.println("Espace disponible dans bureauCommercial1 : " + bureauCommercial1.espaceDispo());
        System.out.println("Espace disponible dans bureauCommercial2 : " + bureauCommercial2.espaceDispo());
        System.out.println("Espace disponible dans bureauCommercial3 : " + bureauCommercial3.espaceDispo());
        System.out.println("Espace disponible dans bureauDeveloppeur1 : " + bureauDeveloppeur1.espaceDispo());
        System.out.println("Espace disponible dans bureauDeveloppeur2 : " + bureauDeveloppeur2.espaceDispo());
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {
        Societe maSociete = new Societe();
        maSociete.ajoutPersonnel();
    }

}
