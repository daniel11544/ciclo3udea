package com.proyecto.debolsilloColombia.repositorios;


import com.proyecto.debolsilloColombia.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioEmpleado extends JpaRepository<Empleado, Long>{
}
