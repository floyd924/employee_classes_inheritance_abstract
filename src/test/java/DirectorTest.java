import Management.Director;
import org.junit.Before;
import Staff.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director rob;

    @Before
    public void setup(){
        rob = new Director("Rob", 6666, 60000, "Sales", 120000);
    }

    @Test
    public void canGetName(){
        assertEquals("Rob", rob.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(6666, rob.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(60000, rob.getSalary(), 0.00001);
    }

    @Test
    public void canGetDepartment(){
        assertEquals("Sales", rob.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        rob.raiseSalary(10000);
        assertEquals(70000, rob.getSalary(), 0.00001);
    }

    @Test
    public void canPayBonus(){
        double bonus = rob.payBonus();
        rob.raiseSalary(bonus);
        assertEquals(60600, rob.getSalary(), 0.00001);
    }

    @Test
    public void canGetBudget(){
        assertEquals(120000, rob.getBudget(), 0.00001);
    }

    @Test
    public void cannotAddNegativeSalary(){
        rob.raiseSalary(-4023.45);
        assertEquals(60000, rob.getSalary(), 0.000001);
    }



}
