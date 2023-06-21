import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Maz", 33456,9800.00,"IT");
    }

    @Test
    public void hasDeptName(){
        assertEquals("IT", manager.getDeptName());
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(10000.00, manager.raiseSalary(200.00),0.0);
    }


    @Test
    public void canPayBonus(){
        assertEquals(98.0, manager.payBonus(),0.0);
    }





}
