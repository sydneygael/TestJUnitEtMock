package testperson;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import person.Person;
import persons.IPerson;
/**
 * 
 * @author Sydney
 *
 */
public class TestPerson {
	
	protected IPerson person;
	
	protected GregorianCalendar thisDay;
	protected GregorianCalendar dateNaissance;
	
	@Before
	public void setUp() {
		
		this.person = new Person("Sydney", "gael", 1993, 04, 28);
		this.thisDay = new GregorianCalendar();
		this.dateNaissance = new GregorianCalendar(1993, 04, 28);
	}
	
	@Test
	public void testGetAge() {
		// tester si age valide
		assertEquals(22,person.getAge(this.thisDay));
		assertEquals(0,person.getAge(this.dateNaissance));
	}
	
	@Test(expected = IllegalArgumentException.class)
    public void getAgeException()
    {
        person.getAge(new GregorianCalendar(2000, 04, 28));
    }
    
    @Test
    public void testwasBorn()
    {
        assertEquals(false, person.wasBorn(new GregorianCalendar(2000, 0, 0)));
        assertEquals(true, person.wasBorn(new GregorianCalendar(2010, 10, 10)));
    }
}