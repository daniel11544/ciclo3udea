//package com.proyecto.debolsilloColombia.entidades;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.Entity;
//import javax.persistence.*;
//
//@Entity
//
//
//@Table(name="usuarios")
//public class usuario{
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    @Column(name = "email", unique = true)
//    private String email;
//    @Column (name = "imagen")
//    private String imagen;
//    @Column(name = "auth0Id", unique = true)
//    private String auth0Id;
//
//    public usuario () {
//    }
//
//    public usuario (Long id , String email , String imagen , String auth0Id) {
//        this.id      = id;
//        this.email   = email;
//        this.imagen  = imagen;
//        this.auth0Id = auth0Id;
//    }
//
//    public usuario (String s , String s1 , String s2) {
//    }
//
//    public Long getId () {
//        return id;
//    }
//
//    public void setId (Long id) {
//        this.id = id;
//    }
//
//    public String getEmail () {
//        return email;
//    }
//
//    public void setEmail (String email) {
//        this.email = email;
//    }
//
//    public String getImagen () {
//        return imagen;
//    }
//
//    public void setImagen (String imagen) {
//        this.imagen = imagen;
//    }
//
//    public String getAuth0Id () {
//        return auth0Id;
//    }
//
//    public void setAuth0Id (String auth0Id) {
//        this.auth0Id = auth0Id;
//    }
//}
