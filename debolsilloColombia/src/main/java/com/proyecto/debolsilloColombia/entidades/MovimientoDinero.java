package com.proyecto.debolsilloColombia.entidades;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "MovimientoDinero")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MovimientoDinero{


    @Id
    private long id;

    private String usuario;

    private double consignar;

    private double retirar;

    private double saldoinit;



}