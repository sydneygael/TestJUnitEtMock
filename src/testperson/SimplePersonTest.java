package testperson;


import org.junit.Before;
import people.SimplePerson;

/**
 * 
 * @author Sydney
 *
 */
public class SimplePersonTest extends TestPerson
{
    @Before
    @Override
    public void setUp()
    {
        person = new SimplePerson("sydney", "gael", 1993,04,28);
    }
}
