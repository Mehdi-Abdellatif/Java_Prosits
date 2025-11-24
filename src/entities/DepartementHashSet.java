package entities;

import interfaces.IDepartement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }


    @Override
    public void ajouterDepartement(Departement d) { departements.add(d);}

    @Override
    public boolean rechercherDepartement(String nom) {

        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        for (Departement d : departements){
            if(d.getNom().equals(departement.getNom()))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement d) { departements.remove(d);}

    @Override
    public void displayDepartement() {
        for (Departement d : departements) {
            System.out.println(d);
        }

    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(departements);
    }
}
