package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="salas")
public class Sala {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo_sala;
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
    @JoinColumn(name="codigo_pelicula")
    private Pelicula pelicula;
	
	public Sala() {
		
	}

	/**
	 * @param codigo_sala
	 * @param nombre
	 * @param codigo_pelicula
	 */
	public Sala(Long codigo_sala, String nombre, Pelicula pelicula) {
		//super();
		this.codigo_sala = codigo_sala;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	
	//Getters y Setters
	
	/**
	 * @return codigo_sala
	 */
	public Long codigo_sala() {
		return codigo_sala;
	}

	/**
	 * @param codigo_sala
	 */
	public void setId(Long codigo_sala) {
		this.codigo_sala = codigo_sala;
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
	 * @return pelicula
	 */
	public Pelicula getPelicula() {
		return pelicula;
	}

	/**
	 * @param almacen
	 */
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Sala [codigo_sala=" + codigo_sala + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}
}
