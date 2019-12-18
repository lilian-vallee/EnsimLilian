import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

public class CompagnieAutoroute
{
    //====================================================================
    //Attribut
    //====================================================================
    private ArrayList<Route> routes = new ArrayList<Route>();
    private ArrayList<Tarif> tarifs = new ArrayList<Tarif>();

    //====================================================================
    //Constructeur
    //====================================================================

    public CompagnieAutoroute() {}

    //====================================================================
    //Methode
    //====================================================================

    public BigDecimal obtenirTarif(Porte p1, Porte p2)
    {
        Tarif tarif  = getTarifExacte(p1, p2);
        if (tarif == null)
        {
            tarif = getTarifCalcule(p1, p2);
        }
        return tarif.getPrix();
    }

    private Tarif getTarifCalcule(Porte p1, Porte p2)
    {
        BigDecimal somme = BigDecimal.valueOf(0);
        Route route = null;
        for (Route r : routes)
        {
            if(r.portes.contains(p1) && r.portes.contains(p2))
            {
                route = r;
                break;
            }
        }
        for ( int i = route.portes.indexOf(p1) ; i<route.portes.indexOf(p2) ; i++)
        {
            somme.add( (getTarifExacte(route.portes.get(i), route.portes.get(i + 1))).getPrix() );
        }
        return new Tarif(p1, p2, somme);
    }

    private Tarif getTarifExacte(Porte p1, Porte p2)
    {
        for (Tarif t : tarifs)
        {
            if (t.getEntree() == p1 && t.getEntree() == p2)
            {
                return t;
            }
        }
        return null;
    }

    public void ajouterTarif(Tarif t)
    {
        tarifs.add(t);
    }

    public void ajouterRoute(Route r)
    {
        routes.add(r);
    }
}
