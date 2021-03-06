package com.concepto.pucp.microservicios.app.medidas.models.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medidas")
public class Medida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_Medida")
	private Integer idMedida;
	
	@Column(name = "Id_Sensor")
	private Integer idSensor;
	
	private Integer Medida;
	
	
	@Column(name = "Hora_Medida")
	private String HoraMedida;
	
	
	private String Estado;


	public Integer getIdMedida() {
		return idMedida;
	}


	public void setIdMedida(Integer idMedida) {
		this.idMedida = idMedida;
	}


	public Integer getIdSensor() {
		return idSensor;
	}


	public void setIdSensor(Integer idSensor) {
		this.idSensor = idSensor;
	}


	public Integer getMedida() {
		return Medida;
	}


	public void setMedida(Integer medida) {
		Medida = medida;
	}


	public String getHoraMedida() {
		return HoraMedida;
	}


	public void setHoraMedida(String horaMedida) {
		HoraMedida = horaMedida;
	}


	public String getEstado() {
		return Estado;
	}


	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
	
	

}
