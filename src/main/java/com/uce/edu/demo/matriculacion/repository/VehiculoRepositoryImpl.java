package com.uce.edu.demo.matriculacion.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se inserta en la base el vehiculo: " + v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		//System.out.println("Se ha buscado en la base el  vehiculo liviano por placa: " + placa);
		Vehiculo v = new Vehiculo();
		v.setPlaca("1235");
		v.setMarca("toyota");
		v.setModelo("cross");
		v.setPrecio(new BigDecimal(2500));
		v.setTipo("L");
		return v;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el vehiculo: " + v);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el vehiculo liviano: " + placa);
	}

}
