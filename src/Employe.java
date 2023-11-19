import java.util.Comparator;
import java.util.Objects;

public class Employe implements Comparator<Employe> {
    int id;
    String nom;
    String prenom;
    String nom_dep;
    int grade;

    public Employe() {

    }
    public Employe(int id, String nom, String prenom, String nom_dep, int grade){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.nom_dep=nom_dep;
        this.grade=grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compare(Employe o1, Employe o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nom_dep='" + nom_dep + '\'' +
                ", grade=" + grade +
                '}';
    }

}
