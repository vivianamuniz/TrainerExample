package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q7 {

	public class Employee implements Comparator<Employee>{
		String name, department;
		Integer age;
		
		public int compare(Employee employee, Employee otherEmployee) {
			if (employee.name == otherEmployee.name) {
				if (employee.department == otherEmployee.department) {
					return employee.age.compareTo(otherEmployee.age);
				} else {
					return employee.department.compareTo(otherEmployee.department);
				}
			}else {
				return employee.name.compareTo(otherEmployee.name);
			}
		}
			public String toString() {
				return name + ", " + department + ", " + age + ".";
			}
		
		
			
		}
	

	public void Compare() {
		Employee bill = new Employee();
		bill.name = "Bill";
		bill.department = "Accounting";
		bill.age = 40;
		
		Employee paul = new Employee();
		paul.name = "Paul";
		paul.department = "Accounting";
		paul.age = 36;
		
		Employee bill2 = new Employee();
		bill2.name = "Bill";
		bill2.department = "Accounting";
		bill2.age = 38;
		
		Employee paul2 = new Employee();
		paul2.name = "Paul";
		paul2.department = "Sales";
		paul2.age = 39;
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(bill);
		employees.add(paul);
		employees.add(bill2);
		employees.add(paul2);
		
		Collections.sort(employees, new Employee());
		
		for (int i = 0; i < employees.size(); ++i) {
			System.out.println(employees.get(i).toString());
		}
		
	}

		
		
	}

