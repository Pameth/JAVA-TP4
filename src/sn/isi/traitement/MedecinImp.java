package sn.isi.traitement;

import sn.isi.entities.*;

import java.util.Scanner;

    public class MedecinImp implements IMedecin{
    Scanner sc = new Scanner(System.in);
    Medecin m = new Medecin();
       MedecinChef mc = new MedecinChef();
        MedecinGeneraliste mg = new MedecinGeneraliste();
        MedecinSpecialiste ms = new MedecinSpecialiste();
        Services s = new Services();

        @Override
        public Medecin saisie() {

            int choix;
           // System.out.println("Choissisez le service de Medecin !");

            System.out.printf("Entre l' id: ");
            m.setId(Integer.parseInt(sc.nextLine()));
            System.out.printf("Entre votre nom: ");
            m.setNom(sc.nextLine());
            System.out.printf("Entre votre prenom: ");
            m.setPrenom(sc.nextLine());
            do{
            System.out.println("Quel genre de Medecin etes-vous ? ");
            System.out.printf(" 1 - Medecin Chef \t");
            System.out.printf(" 2 - Medecin Generaliste \t");
            System.out.printf(" 3 - Medecin Specialiste \n");
            s.setIdS(Integer.parseInt(sc.nextLine()));
            }while (s.getIdS()<1 || s.getIdS()>3);
            if (s.getIdS() >= 1 && s.getIdS() <= 3) {
                if (s.getIdS() == 1) {
                    System.out.println("------------------------------");
                    System.out.println("\t Medecin Chef");
                    System.out.println("------------------------------");
                    System.out.println("Entrez le bureau");
                    mc.setBureau(sc.nextLine());

                }
                if (s.getIdS() == 2) {
                    System.out.println("------------------------------");
                    System.out.println(" \tMedecin Generaliste ");
                    System.out.println("------------------------------");
                    //mg.setListeSpecialistes(sc.nextLine());
                }
                if (s.getIdS() == 3) {
                    System.out.println("------------------------------");
                    System.out.println(" \tMedecin Specialiste ");
                    System.out.println("------------------------------");
                    System.out.println(" Entrez vos Specialite :");
                    ms.setSpecialite(sc.nextLine());
                }
            }
            return m;
        }

        @Override
        public void afficher(Medecin m) {

            System.out.println("l'identifiant est : " + m.getId());
            System.out.println("le nom est : " + m.getNom());
            System.out.println("le prenom est : " + m.getPrenom());
            if (s.getIdS() >= 1 && s.getIdS() <= 3) {
                if (s.getIdS() == 1) {
                   System.out.println(" Votre bureau est :" + mc.getBureau());
                }
                if (s.getIdS() == 2) {
                    System.out.println(" Les Specialites :" );//+ mg.getListeSpecialistes());
                    System.out.println("------------");
                    System.out.println("Dentiste");
                    System.out.println("Ophtalmologue");
                    System.out.println("Dermatologue");
                    System.out.println("Cardiologue");
                    System.out.println("------------");
                }
                if (s.getIdS() == 3) {

                    System.out.println(" Votre Specialite est :" + ms.getSpecialite());
                }

                //  s.setIdS(Integer.parseInt(sc.nextLine()));

            }
        }
    }
