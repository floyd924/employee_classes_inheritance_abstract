import Staff.Employee;
import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    Employee employee;

    @Before
    public void setup(){
        employee = new DatabaseAdmin("Sam", 9876, 25000);
    }

    @Test
    public void canGetName(){
        assertEquals("Sam", employee.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(9876, employee.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, employee.getSalary(), 0.00001);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(1000);
        assertEquals(26000, employee.getSalary(), 0.00001);
    }

    @Test
    public void canReceiveBonus(){
        double bonus = employee.payBonus();
        employee.raiseSalary(bonus);
        assertEquals(25250, employee.getSalary(), 0.00001);
    }


}
