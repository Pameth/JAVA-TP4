package main;

import sn.isi.entities.Medecin;
import sn.isi.entities.Personne;
import sn.isi.traitement.IMedecin;
import sn.isi.traitement.MedecinImp;

public class Main {
    public static void main(String[] args) {

        IMedecin medecin = new MedecinImp();
        Medecin m = medecin.saisie();

        medecin.afficher(m);
    }

}
