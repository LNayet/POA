package Personnels;

/**
 * Created by lunayetn on 25/09/2017.
 */
public abstract class Personnel {
    private String nom;
    private String prenom;
    private String id;

    Personnel(String nom, String prenom, String id) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
    }

    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getId() { return id; }

    @Override
    public String toString() {
        return prenom + "_" + nom;
    }
}
