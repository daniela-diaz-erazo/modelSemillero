package com.clearminds.ddi.dtos;

import java.util.Date;

import com.clearminds.ddi.utils.DateUtil;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private int id;
	private int edad;

	private String fechaFormateada = DateUtil.obtenerFecha(new Date());
	
	
	
	
	public Estudiante(String nombre, String apellido, int edad, String fechaFormateada) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaFormateada = fechaFormateada;
	}
	public Estudiante(String nombre, String apellido, int id, int edad, String fechaFormateada) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.edad = edad;
		this.fechaFormateada = fechaFormateada;
	}
	public String getFechaFormateada() {
		return fechaFormateada;
	}
	public void setFechaFormateada(String fechaFormateada) {
		this.fechaFormateada = fechaFormateada;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
