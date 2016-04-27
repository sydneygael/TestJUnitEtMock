package person;

import java.util.GregorianCalendar;

import persons.IPerson;

public class Person extends people.Personne implements IPerson
{
    public Person(String nom, String prenom, int annee, int mois, int jour)
    {
        super(nom, prenom, annee, mois, jour);
    }

    @Override
    public boolean wasBorn(GregorianCalendar date)
    {
        try
        {
            super.getAge(date);
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
}