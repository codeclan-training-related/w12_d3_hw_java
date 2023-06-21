import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;


    @Before
    public void before(){
        developer = new Developer("Mark", 93048,888.00);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(1088.0, developer.raiseSalary(200.00),0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(8.88, developer.payBonus(),0.0);
    }
}
