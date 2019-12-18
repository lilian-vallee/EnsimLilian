import java.util.*;

public class Route
{
    //====================================================================
    //Attribut
    //====================================================================

    public ArrayList<Porte> portes = new ArrayList<Porte>();

    //====================================================================
    //Constructeur
    //====================================================================

    public Route() { }

    //====================================================================
    //Methode
    //====================================================================

    public void addPorte(Porte p)
    {
        portes.add(p);
        portes.sort(new OrdrePorteComparator());
    }

    @Override
    public String toString() {
        return "Route{" +
                "portes=" + portes +
                '}';
    }
}
