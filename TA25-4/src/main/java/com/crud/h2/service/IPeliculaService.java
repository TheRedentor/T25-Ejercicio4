package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Pelicula;

public interface IPeliculaService {
	
	public List<Pelicula> listarPeliculas();
	
	public Pelicula guardarPelicula(Pelicula pelicula);
	
	public Pelicula peliculaXID(Long codigo_pelicula);
	
	public Pelicula actualizarPelicula(Pelicula pelicula);
	
	public void eliminarPelicula(Long codigo_pelicula);
	
}
