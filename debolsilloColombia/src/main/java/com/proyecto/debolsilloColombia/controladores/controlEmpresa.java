package com.proyecto.debolsilloColombia.controladores;


import com.proyecto.debolsilloColombia.entidades.Empresa;
import com.proyecto.debolsilloColombia.servicios.servicioEmpresa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class controlEmpresa{
    servicioEmpresa se10;

    public controlEmpresa (servicioEmpresa se10) {
        this.se10 = se10;
    }


    @GetMapping("/empresas")
    public String empresas(Model modelP){
        List<Empresa> empresas = this.se10.getListaEmpresas ();
        modelP.addAttribute("empresas", empresas);
        return "empresas";
    }

    @GetMapping("nuevaempresa")
    public String crearEmpresa(Model model){
        model.addAttribute("empresa", new Empresa());
        return "nuevaempresa";
    }

@PostMapping("/empresas")
public Empresa nuevaEmpresa(@ModelAttribute Empresa e, Model model){
        model.addAttribute ( e );
        return this.se10.nuevaEmpresa ( e );
}

@GetMapping("/empresas/{id}")
    public String actualizarEmpresa(@PathVariable Long id, Model model){
        Empresa empresaFind = this.se10.getLLamarEmpresas ( id );
        model.addAttribute ( "empresaFind", empresaFind);
        return "actualizarempresa";
}


    @PutMapping("/empresas/{id}")
        public RedirectView actualizarEmpresa(@PathVariable Long id, Empresa actEmpresa){
        this.se10.actualizarEmpresa (id, actEmpresa);
        return new RedirectView("/empresas");
    }


    @DeleteMapping("/empresas/{id}")
    public RedirectView eliminarEmpresa(@PathVariable(value = "id") Long id){
       this.se10.eliminarEmpresa (id);
       return new RedirectView ("/empresas");
    }


















    //editar un registro
//    @PutMapping("/empresas/{id}")
//    public RedirectView actualizarEmpresa(@PathVariable Long id, Empresa actEmpresa){
//        this.se10.actualizarEmpresa (id, actEmpresa);
//        return new RedirectView("/empresas");
//    }






//
//    @PutMapping("/empresas/{id}")
//    public Empresa actualizarEmpresa (@PathVariable Long id , @RequestBody Empresa actualizarEmpresa) {
//        return this.se10.actualizarEmpresa ( id , actualizarEmpresa );
//    }
//
//
//    @DeleteMapping("/empresas/{id}")
//    public Empresa eliminarEmpresa (@PathVariable Long id) {
//        return this.se10.eliminarEmpresa ( id );
//    }
}




