package com.proyecto.debolsilloColombia.repositorios;


import com.proyecto.debolsilloColombia.entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioMovimiento extends JpaRepository<MovimientoDinero, Long>{

}
