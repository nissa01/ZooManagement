public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Saidi", "Anis", "Informatique", 2);
        Employe e2 = new Employe(2, "Jaziri", "Amira", "Marketing", 3);
        Employe e3 = new Employe(3, "Raissi", "Ghassen", "Finance", 1);
        Employe e4 = new Employe(4, "Aouadi", "Ali", "Informatique", 2);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("Liste des employés:");
        societe.displayEmploye();

        System.out.println("\nRecherche de l'employé 'Jaziri': " + societe.rechercherEmploye("Jaziri"));
        System.out.println("\nRecherche de l'employé 4': " + societe.rechercherEmploye(e4));

        System.out.println("\nListe des employés triés par ID:");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nListe des employés triés par nom, département et grade:");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        societe.supprimerEmploye(e3);
        System.out.println("\nListe des employés après suppression:");
        societe.displayEmploye();
    }
}
