package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {

	public void insertar(Propietario p);

	public void borrar(String cedula);
	
	public void actualizar(Propietario p);
}
