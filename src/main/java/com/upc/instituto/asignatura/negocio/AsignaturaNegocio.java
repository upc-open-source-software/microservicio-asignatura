package com.upc.instituto.asignatura.negocio;

import com.upc.instituto.asignatura.entidades.Asignatura;
import com.upc.instituto.asignatura.repositorio.IAsignaturaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaNegocio implements IAsignaturaNegocio {

    @Autowired
    private IAsignaturaRepositorio iAsignaturaRepositorio;

    @Override
    public Asignatura registrar(Asignatura asignatura) {
        return iAsignaturaRepositorio.save(asignatura);
    }

    @Override
    public Asignatura buscar(Long codigo) throws Exception {
        return iAsignaturaRepositorio.findById(codigo).orElseThrow(
                () -> new Exception("No se encontró la entidad"));
    }

    @Override
    public List<Asignatura> listado() {
        return iAsignaturaRepositorio.findAll();
    }

    @Override
    public Asignatura actualizar(Asignatura asignatura) throws Exception {
        this.buscar(asignatura.getCodigo());
        return iAsignaturaRepositorio.save(asignatura);
    }

    @Override
    public void eliminar(Long codigo) throws Exception {
        this.buscar(codigo);
        iAsignaturaRepositorio.deleteById(codigo);
    }
}
