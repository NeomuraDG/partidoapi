package com.misiontic.partidosapi.models;

public class Partido {
private String id;
private String Usuario;
private Equipo local;
private Equipo visitante;
private String fecha;
private int goles_visitantes;
private int goles_local;

public Partido(){

}
public void setFecha(String fecha) {
    this.fecha = fecha;
}

public void setGoles_local(int goles_local) {
    this.goles_local = goles_local;
}

public void setGoles_visitantes(int goles_visitantes) {
    this.goles_visitantes = goles_visitantes;
}
public void setLocal(Equipo local) {
    this.local = local;
}

public void setId(String id) {
    this.id = id;
}

public void setUsuario(String usuario) {
    Usuario = usuario;
}
public void setVisitante(Equipo visitante) {
    this.visitante = visitante;
}
public String getFecha() {
    return fecha;
}
public int getGoles_local() {
    return goles_local;
}
public int getGoles_visitantes() {
    return goles_visitantes;
}
public String getId() {
    return id;
}
public Equipo getLocal() {
    return local;
}

public String getUsuario() {
    return Usuario;
}
public Equipo getVisitante() {
    return visitante;
}

}
