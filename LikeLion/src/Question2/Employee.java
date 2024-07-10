package Question2;

public class Employee {
	private int salary;

	public Employee(int salary) {
		this.salary = salary;
	}

	public Employee() {
	}

	public int getSalary() {
		return this.salary;
	}

	public void working() {
		System.out.println("Working as an employee!");
		System.out.println("Employee salary: " + getSalary() + "\n");
	}

}
