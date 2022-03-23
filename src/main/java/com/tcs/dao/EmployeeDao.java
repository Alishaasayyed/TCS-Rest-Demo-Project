/**
 * 
 */
package com.tcs.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.model.Employee;

/**
 * @author springuser01
 *
 */
@Repository // @Repository represent the data access layer in Spring
public class EmployeeDao {
	// Dummy database. Initialize with some dummy values.
	//Here is the all method using dummy values
		private static List<Employee> employees;
		{
			employees = new ArrayList();
			employees.add(new Employee(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
			employees.add(new Employee(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
			employees.add(new Employee(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
			employees.add(new Employee(System.currentTimeMillis(), "Viral", "Patel", "vpatel@gmail.com", "356-758-8736"));
		}
//List of customer Implementation
		public List list() {
			return employees;
		}
//Get the customer details with id 
		
		public Employee get(Long id) {

			for (Employee e : employees) {
				if (e.getId().equals(id)) {
					return e;
				}
			}
			return null;
		}
//Create Employee
		public Employee create(Employee employee) {
			employee.setId(System.currentTimeMillis());
			employees.add(employee);
			return employee;
		}
		
//Delete EMployee
		
		public Long delete(Long id) {

			for (Employee c : employees) {
				if (c.getId().equals(id)) {
					employees.remove(c);
					return id;
					
				}
			}
			return null;
}
		
//Update Employee
		public Employee update(Long id, Employee employee) {

			for (Employee c : employees) {
				if (c.getId().equals(id)) {
					employee.setId(c.getId());
					employees.remove(c);
					employees.add(employee);
					return employee;
				}
			}

			return null;
		}

}
