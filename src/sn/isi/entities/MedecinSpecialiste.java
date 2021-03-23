package sn.isi.entities;

public class MedecinSpecialiste extends Medecin {
    private String specialite;

    public MedecinSpecialiste() {
    }

    public MedecinSpecialiste(int id, String nom, String prenom, Services service, String specialite) {
        super(id, nom, prenom, service);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}
