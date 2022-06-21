package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioService {

	public void insertarPropietario(Propietario p);

	public void borrarPropietario(String cedula);
	public void actualizarPropietario(Propietario p);
}
