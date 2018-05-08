package com.ceiba.vigilanteCeiba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceiba.vigilanteCeiba.persistencia.entity.Ingreso;

public interface IngresoRepository extends JpaRepository<Ingreso, Long> {

	@SuppressWarnings("unchecked")
	Ingreso save(Ingreso ingreso);
}
