package projectjavajpoo.exercice9;

public class Voiture {
    private int id;

    private String nom;

    private String model;

    private String marque;

    private int maxSpeed;

    public Voiture(int id, String nom, String model, String marque, int maxSpeed) {
        this.id = id;
        this.nom = nom;
        this.model = model;
        this.marque = marque;
        this.maxSpeed = maxSpeed;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getModele() {
        return model;
    }

    public void setModele(String modele) {
        this.model = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getVitesseMaximale() {
        return maxSpeed;
    }

    public void setVitesseMaximale(int vitesseMaximale) {
        this.maxSpeed = vitesseMaximale;
    }
}
