package Personnels;

import java.util.Date;

/**
 * Created by lunayetn on 25/09/2017.
 */
public class Biatoss extends Personnel {
    protected Contrat contrat;

    public Biatoss(String nom, String prenom, String id, CDD contrat) {
        super(nom, prenom, id);
        this.contrat = contrat;
    }

    public double getSalaire()
    {
        return contrat.getSalaire();
    }

    public Date getDebut()
    {
        return contrat.getDebut();
    }

    public Date getFin()
    {
        return ((CDD)contrat).getFin();
    }

    @Override
    public String toString() {
        return "Biatoss{" +
                "contrat=" + contrat +
                "} " + super.toString();
    }
}
