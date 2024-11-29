import java.util.Date;

public class RendezVous {
    private Patient patient;
    private Medecin medecin;
    private Date date;

    public RendezVous(Patient patient, Medecin medecin, Date date) {
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
    }

    @Override
    public String toString() {
        return "RendezVous{" +
                "patient=" + patient.getNom() +
                ", medecin=" + medecin.getNom() +
                ", date=" + date +
                '}';
    }
}
