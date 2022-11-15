package com.crud.h2.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ISalaDAO;
import com.crud.h2.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService {
	@Autowired
	ISalaDAO iSalaDAO;
	
	@Override
	public List<Sala> listarSalas() {
		
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaXID(Long codigo_sala) {
		
		return iSalaDAO.findById(codigo_sala).get();
	}
	

	@Override
	public Sala actualizarSala(Sala sala) {
		
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(Long codigo_sala) {
		
		iSalaDAO.deleteById(codigo_sala);
		
	}
}
