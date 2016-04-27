package testperson;

import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import person.OutilsPerson;

import static org.mockito.Mockito.*;
import persons.IPerson;


/**
 * 
 * @author Sydney
 *
 */
public class OutilsPersonTestMock
{
    public OutilsPersonTestMock()
    {
    }
    
    protected OutilsPerson outilsPerson;
    protected IPerson[] personnes;
    protected GregorianCalendar calendar;
    
    @BeforeClass
    public static void setUpClass()
    { 
    	
    }
    
    @AfterClass
    public static void tearDownClass()
    { 
    	
    }
    
    @Before
    public void setUp()
    {
        outilsPerson = new OutilsPerson();
        
        calendar = new GregorianCalendar(2005, 10, 17);
        
        personnes = new IPerson[]
        {
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class),
            mock(IPerson.class)
        };
        
        for(int i = 0; i < personnes.length; i++)
        	when(personnes[i].getAge(calendar)).thenReturn(i+10);
    }
    
    @After
    public void tearDown()
    { }

    @Test
    public void testerGetPersonneEntreAge()
    {
        
        IPerson[] resultat = new IPerson[]
        {
            personnes[1],
            personnes[2],
            personnes[3]
        };
        
        assertArrayEquals(outilsPerson.getPersonnesEntreAge(personnes, calendar, 10, 13),
                resultat);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testergetPersonneIllegalException()
    {
        outilsPerson.getPersonnesEntreAge(personnes, calendar, 20, 15);
    }
    
    /**
     * question 9
     */
    @Test
    public void testerRechercheAgeMax()
    {
        assertEquals(outilsPerson.rechercheAgeMax(personnes, calendar), personnes.length - 1+10);
        
        for(IPerson p : personnes)
        {
            verify(p, never()).getFirstName();
            verify(p, never()).getName();
        }
    }
}
