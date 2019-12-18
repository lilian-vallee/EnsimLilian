import java.math.BigDecimal;

public class Voyage
{
    //====================================================================
    //Attribut
    //====================================================================
    private Porte entree;
    private Porte sortie;
    private BigDecimal prix;
    private CompagnieAutoroute autoroute;

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

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public CompagnieAutoroute getAutoroute() {
        return autoroute;
    }

    public void setAutoroute(CompagnieAutoroute autoroute) {
        this.autoroute = autoroute;
    }

    //====================================================================
    //Constructeur
    //====================================================================

    public Voyage(Porte entree, Porte sortie, CompagnieAutoroute autoroute) {
        this.entree = entree;
        this.sortie = sortie;
        this.autoroute = autoroute;
    }

}
