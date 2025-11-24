package entities;
import java.util.HashMap;
import java.util.TreeMap;
import entities.Employee;
import entities.Departement;
import java.util.Map;
import java.util.Set;

public class AffectationHashMap {
    private HashMap<Employee, Departement> affectations;

    public void ajouterEmployeDepartement(Employee e,Departement d){
        this.affectations.put(e,d);
    }

    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Employee, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + "est affecté au "+ entry.getValue());
        }
    }

    public void supprimerEmploye(Employee e) {
        affectations.remove(e);
    }

    public boolean supprimerEmployeEtDepartement(Employee e, Departement d) {
        return affectations.remove(e,d);
    }

    public void afficherEmployes() {
        Set<Employee> employees = affectations.keySet();
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employee e) {
        return  affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employee, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
