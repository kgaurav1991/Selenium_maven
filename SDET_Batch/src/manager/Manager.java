package manager;

import employee.Employee;

public class Manager {

	public static void main(String[] args) {
		
		System.out.println("Create the Employee FirstObject Data");
		Employee firstObject = new Employee();
		
		// initialize 
		firstObject.setEmpno(12345);
		firstObject.setEmpname("Kumar");
		firstObject.setBand("B2");
		
		// get Data 
		System.out.println("Employee EmpNo====="+firstObject.getEmpno()); // 12345
		System.out.println("Employee Salary====="+firstObject.getSalary()); //0.0
		
		System.out.println("Create the Employee SecondObject Data");
		Employee secondObject = new Employee();
		
		// initialize 
		secondObject.setEmpno(1122);
		secondObject.setEmpname("Gaurav");
		
		
		// get Data 
		System.out.println("Employee EmpNo====="+secondObject.getEmpname()); // Gaurav
		System.out.println("Employee Salary====="+secondObject.getDesig()); //null
		System.out.println("Employee Salary====="+secondObject.getClass()); // class employee.Employee
		
		
		firstObject.attendingTraining();

	}

}
