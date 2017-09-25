package Personnels;

/**
 * Created by lunayetn on 25/09/2017.
 */
public class Etudiant extends Personnel {
    public Etudiant(String nom, String prenom, String id,double bourse) {
        super(nom, prenom, id);
        this.bourse=bourse;
    }
    protected double bourse;

    public double getBourse() { return bourse; }

    public void setBourse(double bourse)
    {
        this.bourse=bourse;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "bourse=" + bourse +
                "} " + super.toString();
    }
}
