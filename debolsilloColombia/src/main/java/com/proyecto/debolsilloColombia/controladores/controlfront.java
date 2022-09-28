package com.proyecto.debolsilloColombia.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class controlfront{

    @GetMapping("/") //ruta raíz
    public String index(){
        return "index";
    }

//    @GetMapping("/") //ruta raíz
//    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
//        if (principal != null){
//            usuario usuario = this.servicious.getOrCreateUsuario (principal.getClaims());
//            model.addAttribute("usuario", usuario);
//        }
//        return "index";
//    }
//
//serviciousuarios servicious;
//
//    public controlfront (serviciousuarios servicious) {
//        this.servicious = servicious;
//    }




}




