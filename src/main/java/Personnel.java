import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel implements Groupe {

    private final String nom;
    private final String prenom;
    private final LocalDate date;
    private final String fonction;
    private final ArrayList<String> telephones;

    public static class Builder {
        private final String nom;
        private final String prenom;
        private final LocalDate date;

        private String fonction = "";
        private ArrayList<String> telephones = new ArrayList<String>();

        public Builder(String nom, String prenom, LocalDate date) {
            this.nom = nom;
            this.prenom = prenom;
            this.date = date; // exemple : LocalDate date = LocalDate.of(2005, Month.JUNE, 5);
        }

        public Builder fonction(String fonction) {
            this.fonction = fonction;
            return this;
        }

        public Builder telephones(ArrayList<String> liste) {
            this.telephones = liste;
            return this;
        }

        public Personnel build() {
            return new Personnel(this);
        }
    }

    private Personnel(Builder builder) {
        this.nom = builder.nom;
        this.prenom = builder.prenom;
        this.date = builder.date;

        this.fonction = builder.fonction;
        this.telephones = builder.telephones;
    }
    
}
