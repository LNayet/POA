package Personnels;

import java.util.Date;

/**
 * Created by lunayetn on 25/09/2017.
 */
public class Professeur extends EnseignantPermanent {
    public Professeur(String nom, String prenom, String id, double salaire, Date date_recrutement, String domaine_recherche) {
        super(nom, prenom, id, salaire, date_recrutement, domaine_recherche);
    }

    @Override
    public String toString() {
        return "Professeur{} " + super.toString();
    }
}
