package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IVehiculoRepository;

@Service
@Qualifier("pesado")
public class VehiculoPesadoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Override
	public void insertarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.insertar(v);
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.buscar(placa);
	}

	@Override
	public void actualizarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(v);
	}

	@Override
	public void borrarVehiculo(String placa) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.borrar(placa);
	}

	@Override
	public BigDecimal calcularValor(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = precio.multiply(new BigDecimal(0.14));
		BigDecimal descuento = new BigDecimal(7).divide(new BigDecimal(100));
		
		if(valorMatricula.compareTo(new BigDecimal(2000))==1) {
			
			
			valorMatricula = valorMatricula.subtract(valorMatricula.multiply(descuento));
		}

		return valorMatricula;
	}

}
