package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Sala;

public interface ISalaService {
	
	public List<Sala> listarSalas();
	
	public Sala guardarSala(Sala sala);
	
	public Sala salaXID(Long codigo_sala);
	
	public Sala actualizarSala(Sala sala);
	
	public void eliminarSala(Long codigo_sala);
	
}
