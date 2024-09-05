
/**
 * super, super() 키워드 예제
 */
class Employee {
	
	String name;
	int salary;
	
	public String getEmployee() { return name + ", " + salary; }
	
	public Employee() {}

	public Employee(String name, int salary) {

		this.name = name;
		this.salary = salary;
	}
}

class Manager extends Employee {
	
	String depart;
	
	public String getManager() { return super.name + ", " + super.salary + ", " + this.depart; }
	
	public Manager(String name, int salary, String depart) {
		
		super(name, salary);
		this.depart = depart;
	}
}

public class Test {

	public static void main(String[] args) {

		Employee employee = new Employee("홍길동", 2000);
		Manager manager = new Manager("이순신", 4000, "개발");
		
		System.out.println(employee.getEmployee());
		System.out.println(manager.getManager());
	}

}
