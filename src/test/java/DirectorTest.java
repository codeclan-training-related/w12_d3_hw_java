import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director =new Director("Joe",43345778,1000.00,"IT",500.00);

    }

    @Test
    public void hadBudget(){
        assertEquals(500.00, director.getBudget(),0.0);
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(1200.00, director.raiseSalary(200.00),0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(10.00, director.payBonus(),0.0);
    }



}
