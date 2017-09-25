package Personnels;

import java.util.Date;

/**
 * Created by lunayetn on 25/09/2017.
 */
public abstract class EnseignantPermanent extends Enseignant {
    public EnseignantPermanent(String nom, String prenom, String id, CDI contrat, String domaine_recherche) {
        super(nom, prenom, id, contrat);
        this.domaine_recherche = domaine_recherche;
    }

    private String domaine_recherche;

    public String getDomaine_recherche() {
        return domaine_recherche;
    }

    public void setDomaine_recherche(String domaine_recherche) {
        this.domaine_recherche = domaine_recherche;
    }

    public double augmentation(double augmentation)
    {
        contrat.setSalaire(contrat.getSalaire()+augmentation);
        return contrat.getSalaire();
    }
}
