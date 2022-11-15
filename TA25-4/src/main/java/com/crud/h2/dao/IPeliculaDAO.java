package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Long> {

}
