/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen05;

import java.util.Objects;

/**
 *
 * @author Ciro Galan Vertiz DAM117 
 */

//Clase para registrar usuarios
public class Usuario {
    
    //Atributos
    private String nombre;
    private String apellidos;
    
    //Constructor por defecto
    public Usuario() {
        System.out.println("Nombre: ");
        this.nombre=Teclado.nexLine();
        System.out.println("Apellidos: ");
        this.apellidos=Teclado.nexLine();
    }

    //Constructor por parametros
    public Usuario(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellidos) {
        this.apellidos = apellidos;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellidos;
    }
    //toString
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nApellidos: "+apellidos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellidos, other.apellidos);
    }

    
    
    
}
