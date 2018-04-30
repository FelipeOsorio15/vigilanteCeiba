package com.ceiba.vigilanteCeiba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceiba.vigilanteCeiba.dao.IngresoRepository;
import com.ceiba.vigilanteCeiba.persistencia.entity.Ingreso;

@Service
public abstract class IngresoServiceImpl implements IngresoService {
	
	@Autowired
	protected IngresoRepository  ingresoRepository;
	
	@SuppressWarnings("unchecked")
	@Override
	public Ingreso save(Ingreso ingreso) {
		return this.ingresoRepository.save(ingreso);
	}

}
