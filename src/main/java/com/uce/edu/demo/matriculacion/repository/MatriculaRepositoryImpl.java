package com.uce.edu.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl  implements IMatriculaRepository{

	@Override
	public void insertar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("La matricula ingreso al sistema: " + m);
	}

}
