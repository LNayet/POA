package Personnels;

/**
 * Created by lunayetn on 25/09/2017.
 */
public class Main {
    public static void main(String[] args) {
        Personnel e1 = new Etudiant (nom: "A", prenom: "B", id: "e_001", (double)500);
        Personnel d1= new Doctorant("A2", "B2", "e_002", "1000");
        Personnel pr1 = new Professeur("E","F","pr_001",new CDI(3000.0,new Date()))
    }
}
