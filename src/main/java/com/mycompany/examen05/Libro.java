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
//Clase padre
public abstract class Libro {
    
    //Atributos
    protected String titulo;
    protected String autor;
    
    //constructor por defecto
    public Libro(){
        System.out.print("Introduce el titulo: ");
        this.titulo=Teclado.nexLine();
        System.out.println();
        System.out.println("Introduce el autor: ");
        this.autor=Teclado.nexLine();
        System.out.println();
    }
    
    //Constructor por parametros
    public Libro (String titulo,String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    
    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    //toString
    @Override
    public String toString(){
        return "Titulo: "+this.titulo+"\nAutor: "+this.autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.titulo);
        hash = 53 * hash + Objects.hashCode(this.autor);
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    
}
