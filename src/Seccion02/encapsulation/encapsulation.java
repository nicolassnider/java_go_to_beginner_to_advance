package Seccion02.encapsulation;

public class encapsulation {
	private int ssn;
	private String empName;
	private int empAge;
	
	public int getSsn() {
		return ssn;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	
}
