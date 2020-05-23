package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Treatment {
	private Date startDate;
	private Date endDate;
	private List<Consult> listConsult; 
	private int id;    
	
	public Treatment(int id,Date startDate, Date endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.listConsult = new ArrayList<Consult>();
	}
	
	public void addConsult(Consult consult) {
		listConsult.add(consult);
		
	}

	public Date getDatStart() {
		return startDate;
	}
  
	public void setDatStart(Date startDate) {
		this.startDate = startDate;
	}
  
	public Date getendDate() {
		return endDate;
	}
  
	public void setendDate(Date endDate) {
		this.endDate = endDate;
	}
  
	public List<Consult> getListConsult() {
		return listConsult;
	}

	public void setConsult(List<Consult> listConsult) {
		this.listConsult = listConsult;
	}

	public int registerTreatment() {
		return 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String listAppointment() {
		return "";
	}
  
	public String appointmentTreatment() {
		return "";
	}
	
}
