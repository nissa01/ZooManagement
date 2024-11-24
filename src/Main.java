public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 25);
        Departement d2 = new Departement(2, "Ressources Humaines", 16);
        Departement d3 = new Departement(3, "Marketing", 10);
        Departement d4 = new Departement(4, "Sponsoring", 8);
        Departement d5 = new Departement(5, "Finance", 22);



        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d3);
        gestionDepartements.ajouterDepartement(d4);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d5);


        System.out.println("Recherche par nom (Informatique) : " + gestionDepartements.rechercherDepartement("Informatique"));
        System.out.println("Recherche par objet (d2) : " + gestionDepartements.rechercherDepartement(d2));

        gestionDepartements.supprimerDepartement(d3);

        gestionDepartements.displayDepartement();

        System.out.println("Départements triés par ID :");
        for (Departement d : gestionDepartements.trierDepartementById()) {
            System.out.println(d);
        }
    }
}


        /* SocieteArrayList societe = new SocieteArrayList();

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
        societe.displayEmploye();*/



