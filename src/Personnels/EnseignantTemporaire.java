package Personnels;

import java.util.Date;

/**
 * Created by lunayetn on 25/09/2017.
 */
public abstract class EnseignantTemporaire extends Enseignant {

    public EnseignantTemporaire(String nom, String prenom, String id, CDD contrat) {
        super(nom, prenom, id, contrat);
    }

    public Date fin()
    {
        return ((CDD)contrat).getFin();
    }
}
