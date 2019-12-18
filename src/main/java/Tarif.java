import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Tarif
{
    //====================================================================
    //Attribut
    //====================================================================
    private Porte entree;
    private Porte sortie;
    private LocalDateTime dateValidite;
    private BigDecimal prix;

    //====================================================================
    //Getter et Setter
    //====================================================================

    public Porte getEntree() {
        return entree;
    }

    public void setEntree(Porte entree) {
        this.entree = entree;
    }

    public Porte getSortie() {
        return sortie;
    }

    public void setSortie(Porte sortie) {
        this.sortie = sortie;
    }

    public LocalDateTime getDateValidite() {
        return dateValidite;
    }

    public void setDateValidite(LocalDateTime dateValidite) {
        this.dateValidite = dateValidite;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }


    //====================================================================
    //Constructeur
    //====================================================================

    public Tarif(Porte entree, Porte sortie, BigDecimal prix) {
        this.entree = entree;
        this.sortie = sortie;
        this.prix = prix;
    }

    //====================================================================
    //Methode
    //====================================================================

    @Override
    public String toString() {
        return "Tarif{}";
    }


}
