/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen05;

/**
 *
 * @author Ciro Galan Vertiz DAM117 
 */
public class Examen05 {

    public static void main(String[] args) {
        //creamos una bibblioteca
       Biblioteca b1= new Biblioteca("BibliotecaDAM117",5);
       
       //probamos los constructores por defecto
       LibroElectronico l1 = new LibroElectronico();
       Usuario u1 = new Usuario ();
       
       //probamos los constructores por parametros
       LibroElectronico l2 = new LibroElectronico("El dia de mañana","Ignacio Martinez",(float)0.5);
       LibroPapel l3 = new LibroPapel("El vagon de mujeres","Anita Nair",120);
       Usuario u2= new Usuario("Maria", "Gonzalez");
       Usuario u3 = new Usuario("Ignacio","Alavarez");
       b1.comprobarUsuario(u1);
    }
}
