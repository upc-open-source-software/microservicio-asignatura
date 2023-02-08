package com.upc.instituto.asignatura.rest;

import com.upc.instituto.asignatura.entidades.Asignatura;
import com.upc.instituto.asignatura.negocio.IAsignaturaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/asignatura")
public class AsignaturaRest {
    @Autowired
    private IAsignaturaNegocio iAsignaturaNegocio;

    @GetMapping
    public List<Asignatura> listado(){
        return this.iAsignaturaNegocio.listado();
    }

    @PostMapping
    public Asignatura registrar(@RequestBody Asignatura asignatura){
        return this.iAsignaturaNegocio.registrar(asignatura);
    }

    @GetMapping("/{id}")
    public Asignatura buscar(@PathVariable("id") Long codigo) {
        try {
            return this.iAsignaturaNegocio.buscar(codigo);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Asignatura no existe en la base de datos", e);
        }
    }

    @PutMapping("/{id}")
    public Asignatura actualizar(@RequestBody Asignatura asignatura, @PathVariable("id") Long codigo) throws Exception {
        try {
            asignatura.setCodigo(codigo);
            return this.iAsignaturaNegocio.actualizar(asignatura);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Asignatura no existe en la base de datos", e);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable("id") Long codigo) throws Exception {
        try {
            this.iAsignaturaNegocio.eliminar(codigo);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Asignatura no existe en la base de datos", e);
        }
    }
}
