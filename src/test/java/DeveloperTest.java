import Staff.Employee;
import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Employee iain;

    @Before
    public void setup(){
        iain = new Developer("iain", 7777, 40000);
    }

    @Test
    public void canGetName(){
        assertEquals("iain", iain.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(7777, iain.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, iain.getSalary(), 0.00001);
    }

    @Test
    public void canIncreaseSalary(){
        iain.raiseSalary(10000);
        assertEquals(50000, iain.getSalary(), 0.00001);
    }

    @Test
    public void canGetBonusAndPayBonus(){
        double bonus = iain.payBonus();
        iain.raiseSalary(bonus);
        assertEquals(40400, iain.getSalary(), 0.00001);
    }
}
