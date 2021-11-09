package com.misiontic.partidosapi.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuarios")
public class Usuario {
    private String id;
    private String nombre;
    private String correo;
    private String username;
    private String password;
    private String rol;
    private String token;

    public Usuario(String id,String nombre,String correo,String password,String username){
        this.id=id;
        this.correo=correo;
        this.nombre=nombre;
        this.password=password;
        this.username=username;
    }

    public Usuario(){

    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
}
