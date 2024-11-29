public class Infirmier extends Personnel {
    private String unite;

    public Infirmier(String nom, String prenom, double salaire, String unite) {
        super(nom, prenom, salaire);
        this.unite = unite;
    }

    public String getUnite() {
        return unite;
    }

    @Override
    public void travailler() {
        System.out.println("L'infirmier " + getNom() + " travaille dans l'unité " + unite + ".");
    }

    @Override
    public String toString() {
        return "Infirmier{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", salaire=" + getSalaire() +
                ", unite='" + unite + '\'' +
                '}';
    }
}
