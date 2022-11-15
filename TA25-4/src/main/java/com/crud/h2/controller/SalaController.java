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

import com.crud.h2.dto.Sala;
import com.crud.h2.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {
	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return salaServiceImpl.listarSalas();
	}
	
	
	@PostMapping("/salas")
	public Sala salvarSala(Sala sala) {
		
		return salaServiceImpl.guardarSala(sala);
	}
	
	
	@GetMapping("/salas/{codigo_sala}")
	public Sala salaXID(@PathVariable(name="codigo_sala") Long codigo_sala) {
		
		Sala sala_xid= new Sala();
		
		sala_xid=salaServiceImpl.salaXID(codigo_sala);
		
		System.out.println("Sala XID: "+sala_xid);
		
		return sala_xid;
	}
	
	@PutMapping("/salas/{codigo_sala}")
	public Sala actualizarSala(@PathVariable(name="codigo_sala")Long codigo_sala,Sala sala) {
		
		Sala sala_seleccionado= new Sala();
		Sala sala_actualizado= new Sala();
		
		sala_seleccionado= salaServiceImpl.salaXID(codigo_sala);
		
		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());
		
		sala_actualizado = salaServiceImpl.actualizarSala(sala_seleccionado);
		
		System.out.println("La sala actualizada es: "+ sala_actualizado);
		
		return sala_actualizado;
	}
	
	@DeleteMapping("/salas/{codigo_sala}")
	public void eliminarSala(@PathVariable(name="codigo_sala")Long codigo_sala) {
		salaServiceImpl.eliminarSala(codigo_sala);
	}
}
