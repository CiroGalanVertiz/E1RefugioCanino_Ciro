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
public class Biblioteca implements Identificable{
    private String nombre;
    private Libro[] libros;
    private int numLibros;
    private Usuario[] usuarios;
    private Prestamo[] prestamos;
    private int contadorLibros;

    public Biblioteca(String nombre,int maximo) {
        this.nombre = nombre;
        this.libros= new Libro[maximo];
        this.prestamos=new Prestamo[maximo];
        this.usuarios=new Usuario[maximo];
    }
    public boolean aggregarLibro(Libro libro){
        boolean aux=false;
        
            if(contadorLibros<libros.length){
                libros[contadorLibros]=libro;
                aux=true;
                contadorLibros++;
            }
            return aux;
        }

    
        



    public void insertarUsuario(Usuario usuario){
        int i=0;
        boolean salir=false;
        while (i<usuarios.length && salir == false){
            if(usuarios[i]==null){
                usuarios[i]=usuario;
                salir=true;
            }
            i++;
        }
        if(!salir){
            System.out.println("No se ha podido insertar un usuario");
    }
    }
    
     public void insertarPrestamo(Prestamo prestamo){
        int i=0;
        boolean salir=false;
        while (i<prestamos.length && salir == false){
            if(prestamos[i]==null){
                prestamos[i]=prestamo;
                salir=true;
            }
            i++;
        }
        if(!salir){
            System.out.println("No se ha podido insertar un usuario");
    }
        
    }
    
    public boolean comprobarUsuario(Usuario usuario){
        
        int i=0;
        boolean encontrado=false;
        while (i<usuarios.length && encontrado == false){
            if(usuarios[i].equals(usuario)){          
                encontrado=true;
            }
            i++;
        }
        
       return encontrado; 
    }
    public boolean comprobarLibro(Libro libro){
        
        
        int i=0;
        boolean encontrado=false;
        while (i<libros.length && encontrado == false){
            if(libros[i].equals(libro)){                
                encontrado=true;
            }
            i++;
        }
        
       return encontrado; 
        
    }
    public void prestar(Libro libro,Usuario usuario){
        boolean encontrado=false;
        if(this.comprobarLibro(libro)){
            if(this.comprobarUsuario(usuario)){
                for (int i = 0; i <prestamos.length&&!encontrado; i++) {
                    if(prestamos[i]!=null&&prestamos[i].getLibro().equals(libro)){
                        if(prestamos[i].getFechaDevolucion()!=null){
                        Prestamo p1 = new Prestamo(libro,usuario,LocalDate.now());
                        this.insertarPrestamo(p1);
                        }
                        else{
                            System.out.println("No se ha devuelto");
                        }
                    }
                    else{
                        Prestamo p1 = new Prestamo(libro,usuario,LocalDate.now());
                        this.insertarPrestamo(p1);
                   }
                    
                }
            
        }
        }
        else{
            
        }
        
    }
    public void devolver(){
        
    }
    public void eliminar(){
        
    }
    public void ordenar(){
        
    }
    public void listar(){
        
    }
    


    

    @Override
    public String imprime() {
        
        return null;
        
    }
    
}
