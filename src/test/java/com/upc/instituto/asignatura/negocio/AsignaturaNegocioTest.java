package com.upc.instituto.asignatura.negocio;

import com.upc.instituto.asignatura.entidades.Asignatura;
import com.upc.instituto.asignatura.repositorio.IAsignaturaRepositorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.*;

@SpringBootTest
public class AsignaturaNegocioTest {
    @Autowired
    private IAsignaturaNegocio asignaturaNegocio;

    @MockBean
    private IAsignaturaRepositorio asignaturaRepositorio;

    @Test
    void testListado() {
        Asignatura asignatura1 = new Asignatura(1L, "Java", "5", 10, "Java SE Fundamentos", new BigDecimal(1500));
        Asignatura asignatura2 = new Asignatura(1L, "Java web", "5", 10, "Java JSP y Servlets", new BigDecimal(1500));
        when(asignaturaRepositorio.findAll()).thenReturn(Stream.of(asignatura1, asignatura2).collect(Collectors.toList()));
        Assertions.assertEquals(asignaturaNegocio.listado().size(), 2);
    }

    @Test
    void testListado2() {
        Asignatura asignatura1 = new Asignatura(1L, "Java", "5", 10, "Java SE Fundamentos", new BigDecimal(1500));
        Asignatura asignatura2 = new Asignatura(1L, "Java web", "5", 10, "Java JSP y Servlets", new BigDecimal(1500));
        List<Asignatura> listadoAsignatura = Stream.of(asignatura1, asignatura2).collect(Collectors.toList());
        when(asignaturaRepositorio.findAll()).thenReturn(listadoAsignatura);
        Assertions.assertEquals(listadoAsignatura, asignaturaNegocio.listado());
    }
}
