package Personnels;

import java.util.Date;

/**
 * Created by lunayetn on 25/09/2017.
 */
public class MaitreConferences extends EnseignantPermanent {
    public MaitreConferences(String nom, String prenom, String id, CDI contrat, String domaine_recherche) {
        super(nom, prenom, id, contrat, domaine_recherche);
    }

    @Override
    public String toString() {
        return "MaitreConferences{} " + super.toString();
    }
}
