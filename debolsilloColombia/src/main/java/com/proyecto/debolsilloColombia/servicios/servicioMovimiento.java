package com.proyecto.debolsilloColombia.servicios;


import com.proyecto.debolsilloColombia.entidades.MovimientoDinero;
import com.proyecto.debolsilloColombia.repositorios.repositorioMovimiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicioMovimiento{

    private final com.proyecto.debolsilloColombia.repositorios.repositorioMovimiento repositorioMovimientos;
    @Autowired
    private repositorioMovimiento repositorioMovimiento;

    public servicioMovimiento (repositorioMovimiento repositorioMovimientos) {
        this.repositorioMovimientos = repositorioMovimientos;
    }

    public List<MovimientoDinero> getListaMovimiento () {
        return repositorioMovimientos.findAll ();
    }


    public MovimientoDinero getLLamarMovimiento (Long id) {
        return repositorioMovimientos.findById ( id ).get ();
    }


    public MovimientoDinero nuevoMovimiento (MovimientoDinero nuevoMovimiento) {
        return this.repositorioMovimientos.save ( nuevoMovimiento );
    }


    public MovimientoDinero actualizarMovimiento (Long id , MovimientoDinero t) {
        MovimientoDinero movimientoActual = repositorioMovimientos.findById ( id ).orElseThrow ();
        movimientoActual.setUsuario ( t.getUsuario () );
        movimientoActual.setConsignar ( t.getConsignar () );
        movimientoActual.setRetirar ( t.getRetirar () );
        movimientoActual.setSaldoinit ( t.getSaldoinit () );

        return this.repositorioMovimientos.save ( movimientoActual );
    }


    public MovimientoDinero eliminarMovimiento (Long id) {
        MovimientoDinero movimientoActual = repositorioMovimientos.findById ( id ).orElseThrow ();
        this.repositorioMovimientos.deleteById ( id );
        return movimientoActual;
    }

}
