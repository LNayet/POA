package Personnels;

import java.util.Date;

/**
 * Created by lunayetn on 25/09/2017.
 */
public abstract class Enseignant extends Personnel {
    protected Contrat contrat;

    protected Enseignant(String nom, String prenom, String id, Contrat contrat) {
        super(nom, prenom, id);
        this.contrat = contrat;
    }

    public double getSalaire(){
        return this.contrat.getSalaire();
    }

    public Date getDebut()
    {
        return this.contrat.getDebut();
    }
}
