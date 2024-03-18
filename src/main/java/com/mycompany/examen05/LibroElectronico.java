/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen05;


/**
 *
 * @author Ciro Galan Vertiz DAM117 
 */
//clase hija de Libro
public class LibroElectronico extends Libro {
    
    //Atributos adicionales
    private float tamanoMB;

    //Constructor por defecto
    public LibroElectronico() {
        super();
        System.out.println("Introduce el tamaño");
        this.tamanoMB =Teclado.nexFloat();
        System.out.println();
    }

    //Constructor por parametros
    public LibroElectronico(String autor, String titulo, float TamanoMB) {
        super(titulo, autor);
        this.tamanoMB = TamanoMB;
    }

    //Getters
    public float getTamanoMB() {
        return tamanoMB;
    }

    //Setters
    public void setTamanoMB(float TamanoMB) {
        this.tamanoMB = TamanoMB;
    }
    
    //toString
     @Override
    public String toString(){
        return super.toString()+"\nTamano: "+tamanoMB;
    }

    
}
