package person;


import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import persons.IPerson;

/**
 * 
 * @author Sydney
 *
 */
public class OutilsPerson
{
    
    public IPerson[] getPersonnesEntreAge(IPerson[] personne, GregorianCalendar date, int ageMin, int ageMax) throws IllegalArgumentException
    {
        return getPersonnesEntreAge(Arrays.asList(personne), date, ageMin, ageMax);
    }
    
    public IPerson[] getPersonnesEntreAge( List<IPerson> personneListe, GregorianCalendar date, int ageMin, int ageMax) throws IllegalArgumentException
    {
        if(ageMin > ageMax)
            throw new IllegalArgumentException();
        
        return personneListe.stream()
        		//on filtre selon le predicat entre ageMin et ageMax en java 8
                .filter(p -> p.getAge(date) >= ageMin && p.getAge(date) <= ageMax)
                .toArray(IPerson[]::new);// on renvoie dans une liste
    }
    
    
    
    public int rechercheAgeMax(IPerson[] personne, GregorianCalendar date)
    {
        return rechercheAgeMax(Arrays.asList(personne), date);
    }
    
    public int rechercheAgeMax(List<IPerson> persons, GregorianCalendar date)
    {
    	//JAVA 8
        return persons.stream()
                .mapToInt(p -> p.getAge(date)) // on récupère les ages
                .max() // on prend le max des âges
                .getAsInt(); // on converti en int et on retourne
    }
}
