package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="peliculas")
public class Pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo_pelicula;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "calificacion_edad")
	private int calificacion_edad;
	
	@OneToMany
    @JoinColumn(name="codigo_pelicula")
    private List<Sala> sala;
	
	public Pelicula() {
		
	}

	/**
	 * @param codigo_pelicula
	 * @param nombre
	 * @param calificacion_edad
	 */
	public Pelicula(Long codigo_pelicula, String nombre, int calificacion_edad) {
		//super();
		this.codigo_pelicula = codigo_pelicula;
		this.nombre = nombre;
		this.calificacion_edad = calificacion_edad;
	}

	
	//Getters y Setters
	
	/**
	 * @return codigo_pelicula
	 */
	public Long getId() {
		return codigo_pelicula;
	}

	/**
	 * @param codigo_pelicula
	 */
	public void setId(Long codigo_pelicula) {
		this.codigo_pelicula = codigo_pelicula;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return calificacion_edad
	 */
	public int getCalificacionEdad() {
		return calificacion_edad;
	}

	/**
	 * @param calificacion_edad
	 */
	public void setCalificacionEdad(int calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}
	
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Pelicula [codigo_pelicula=" + codigo_pelicula + ", nombre=" + nombre + ", calificacion_edad=" + calificacion_edad + "]";
	}
}
