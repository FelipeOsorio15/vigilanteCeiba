package com.ceiba.vigilanteCeiba.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.vigilanteCeiba.persistencia.entity.Ingreso;

public interface IngresoService extends JpaRepository<Ingreso, Long> {

	@SuppressWarnings("unchecked")
	Ingreso save(Ingreso ingreso);

}
