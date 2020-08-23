
public class Employee {
	private String name;
	private int salary;
	private int experience;

	
	
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getExperience() {
		return experience;
	}

	public Employee(int salary) {
		this.salary = salary;
	}

	public Employee(String name, int salary, int experience) {
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}
}
