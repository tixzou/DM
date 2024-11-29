public class Medecin extends Personnel {
    private String specialite;

    public Medecin(String nom, String prenom, double salaire, String specialite) {
        super(nom, prenom, salaire); // Appel au constructeur de la classe parent
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void soigner(Patient patient) {
        System.out.println("Le médecin " + getNom() + " soigne le patient " + patient.getNom() + " pour " + patient.getMaladie());
        patient.setMaladie("Guéri");
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", salaire=" + getSalaire() +
                ", specialite='" + specialite + '\'' +
                '}';
    }

    @Override
    public void travailler() {
        System.out.println("Le médecin " + getNom() + " consulte ses patients.");
    }
}
