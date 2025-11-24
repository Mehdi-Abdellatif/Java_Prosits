package main;


import entities.*;

import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeManagement {

    public static void main(String[] args) {
        SocieteArrayList s = new SocieteArrayList();
        DepartementHashSet dh = new DepartementHashSet();
        AffectationHashMap affectation = new AffectationHashMap();
        Employee e1 = new Employee(1,"mehdi","abdellatif","F",3);
        Employee e2 = new Employee(2,"kais","said","M",5);
        Employee e3 = new Employee(3,"flan","foulen","K",2);
        s.ajouterEmploye(e1);
        s.ajouterEmploye(e2);
        s.ajouterEmploye(e3);
        Departement d1 = new Departement(3, "Informatique", 20);
        Departement d2 = new Departement(1, "RH", 5);
        Departement d3 = new  Departement(2, "Finance", 10);
        dh.ajouterDepartement(d1);
        dh.ajouterDepartement(d2);
        dh.ajouterDepartement(d3);
        affectation.ajouterEmployeDepartement(e1,d1);
        affectation.ajouterEmployeDepartement(e2,d2);
        affectation.ajouterEmployeDepartement(e3,d3);
        s.displayEmploye();
        dh.displayDepartement();
        System.out.println("Affichage d'affectation avant tentative d'ajouter un employé en deux departements");
        affectation.afficherEmployesEtDepartements();
        affectation.ajouterEmployeDepartement(e1,d2);
        System.out.println("Affichage d'affectation après la tentative");
        affectation.afficherEmployesEtDepartements();


        System.out.println(s.rechercherEmploye("kais"));
        System.out.println(dh.rechercherDepartement("Finance"));

        System.out.println(s.rechercherEmploye(new Employee(1,"mehdi","abdellatif","F",3)));
        System.out.println(dh.rechercherDepartement(
                new Departement(1, "RH", 5)
        ));

        s.trierEmployeParId();
        TreeSet<Departement> sorted = dh.trierDepartementById();

        s.displayEmploye();
        System.out.println("Liste des départements triés par id :");
        for (Departement d : sorted) {
            System.out.println(d);
        }

        affectation.afficherEmployes();
        affectation.afficherDepartements();

        System.out.println("suppression Kais de Info :"+ affectation.supprimerEmployeEtDepartement(e2, d1));
        System.out.println("Suppression Kais de RH : " + affectation.supprimerEmployeEtDepartement(e2,d2));

        affectation.supprimerEmploye(e3);
        affectation.afficherEmployesEtDepartements();

        System.out.println("Le département RH est-il affecté ? " + affectation.rechercherDepartement(d2));

        affectation.ajouterEmployeDepartement(e3, d3);
        affectation.ajouterEmployeDepartement(e2, d1);

        TreeMap<Employee, Departement> mapTriee = affectation.trierMap();
        for (var entry : mapTriee.entrySet()) {
            System.out.println("ID: " + entry.getKey().getId() + " (" + entry.getKey().getNom() + ") -> " + entry.getValue().getNom());
        }
    }
}