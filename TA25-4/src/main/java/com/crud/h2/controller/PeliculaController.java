package com.crud.h2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Pelicula;
import com.crud.h2.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {
	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaServiceImpl.listarPeliculas();
	}
	
	
	@PostMapping("/peliculas")
	public Pelicula salvarPelicula(Pelicula pelicula) {
		
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}
	
	
	@GetMapping("/peliculas/{codigo_pelicula}")
	public Pelicula peliculaXID(@PathVariable(name="codigo_pelicula") Long codigo_pelicula) {
		
		Pelicula pelicula_xid= new Pelicula();
		
		pelicula_xid=peliculaServiceImpl.peliculaXID(codigo_pelicula);
		
		System.out.println("Pelicula XID: "+pelicula_xid);
		
		return pelicula_xid;
	}
	
	@PutMapping("/peliculas/{codigo_pelicula}")
	public Pelicula actualizarPelicula(@PathVariable(name="codigo_pelicula")Long codigo_pelicula,Pelicula pelicula) {
		
		Pelicula pelicula_seleccionado= new Pelicula();
		Pelicula pelicula_actualizado= new Pelicula();
		
		pelicula_seleccionado= peliculaServiceImpl.peliculaXID(codigo_pelicula);
		
		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacionEdad(pelicula.getCalificacionEdad());
		
		pelicula_actualizado = peliculaServiceImpl.actualizarPelicula(pelicula_seleccionado);
		
		System.out.println("La pelicula actualizada es: "+ pelicula_actualizado);
		
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/peliculas/{codigo_pelicula}")
	public void eliminarPelicula(@PathVariable(name="codigo_pelicula")Long codigo_pelicula) {
		peliculaServiceImpl.eliminarPelicula(codigo_pelicula);
	}
}
