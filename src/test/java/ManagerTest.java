import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager employee;

    @Before
    public void setup(){
        employee = new Manager("Bob", 1234, 30000, "Admissions");
    }

    @Test
    public void canGetName(){
       assertEquals("Bob", employee.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(1234, employee.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, employee.getSalary(), 0.00001);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(1000);
        assertEquals(31000, employee.getSalary(), 0.00001);
    }

    @Test
    public void canPayBonus(){
        double bonus = employee.payBonus();
        assertEquals(30300, (bonus + employee.getSalary()), 0.00001);
    }

    @Test
    public void canGetDeptName(){

        assertEquals("Admissions", employee.getDeptName());
    }
}
