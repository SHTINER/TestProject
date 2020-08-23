
public class EmployeeLogic {
	static int yearlySalary(Employee emp) {
		return emp.getSalary() * 12;
	}

	static double calcPremium(Employee emp) {
		return emp.getSalary() * 0.1;
	}
}
