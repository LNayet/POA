package Personnels;

import java.util.Date;

/**
 * Created by lunayetn on 25/09/2017.
 */
public class CDD extends Contrat {
    private Date fin;
    public CDD(double salaire, Date debut, Date fin)
    {
        super(salaire, debut);
        this.fin=fin;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }
}
