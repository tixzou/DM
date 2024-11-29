public class Main {
    public static void main(String[] args) {
        Hopital hopital = new Hopital("Hôpital Central");

        // Ajouter des patients
        Patient patient1 = new Patient("Alice Dupont", 30, "Grippe");
        Patient patient2 = new Patient("Bob Martin", 45, "Fracture");
        Patient patient3 = new Patient("Charlie Dubois", 25, "Rhume");
        hopital.ajouterPatient(patient1);
        hopital.ajouterPatient(patient2);
        hopital.ajouterPatient(patient3);

        // Ajouter des médecins
        Medecin medecin1 = new Medecin("Dr. Simon", "Paul", 5000, "Généraliste");
        Medecin medecin2 = new Medecin("Dr. Emma", "Durand", 5500, "Orthopédiste");
        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);

        // Ajouter des infirmiers
        Infirmier infirmier1 = new Infirmier("Claire", "Durand", 3000, "Urgences");
        Infirmier infirmier2 = new Infirmier("Marc", "Dubois", 3200, "Pédiatrie");
        hopital.ajouterInfirmier(infirmier1);
        hopital.ajouterInfirmier(infirmier2);

        // Afficher toutes les données initiales
        System.out.println("\nNom de l'hôpital : " + hopital.getNom());
        hopital.afficherPatients();
        hopital.afficherMedecins();
        hopital.afficherInfirmiers();

        // Ajouter des consultations
        Consultation consultation1 = new Consultation(new java.util.Date(), "Grippe sévère", "Repos", medecin1, patient1);
        Consultation consultation2 = new Consultation(new java.util.Date(), "Fracture", "Plâtre", medecin2, patient2);
        hopital.ajouterConsultation(consultation1);
        hopital.ajouterConsultation(consultation2);

        // Ajouter des rendez-vous
        RendezVous rendezVous1 = new RendezVous(patient3, medecin1, new java.util.Date());
        RendezVous rendezVous2 = new RendezVous(patient1, medecin2, new java.util.Date());
        hopital.ajouterRendezVous(rendezVous1);
        hopital.ajouterRendezVous(rendezVous2);

        // Simuler des soins
        medecin1.soigner(patient1); // Guérir Alice
        medecin2.soigner(patient2); // Guérir Bob

        // Afficher toutes les données après les mises à jour
        hopital.afficherConsultations();
        hopital.afficherRendezVous();

        // Afficher les statistiques des patients
        hopital.afficherStatistiques();
    }
}
