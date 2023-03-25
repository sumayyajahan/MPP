package prob5;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private String name;
	private int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	
	@Override 
	public String toString() {
		return "(" + name + ":" + salary + ")";
	}
	
	@Override
	public int compareTo(Employee o) {
		if (this.name.equals(o.getName())) {
			if (this.salary == o.getSalary()) {
				return 0;
			} else if (this.salary < o.getSalary()) {
				return -1;
			} else {
				return 1;
			}
		} 
		return -1;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name) && salary == other.salary;
	}
	
}

