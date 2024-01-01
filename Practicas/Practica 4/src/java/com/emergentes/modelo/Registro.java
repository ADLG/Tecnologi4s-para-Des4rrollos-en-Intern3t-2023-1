
package com.emergentes.modelo;

/** @author ADLG*/
public class Registro
{
    private String nombre;
    private String fNac;
    private String telefono;
    
    public Registro(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getfNac() {
        return fNac;
    }

    public void setfNac(String fNac) {
        this.fNac = fNac;
    }

}
