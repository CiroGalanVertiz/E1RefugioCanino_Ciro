/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen05;

import java.time.LocalDate;

/**
 *
 * @author Ciro Galan Vertiz DAM117
 */

//Clase para hacer prestamos
public class Prestamo {
    
    //Atributos
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechalimite;
    private LocalDate fechaDevolucion;

    //Constructor por parametros
    public Prestamo(Libro libro, Usuario usuario, LocalDate fechalimite) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechalimite = fechalimite;
    }

    //Getters
    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getFechalimite() {
        return fechalimite;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    //Setters
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFechalimite(LocalDate fechalimite) {
        this.fechalimite = fechalimite;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
    
}
