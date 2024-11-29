import java.util.Date;

public class Consultation {
    private Date date;
    private String diagnostic;
    private String traitement;
    private Medecin medecin;
    private Patient patient;

    public Consultation(Date date, String diagnostic, String traitement, Medecin medecin, Patient patient) {
        this.date = date;
        this.diagnostic = diagnostic;
        this.traitement = traitement;
        this.medecin = medecin;
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "date=" + date +
                ", diagnostic='" + diagnostic + '\'' +
                ", traitement='" + traitement + '\'' +
                ", medecin=" + medecin.getNom() +
                ", patient=" + patient.getNom() +
                '}';
    }
}
