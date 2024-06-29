package manager;

import employee.EmployeeDemo;

public class ManagerDemo extends EmployeeDemo {
	
	public String deptname;

	public ManagerDemo(int empno, String empname, String band, String desig, double salary, String deptname) {
		super(empno, empname, band, desig, salary);
		this.deptname = deptname;
	}

	public ManagerDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getData() {
		return deptname;

	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	
	
	public static void main(String[] args) {
		ManagerDemo m = new ManagerDemo(1234, "Wipro", "B2", "CC", 1234.55, "sales");
		System.out.println(m);
		m.attendingTraining();

	}


}
