package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoRepository {

	public void insertar(Vehiculo v);

	public Vehiculo buscar(String placa);

	public void actualizar(Vehiculo v);

	public void borrar(String placa);
}
