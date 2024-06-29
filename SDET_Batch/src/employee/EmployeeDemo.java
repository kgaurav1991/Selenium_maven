package employee;

public class EmployeeDemo {
	private int empno;
	private String empname;
	private String band;
	private String desig;
	public double salary;
	
	protected void attendingTraining() {
		System.out.println("SDET Java Training");
	}

	public EmployeeDemo(int empno, String empname, String band, String desig,double salary) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.band = band;
		this.desig = desig;
		this.salary = salary;
	}
	
	public EmployeeDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return  "[Empno=" +empno+ "   |EmpName="+empname+ "    |Band=" +band+ "   |Desog="  +desig+  "   |Salary=" +salary+ "]";
		
	}

}
