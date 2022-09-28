package com.proyecto.debolsilloColombia.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Empresa")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Empresa{



    @Id
    private long id;

    private String nombre;

    private String direccion;

    private int telefono;

    private String nit;





}
