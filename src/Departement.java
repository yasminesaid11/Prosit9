import java.util.Objects;

public class Departement {
    int id;
    String nom;
    int nb_emp ;
    public Departement(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    public Departement(int id, String nom, int nb_emp){
        this.id=id;
        this.nom=nom;
        this.nb_emp=nb_emp;

    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nb_emp=" + nb_emp +
                '}';
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

    public int getNb_emp() {
        return nb_emp;
    }

    public void setNb_emp(int nb_emp) {
        this.nb_emp = nb_emp;
    }
}
