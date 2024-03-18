/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen05;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ciro Galan Vertiz DAM117
 */

//Clase para controlar lo que se mete en los Scanners
public class Teclado {
    
    //Metodo para los datos de tipo int
    public static int nextInt(){
        int a=0;
        
        //Excepcion: mete una letra
        try{
            a=new Scanner(System.in).nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Introduce un numero");
            Teclado.nextInt();
        }
        return a;
    }
    
    //Metodo para los datos de tipo String
    public static String nexLine(){
        return new Scanner(System.in).nextLine();
    }
    
    //Metodo para los datos de tipo Float
    public static float nexFloat(){
        return new Scanner(System.in).nextFloat();
    }
    
}
