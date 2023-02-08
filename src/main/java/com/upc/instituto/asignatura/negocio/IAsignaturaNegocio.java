package com.upc.instituto.asignatura.negocio;

import com.upc.instituto.asignatura.entidades.Asignatura;

import java.util.List;

public interface IAsignaturaNegocio {
    public Asignatura registrar(Asignatura asignatura);

    public  Asignatura buscar(Long codigo) throws Exception;

    public List<Asignatura> listado();

    public Asignatura actualizar(Asignatura asignatura) throws Exception;

    public void eliminar(Long codigo) throws Exception;

}
