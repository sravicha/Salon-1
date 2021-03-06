import java.util.Date;

public class Appointment {

	private int id;
	private Date date;
	private String clientName;
	private String stylistName;
	private String service;

	public Appointment() {}
	public Appointment(int ID, Date date, String clientName, String stylistName, String service) {
		this.id = ID;
		this.date = date;
		this.clientName = clientName;
		this.stylistName = stylistName;
		this.service = service;
	}

	public int getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public String getStylistName() {
		return stylistName;
	}
	
	public String getService() {
		return service;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setStylistName(String stylistName) {
		this.stylistName = stylistName;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String toString() {
		return "Date: " + getDate() + "\n" +  "\n" + "Client Name: "
	    + getClientName() + "\n" + "Stylist Name: " + getStylistName() + "\n" + "Service: " +
		getService();
	}
}
