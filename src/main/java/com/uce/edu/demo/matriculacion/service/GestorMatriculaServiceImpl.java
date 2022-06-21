package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IMatriculaRepository;
import com.uce.edu.demo.matriculacion.repository.IVehiculoRepository;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Autowired
	@Qualifier("liviano")
	private IVehiculoService iVehiculoServiceLiviano;

	@Autowired
	@Qualifier("pesado")
	private IVehiculoService iVehiculoServicePesado;
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	

	@Override
	public BigDecimal valorMatricula(Vehiculo v) {
		// TODO Auto-generated method stub
		BigDecimal valorMatricula = null;
		Vehiculo vehiculo = this.iVehiculoRepository.buscar(v.getPlaca());

		if (v.getTipo().equals("L")) {
			// Liviano
			valorMatricula = this.iVehiculoServiceLiviano.calcularValor(v.getPrecio());
		} else {
			// Pesado
			valorMatricula = this.iVehiculoServicePesado.calcularValor(v.getPrecio());
		}
		return valorMatricula;

	}

	@Override
	public void matricular(Propietario p, String placa) {
		// TODO Auto-generated method stub
		
		Vehiculo v = iVehiculoRepository.buscar(placa);
		
		Matricula m = new Matricula();
		m.setFechaMatricula(LocalDate.now());
		m.setValorMatricula(v.getPrecio());
		m.setP(p);
		m.setV(v);
		
		this.iMatriculaRepository.insertar(m);
	
	}

}
