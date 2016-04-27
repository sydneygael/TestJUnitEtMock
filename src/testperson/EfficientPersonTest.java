package testperson;

import java.security.Timestamp;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Before;
import people.EfficientPerson;
/**
 * 
 * @author Sydney
 *
 */
public class EfficientPersonTest extends TestPerson
{
    @Before
    @Override
    public void setUp()
    {
        person = new EfficientPerson("sydney", "gael", 
        		Instant.now().minusNanos(
        				new GregorianCalendar(1993, 28, 04).getTime().getTime())
        		.get(ChronoField.YEAR));
    }
}
