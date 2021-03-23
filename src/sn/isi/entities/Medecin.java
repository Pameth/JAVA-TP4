package sn.isi.entities;

public class Medecin extends Personne {
    private Services service;

    //Constructeur sans arg
    public Medecin() {
    }
    //Constructeur avec arg
    public Medecin(int id, String nom, String prenom, Services service) {
        super(id, nom, prenom);
        this.service = service;
    }
    //getters et Setters
    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }
}
