package com.uce.edu.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha ingresado un propietario a la base: " + p);
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado un propietario de la base: " + cedula);
		
	}

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el propietario de la base: " + p);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		//System.out.println("Se ha buscado en la base el propietario: " + cedula);
		Propietario p = new Propietario();
		p.setCedula(cedula);
		p.setApellido("Ramirez");
		p.setNombre("Alexander");
		return p;
	}

}
