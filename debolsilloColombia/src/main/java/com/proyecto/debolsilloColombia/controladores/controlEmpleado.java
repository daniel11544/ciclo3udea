package com.proyecto.debolsilloColombia.controladores;

import com.proyecto.debolsilloColombia.entidades.Empleado;
import com.proyecto.debolsilloColombia.entidades.Empresa;
import com.proyecto.debolsilloColombia.servicios.servicioEmpleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class controlEmpleado{

    servicioEmpleado se20;

    public controlEmpleado (servicioEmpleado se20) {
        this.se20 = se20;
    }

    @GetMapping("/empleados")
    public String empleados(Model modelP){
        List<Empleado> empleados = this.se20.getListaEmpleado ();
        modelP.addAttribute("empleados", empleados);
        return "empleados";
    }

    @GetMapping("nuevaempleado")
    public String crearEmpleado(Model model){
        model.addAttribute("empleado", new Empleado());
        return "nuevaempleado";
    }

    @PostMapping("/empleados")
    public Empleado nuevoEmpleado(@ModelAttribute Empleado m, Model model){
        model.addAttribute ( m );
        return this.se20.nuevaEmpleado ( m );
    }

    @GetMapping("/empleados/{id}")
    public String actualizarEmpleado(@PathVariable Long id, Model model){
        Empleado empleadoFind = this.se20.getLLamarEmpleado (id);
        model.addAttribute ( "empleadoFind", empleadoFind);
        return "actualizarempleado";
    }
    @PutMapping("/empleados/{id}")
    public RedirectView actualizarEmpleado(@PathVariable Long id, Empleado actEmpleado){
        this.se20.actualizarEmpleado (id, actEmpleado);
        return new RedirectView("/empleados");
    }


    @DeleteMapping("/empleados/{id}")
    public RedirectView eliminarEmpleado(@PathVariable(value = "id") Long id){
        this.se20.eliminarEmpleado (id);
        return new RedirectView ("/empleados");
    }














}
