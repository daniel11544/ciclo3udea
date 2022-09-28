//package com.proyecto.debolsilloColombia.servicios;
//
//
//import com.proyecto.debolsilloColombia.entidades.usuario;
//import com.proyecto.debolsilloColombia.repositorios.repositoriousuario;
//import org.springframework.stereotype.Service;
//
//import java.util.Map;
//
//@Service
//public class serviciousuarios {
//
//    private repositoriousuario repositorious;
//
//    //cosntructor
//
//
//    public void ServiciosUsuarios(repositoriousuario repositorious) {
//        this.repositorious = repositorious;
//    }
//
//    public repositoriousuario getRepositorioUs() {
//        return repositorious;
//    }
//
//    public void setRepositorioUs(repositoriousuario repositorious) {
//        this.repositorious = repositorious;
//    }
//
//    //métodos funcionales
//
//
//    //función que busca al usuario
//    public usuario buscarPorEmail(String email){
//        return this.repositorious.findByEmail(email);
//    }
//
//    //función que guarda a un nuevo usuario
//    public usuario crearUsuario(usuario nuevoUsuario){
//        return this.repositorious.save(nuevoUsuario);
//    }
//
//    public usuario getOrCreateUsuario(Map<String, Object> DatosUsuario){
//        String email = (String) DatosUsuario.get("email");
//        usuario usuario = buscarPorEmail(email);
//
//        if (usuario == null){
//            String alias = (String) DatosUsuario.get("nickname");
//            String imagen = (String) DatosUsuario.get("picture");
//            String auth0Id = (String) DatosUsuario.get("sub");
//
//            usuario nuevoUsuario = new usuario(email=email, imagen=imagen, auth0Id=auth0Id);
//            return crearUsuario(nuevoUsuario);
//        }
//        System.out.println(usuario.getEmail());
//        return usuario;
//    }
//
//}