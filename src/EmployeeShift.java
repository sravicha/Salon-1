import java.util.Date;

public class EmployeeShift {
	
	private Date startDate;
	private Date endDate;
	private String employee;

	public EmployeeShift(Date startDate, Date endDate, String employee) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.employee = employee;	
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public String getEmployee() {
		return employee;
	}
	
	public String toString() {
		return "Start of Shift: " + getStartDate() + "End of Shift: " + getEndDate() + "Employee: " + getEmployee();
	}
 }

