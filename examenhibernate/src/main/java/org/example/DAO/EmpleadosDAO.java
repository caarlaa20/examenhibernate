package org.example.DAO;

import org.example.Entities.Empleados;

import java.util.List;

public interface EmpleadosDAO {

    List<Empleados> findAll();

    Empleados findById(Integer id);

    List<Empleados> findByNombre(String nombre);

    Empleados create(Empleados Empleados);

    Empleados update (Empleados Empleados);

    boolean deleteById (Integer id);
}
