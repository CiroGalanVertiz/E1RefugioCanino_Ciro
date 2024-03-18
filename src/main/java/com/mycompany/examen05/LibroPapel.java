/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen05;



/**
 *
 * @author Ciro Galan Vertiz DAM117 
 */
//Clase hija de Libro
public class LibroPapel extends Libro {
    
    //Atributos adicionales
    private int numPag;
    
    //Constructor por defecto
    public LibroPapel(){
        super();
        System.out.println("Introduce el numero de paginas: ");
        this.numPag=Teclado.nextInt();
        System.out.println();
    }
    
    //Constructor por parametros
    public LibroPapel(String titulo,String autor,int numPag){
        super(titulo,autor);
        this.numPag= numPag;
    }

    //Getter
    public int getNumPag() {
        return numPag;
    }

    //Setter
    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    //toString
    @Override
    public String toString(){
        return super.toString()+"\nNumero de paginas: "+numPag;
    }
    
}
