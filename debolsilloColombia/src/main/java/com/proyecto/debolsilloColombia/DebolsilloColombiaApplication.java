package com.proyecto.debolsilloColombia;

import com.proyecto.debolsilloColombia.entidades.Empleado;
import com.proyecto.debolsilloColombia.entidades.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class DebolsilloColombiaApplication{
	public static
	void main ( String[] args ) {
		SpringApplication.run ( DebolsilloColombiaApplication.class , args );

	}
}
