package com.ceiba.vigilanteCeiba.persistencia.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ingreso")
@Access(AccessType.FIELD)
public class Ingreso extends ParentEntityId {

	private static final long serialVersionUID = -4226459576259617969L;

	@Column(name = "placa", nullable = false, length=30)
	private String placa;
	
	@Column(name = "placa", nullable = false, length=30)
	private String marca;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}
