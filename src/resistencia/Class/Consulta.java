package resistencia.Class;

import java.util.Date;

public class Consulta 
{
	private Date consultDate;
	private String historic;
	
	public String getHistoric() {
		return historic;
	}

	public void setHistoric(String historico) {
		this.historic = historico;
	}

	public Date getConsultDate() {
		return consultDate;
	}

	public void setConsultDate(Date consultaDate) {
		this.consultDate = consultaDate;
	}		
	
	
	public String listConsults()
	{
		return "";		
	}
	
	public String viewConsulta() 
	{
		return "";		
	}
	
	public int registryConsult() 
	{
		return 0;		
	}
}
