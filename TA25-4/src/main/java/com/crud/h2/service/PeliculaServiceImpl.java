package com.crud.h2.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IPeliculaDAO;
import com.crud.h2.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {
	@Autowired
	IPeliculaDAO iPeliculaDAO;
	
	@Override
	public List<Pelicula> listarPeliculas() {
		
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(Long codigo_pelicula) {
		
		return iPeliculaDAO.findById(codigo_pelicula).get();
	}
	

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Long codigo_pelicula) {
		
		iPeliculaDAO.deleteById(codigo_pelicula);
		
	}
}
