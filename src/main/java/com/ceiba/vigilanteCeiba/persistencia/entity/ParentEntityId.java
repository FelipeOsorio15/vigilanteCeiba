package com.ceiba.vigilanteCeiba.persistencia.entity;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Access(AccessType.FIELD)
public class ParentEntityId implements Serializable{

	private static final long serialVersionUID = 8843741051504673093L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="id", nullable=false, unique= true)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
