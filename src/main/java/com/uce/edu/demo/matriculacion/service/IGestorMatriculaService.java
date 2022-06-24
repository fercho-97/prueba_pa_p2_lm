package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IGestorMatriculaService {

	
	public BigDecimal valorMatricula(Vehiculo v);
	
	public void matricular(String cedula, String placa);
	
	
}
