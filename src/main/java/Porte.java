public class Porte
{
    //====================================================================
    //Attribut
    //====================================================================

    private Integer numeroPorte;

    //====================================================================
    //Getter et Setter
    //====================================================================

    public Integer getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(Integer numeroPorte) {
        this.numeroPorte = numeroPorte;
    }


    //====================================================================
    //Constructeur
    //====================================================================

    public Porte(Integer numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    //====================================================================
    //Methode
    //====================================================================

    @Override
    public String toString() {
        return "Porte{" +
                "numeroPorte=" + numeroPorte +
                '}';
    }
}
