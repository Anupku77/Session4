
public class Employee {
	private String EmpName;
	private String EmpId;
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		
		employee.setEmpName("Anup");
		employee.setEmpId("gur33332");
		
		System.out.println("Name of the employee " + employee.getEmpName());
		System.out.println("ID of the employee " + employee.getEmpId());
	}

}
