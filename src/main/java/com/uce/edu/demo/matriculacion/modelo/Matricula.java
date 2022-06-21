package com.uce.edu.demo.matriculacion.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Matricula {

	private LocalDate fechaMatricula;
	private BigDecimal valorMatricula;
	private Propietario p;
	private Vehiculo v;
	
	
	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula + ", p=" + p
				+ ", v=" + v + "]";
	}
	
	//SET Y GET
	public LocalDate getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDate fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public Propietario getP() {
		return p;
	}
	public void setP(Propietario p) {
		this.p = p;
	}
	public Vehiculo getV() {
		return v;
	}
	public void setV(Vehiculo v) {
		this.v = v;
	}
	
	
}
