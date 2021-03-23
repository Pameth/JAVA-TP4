package sn.isi.entities;

public class MedecinChef extends Medecin {
    private String bureau;

    //Constructeur sans arg
    public MedecinChef() {
    }
    //Constructeur avec arg
    public MedecinChef(int id, String nom, String prenom, Services service, String bureau) {
        super(id, nom, prenom, service);
        this.bureau = bureau;
    }
    //getters et Setters
    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }



}
