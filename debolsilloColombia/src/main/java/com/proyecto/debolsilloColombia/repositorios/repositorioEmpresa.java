package com.proyecto.debolsilloColombia.repositorios;

import com.proyecto.debolsilloColombia.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioEmpresa extends JpaRepository<Empresa, Long>{

}
