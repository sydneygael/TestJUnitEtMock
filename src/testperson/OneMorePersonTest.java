package testperson;

import org.junit.Before;
import people.OneMorePerson;
import people.SimplePerson;

/**
 * 
 * @author Sydney
 *
 */
public class OneMorePersonTest extends TestPerson
{
    @Before
    @Override
    public void setUp()
    {
        person = new OneMorePerson("sydney", "gael", 1993,04,28);
    }
}
