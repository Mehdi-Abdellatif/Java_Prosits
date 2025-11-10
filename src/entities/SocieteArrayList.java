package entities;

import interfaces.IGestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employee> {

    private final List<Employee> employees;

    public SocieteArrayList() {
        employees = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employee e) {
        employees.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee e : employees) {
            if (e.getNom() != null && e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee e) {
        return employees.contains(e);
    }

    @Override
    public void supprimerEmploye(Employee e) {
        employees.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employees);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employees.sort((e1, e2) -> {
            int cmpDept = e1.getDepartmentName().compareTo(e2.getDepartmentName());
            if (cmpDept != 0) return cmpDept;

            int cmpGrade = Integer.compare(e1.getGrade(), e2.getGrade());
            if (cmpGrade != 0) return cmpGrade;

            return e1.getNom().compareTo(e2.getNom());
        });
    }
}