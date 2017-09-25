package Personnels;

import java.util.Date;

/**
 * Created by lunayetn on 25/09/2017.
 */
public abstract class Contrat {
    private double salaire;
    private Date debut;

    public Contrat(double salaire, Date debut) {
        this.salaire = salaire;
        this.debut = debut;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Date getDebut() {
        return debut;
    }
}


