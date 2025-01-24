package org.example.Entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Empleados")
public class Empleados implements Serializable {

    @Id
    @GeneratedValue
    private Integer id_empleado;
    private String nombre;

    @Column(unique = true)
    private String email;
    private String Departamento;

    //Constructor

    public Empleados(Integer id_empleado, String nombre, String email, String departamento) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.email = email;
        Departamento = departamento;
    }

    //Get y Setter


    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    //To String


    @Override
    public String toString() {
        return "Empleados{" +
                "id_empleado=" + id_empleado +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", Departamento='" + Departamento + '\'' +
                '}';
    }
}
