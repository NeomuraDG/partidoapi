package com.misiontic.partidosapi.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Equipos")
public class Equipo {

   @Id
   private String id;
   private String nombre;
   private String escudo;
   private String ciudad;


   public Equipo(){

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
