package testperson;

import org.junit.Before;
import people.SmallCodePerson;

/**
 * 
 * @author Sydney
 *
 */
public class SmallCodePersonTest extends TestPerson
{
    @Before
    @Override
    public void setUp()
    {
        person = new SmallCodePerson("sydney", "gael", 1993,04,28);
    }
}
