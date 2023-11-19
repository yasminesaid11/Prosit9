import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> listeEmployes;
    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>();
    }
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }
    public boolean rechercherEmploye(String nom) {
        for (int i = 0; i < listeEmployes.size(); i++) {
            Employe employe = listeEmployes.get(i);
            if (employe.getNom().equals(nom))
                return true;
            }
        return false;

    }
    public boolean rechercherEmploye(Employe employe) {
            return listeEmployes.contains(employe);
    }
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);

    }
    public void displayEmploye() {
        for (int i = 0; i < listeEmployes.size(); i++) {
            Employe employe = listeEmployes.get(i);
            System.out.println(employe);
        }}
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            public int compare(Employe e1, Employe e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        });

    }

    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int compareNom = e1.getNom().compareTo(e2.getNom());
                if (compareNom != 0) {
                    return compareNom;
                }
                int compareDepartement = e1.getNom_dep().compareTo(e2.getNom_dep());
                if (compareDepartement != 0) {
                    return compareDepartement;
                }

                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }

}
