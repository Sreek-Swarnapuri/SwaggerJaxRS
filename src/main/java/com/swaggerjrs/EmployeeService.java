package com.swaggerjrs;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	
	private List<Employee> eList;
	
	private static EmployeeService ourInstance = new EmployeeService();
	
	public static EmployeeService getInstance() {
		return ourInstance;
	}
	
	private EmployeeService() {
		eList = new ArrayList<>();
		
		Employee e1 = new Employee();
		
		Employee e2 = new Employee();
		
		e1.setFirstName("first");
		e1.setLastName("last name");
		
		e2.setFirstName("1");
		e2.setLastName("lnmae");
		
		eList.add(e1);
		
		eList.add(e2);
		
		
	}
	
	public List<Employee> getEmployees(){
		return eList;
	}

}
