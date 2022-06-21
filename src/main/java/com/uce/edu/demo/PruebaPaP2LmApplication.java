package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IVehiculoRepository;
import com.uce.edu.demo.matriculacion.service.IGestorMatriculaService;
import com.uce.edu.demo.matriculacion.service.IPropietarioService;
import com.uce.edu.demo.matriculacion.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2LmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2LmApplication.class, args);
	}

	@Autowired 
	private IPropietarioService iPropietarioService;
	
	@Autowired
	@Qualifier("liviano")
	private IVehiculoService iVehiculoServiceLiviano;
	
	
	@Autowired
	private IGestorMatriculaService iGestorMatriculaService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Propietario p1 = new Propietario();
		p1.setApellido("Aguilar");
		p1.setCedula("1235");
		p1.setApellido("Juan");
		
		
		Vehiculo v1 = new Vehiculo();
		
		v1.setMarca("che");
		v1.setPlaca("pbo7789");
		v1.setTipo("L");
		v1.setModelo("avr");
	
		
		p1.setNombre("Eduardo");
		this.iPropietarioService.actualizarPropietario(p1);
		
		
		this.iGestorMatriculaService.matricular(p1, "1235");
		
		
		
		
		
	}

}
