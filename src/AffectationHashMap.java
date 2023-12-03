import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap  {
    private Map<Employe, String> affectations;
    public AffectationHashMap(){
        this.affectations = new HashMap<>();
    }
    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
        if (affectations.containsKey(employe)) {
            System.out.println("L'employé est déjà affecté à un département.");
        } else {
            affectations.put(employe, departement.getNom());
            employe.setNom(departement.getNom());
        }
    }
    public void supprimerEmploye(Employe employe) {
        if (affectations.containsKey(employe)) {
            affectations.remove(employe);
            System.out.println("L'employé a été supprimé de la collection.");
        } else {
            System.out.println("L'employé n'est pas présent dans la collection.");
        }

    }
    public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
        if (affectations.containsKey(employe) && affectations.get(employe).equals(departement.getNom())) {
            affectations.remove(employe);
        }
    }
    public void afficherEmployes() {
        for (Employe employe : affectations.keySet()) {
            System.out.println("Employe: " + employe.getNom());
        }
    }
    public boolean rechercherEmploye(Employe employe) {
        return affectations.containsKey(employe);
    }
    public boolean rechercherDeapartement(Departement departement) {
        return affectations.containsKey(departement);
    }

    public TreeMap<Employe, String> trierMap() {
        TreeMap<Employe, String> TreeMap = new TreeMap<>(new ComparatorEmployeById());
        TreeMap.putAll(affectations);
        return TreeMap;
    }

    private static class ComparatorEmployeById implements Comparator<Employe> {
        @Override
        public int compare(Employe emp1, Employe emp2) {
            return Integer.compare(emp1.getId(), emp2.getId());
        }
    }

}
