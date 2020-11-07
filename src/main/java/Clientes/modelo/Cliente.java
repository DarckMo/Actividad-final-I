package Clientes.modelo;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_Cliente")
	private long idclient;
	
	@Column(name="Nombre_Cliente")
	private String NamaeClient;
	
	@Column(name="Apellido_Cliente")
	private String ApeClient;
	
	@Column(name="Direccion_Cliente")
	private String DirecClient;
	
	@Column(name="Email_Cliente")
	private String EClient;
	
	@Column(name="DUI_Cliente")
	private String DUIClient;
	
	@JsonProperty("FeNac")
	@Column(name="Fecha_Nacimiento")
	@JsonFormat(pattern="dd/mm/yyyy")
	private Date FeNac;
	
	
	
	public Cliente() {
		
		
	}
	
	
	public Cliente(Long idClient, String NamaeClient , String ApeClient , String DirecClient , 
			String EClient , String DUIClient , Date FeNac) {
	
		this.idclient = idClient;
		this.NamaeClient = NamaeClient;
		this.ApeClient = ApeClient;
		this.DirecClient = DirecClient;
		this.EClient = EClient;
		this.DUIClient = DUIClient;
		this.FeNac = FeNac;
		
	}
	
	
	
	
	public long getIdclient() {
		return idclient;
	}

	
	public void setIdclient(long idclient) {
		this.idclient = idclient;
	}


	public String getNamaeClient() {
		return NamaeClient;
	}


	public void setNamaeClient(String namaeClient) {
		NamaeClient = namaeClient;
	}


	public String getApeClient() {
		return ApeClient;
	}


	public void setApeClient(String apeClient) {
		ApeClient = apeClient;
	}


	public String getDirecClient() {
		return DirecClient;
	}


	public void setDirecClient(String direcClient) {
		DirecClient = direcClient;
	}


	public String getEClient() {
		return EClient;
	}


	public void setEClient(String eClient) {
		EClient = eClient;
	}

	public String getDUIClient() {
		return DUIClient;
	}


	public void setDUIClient(String dUIClient) {
		DUIClient = dUIClient;
	}


	public Date getFeNac() {
		return FeNac;
	}

	
	public void setFeNac(Date feNac) {
		FeNac = feNac;
	}

}
