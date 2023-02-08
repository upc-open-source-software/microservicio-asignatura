package com.upc.instituto.asignatura.repositorio;

import com.upc.instituto.asignatura.entidades.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAsignaturaRepositorio extends JpaRepository<Asignatura, Long> {

}
