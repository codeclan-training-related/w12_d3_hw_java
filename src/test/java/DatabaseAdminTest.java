import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Zhu", 93048,888.00);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(1088.0, databaseAdmin.raiseSalary(200.00),0.0);
    }


    @Test
    public void canPayBonus(){
        assertEquals(8.88, databaseAdmin.payBonus(),0.0);
    }




}
