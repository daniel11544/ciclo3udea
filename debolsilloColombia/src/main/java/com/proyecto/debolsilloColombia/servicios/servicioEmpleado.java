package com.proyecto.debolsilloColombia.servicios;

import com.proyecto.debolsilloColombia.entidades.Empleado;
import com.proyecto.debolsilloColombia.repositorios.repositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicioEmpleado{

    @Autowired
    private repositorioEmpleado repositorioEmpleados;

    public servicioEmpleado (repositorioEmpleado repositorioEmpleados) {
        this.repositorioEmpleados = repositorioEmpleados;
    }


    public List<Empleado> getListaEmpleado () {
        return this.repositorioEmpleados.findAll ();}


    public Empleado getLLamarEmpleado (Long id) {
        return repositorioEmpleados.findById (id).get ();
    }

    public Empleado nuevaEmpleado (Empleado nuevoEmpleado) {
        return this.repositorioEmpleados.save ( nuevoEmpleado );
    }

    public Empleado actualizarEmpleado (Long id , Empleado m) {
        Empleado empleadoActual = repositorioEmpleados.findById ( id ).orElseThrow ();
        empleadoActual.setNombre ( m.getNombre () );
        empleadoActual.setCorreo ( m.getCorreo () );
        empleadoActual.setEmpresaEmpleadoPertenece ( m.getEmpresaEmpleadoPertenece () );
        empleadoActual.setRolempleado ( m.getRolempleado () );

        return this.repositorioEmpleados.save ( empleadoActual );

    }


    public Empleado eliminarEmpleado (Long id) {
        Empleado empleadoActual = repositorioEmpleados.findById ( id ).orElseThrow();
        this.repositorioEmpleados.deleteById ( id );
        return empleadoActual;

    }


}
