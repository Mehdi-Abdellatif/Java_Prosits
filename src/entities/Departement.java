package entities;

import java.util.Objects;

public class Departement implements Comparable<Departement>{
    public int id;

    public String nom;

    public int nbr_emp;

    public Departement() {
    }

    public Departement(int id, String nom, int nbr_emp) {
        this.id = id;
        this.nom = nom;
        this.nbr_emp = nbr_emp;
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

    public int getNbr_emp() {
        return nbr_emp;
    }

    public void setNbr_emp(int nbr_emp) {
        this.nbr_emp = nbr_emp;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbr_emp=" + nbr_emp +
                '}';
    }

    @Override
    public boolean equals(Object d) {
        if (this == d) return true;
        if (d == null || getClass() != d.getClass()) return false;

        Departement that = (Departement) d;

        if (id != that.id) return false;
        return nom.equals(that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }


    @Override
    public int compareTo(Departement d) {
        return Integer.compare(this.id, d.id);
    }
}
