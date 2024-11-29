import java.util.ArrayList;
import java.util.List;

public class Hopital {
    private String nom;
    private List<Patient> patients;
    private List<Medecin> medecins;
    private List<Infirmier> infirmiers;
    private List<Consultation> consultations;
    private List<RendezVous> rendezVousList;

    // Constructeur
    public Hopital(String nom) {
        this.nom = nom;
        this.patients = new ArrayList<>();
        this.medecins = new ArrayList<>();
        this.infirmiers = new ArrayList<>();
        this.consultations = new ArrayList<>();
        this.rendezVousList = new ArrayList<>();
    }

    // Getter pour le nom de l'hôpital
    public String getNom() {
        return nom;
    }

    // Méthodes pour gérer les patients
    public void ajouterPatient(Patient patient) {
        patients.add(patient);
    }

    public void afficherPatients() {
        System.out.println("\nListe des patients :");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    // Méthodes pour gérer les médecins
    public void ajouterMedecin(Medecin medecin) {
        medecins.add(medecin);
    }

    public void afficherMedecins() {
        System.out.println("\nListe des médecins :");
        for (Medecin medecin : medecins) {
            System.out.println(medecin);
        }
    }

    // Méthodes pour gérer les infirmiers
    public void ajouterInfirmier(Infirmier infirmier) {
        infirmiers.add(infirmier);
    }

    public void afficherInfirmiers() {
        System.out.println("\nListe des infirmiers :");
        for (Infirmier infirmier : infirmiers) {
            System.out.println(infirmier);
        }
    }

    // Méthodes pour gérer les consultations
    public void ajouterConsultation(Consultation consultation) {
        consultations.add(consultation);
    }

    public void afficherConsultations() {
        System.out.println("\nListe des consultations :");
        for (Consultation consultation : consultations) {
            System.out.println(consultation);
        }
    }

    // Méthodes pour gérer les rendez-vous
    public void ajouterRendezVous(RendezVous rendezVous) {
        rendezVousList.add(rendezVous);
    }

    public void afficherRendezVous() {
        System.out.println("\nListe des rendez-vous :");
        for (RendezVous rendezVous : rendezVousList) {
            System.out.println(rendezVous);
        }
    }

    // Méthode pour afficher les statistiques des patients
    public void afficherStatistiques() {
        long patientsGueris = patients.stream().filter(p -> p.getMaladie().equals("Guéri")).count();
        long patientsMalades = patients.size() - patientsGueris;

        System.out.println("\nStatistiques des patients :");
        System.out.println("Nombre de patients guéris : " + patientsGueris);
        System.out.println("Nombre de patients malades : " + patientsMalades);
    }
}
