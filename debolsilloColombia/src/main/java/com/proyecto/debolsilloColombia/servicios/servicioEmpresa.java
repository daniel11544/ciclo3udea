package com.proyecto.debolsilloColombia.servicios;

import com.proyecto.debolsilloColombia.entidades.Empresa;
import com.proyecto.debolsilloColombia.repositorios.repositorioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicioEmpresa{

    @Autowired
    private repositorioEmpresa repositoriosEmpresa;

    public servicioEmpresa (repositorioEmpresa repositoriosEmpresa) {
        this.repositoriosEmpresa = repositoriosEmpresa;
    }



    //metodo para visualizar el get
    public List<Empresa> getListaEmpresas () {

        return this.repositoriosEmpresa.findAll ();
    }

    //llamar uno solo
    public Empresa getLLamarEmpresas (Long id) {
        Empresa empresaLlamada = repositoriosEmpresa.findById ( id ).get ();
        return empresaLlamada;

    }

    public Empresa nuevaEmpresa (Empresa nuevaEmpresa) {
        return this.repositoriosEmpresa.save ( nuevaEmpresa );
    }

    public Empresa actualizarEmpresa(Long id, Empresa e){
        Empresa empresaActual = repositoriosEmpresa.findById(id).orElseThrow();
        empresaActual.setNombre(e.getNombre());
        empresaActual.setDireccion ( e.getDireccion () );
        empresaActual.setTelefono ( e.getTelefono () );
        empresaActual.setNit ( e.getNit () );
        return this.repositoriosEmpresa.save ( empresaActual );
    }


    public Empresa eliminarEmpresa (Long id) {
        Empresa empresaActual = repositoriosEmpresa.findById ( id ).orElseThrow ();
        this.repositoriosEmpresa.deleteById ( id );
        return empresaActual;
    }


}