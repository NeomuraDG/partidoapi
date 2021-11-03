package com.misiontic.partidosapi.models;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Equipos")
public class Equipo {

   @Id
   private String id;

   @NotEmpty(message = "El campo nombre no puede estar vacio")
   private String nombre;

   private String escudo;
   private String ciudad;


   public Equipo(){

   }

   public Equipo(String id,String nombre, String escudo, String ciudad){
    this.id = id;
    this.nombre = nombre;
    this.escudo = escudo;
    this.ciudad = ciudad;
}


   public void setId(String id) {
       this.id = id;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   public void setEscudo(String escudo) {
       this.escudo = escudo;
   }

   public void setCiudad(String ciudad) {
       this.ciudad = ciudad;
   }

   public String getId() {
       return id;
   }
   public String getNombre() {
       return nombre;
   }

   public String getEscudo() {
       return escudo;
   }

   public String getCiudad() {
       return ciudad;
   }

}
