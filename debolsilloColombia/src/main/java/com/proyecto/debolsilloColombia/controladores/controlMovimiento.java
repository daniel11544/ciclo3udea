package com.proyecto.debolsilloColombia.controladores;

import com.proyecto.debolsilloColombia.entidades.Empresa;
import com.proyecto.debolsilloColombia.entidades.MovimientoDinero;
import com.proyecto.debolsilloColombia.servicios.servicioEmpresa;
import com.proyecto.debolsilloColombia.servicios.servicioMovimiento;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controlMovimiento{


servicioMovimiento semo;

    public controlMovimiento (servicioMovimiento semo) {
        this.semo = semo;
    }

    @GetMapping("/movimiento")
    public List<MovimientoDinero> listaMovimiento () {
        return this.semo.getListaMovimiento ();
    }

    @GetMapping("/movimiento/{id}")
    public MovimientoDinero llamarMovimiento (@PathVariable Long id) {
        return this.semo.getLLamarMovimiento ( id );
    }


    @PostMapping("/movimiento")
    public MovimientoDinero nuevoMovimiento (@RequestBody MovimientoDinero t) {
        return this.semo.nuevoMovimiento ( t );
    }

    @PutMapping("/movimiento/{id}")
    public MovimientoDinero actualizarMovimiento (@PathVariable Long id , @RequestBody MovimientoDinero actualizarMovimiento) {
        return this.semo.actualizarMovimiento ( id , actualizarMovimiento );
    }


    @DeleteMapping("/movimiento/{id}")
    public MovimientoDinero eliminarMovimiento (@PathVariable Long id) {
        return this.semo.eliminarMovimiento ( id );
    }

}
