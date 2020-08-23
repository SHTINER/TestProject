import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmployeeTest {
	private Employee a;
	private int expResultSalary;
	private double expResultPremium;

	public EmployeeTest(Employee a, int expResultSalary, double expResultPremium) {
		this.a = a;
		this.expResultSalary = expResultSalary;
		this.expResultPremium = expResultPremium;
	}

	@Parameterized.Parameters
	public static Collection employee() {
		return Arrays.asList(new Object[][] { { new Employee(500), 6000, 50 }, { new Employee(1000), 12000, 100 },
				{ new Employee(300), 3600, 30 }, { new Employee(600), 7200, 60 }, { new Employee(800), 9600, 80 } });
	}

	@Test
	public void testYearlySalary() {
		System.out.println("Test yearly salary");
		int result = EmployeeLogic.yearlySalary(a);
		Assert.assertEquals(expResultSalary, result);
	}

	@Test
	public void testCalcPremium() {
		System.out.println("Test premium");
		double result = EmployeeLogic.calcPremium(a);
		Assert.assertTrue(expResultPremium == result);
	}

}
