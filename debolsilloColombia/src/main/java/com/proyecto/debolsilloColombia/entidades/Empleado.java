package com.proyecto.debolsilloColombia.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "empleado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Empleado{

    @Id
    private long id;

    private String nombre;

    private String correo;

    private String empresaEmpleadoPertenece;

    private String rolempleado;


}
