package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppCalificacionesLetra 
{

	public static void main(String[] args) 
	{
 
        char cLetra=' ';
        String cadena = "";
        Scanner entrada= new Scanner(System.in);
        char respuesta=' ';
        
        do
        {
	        System.out.println("Escribe la letra de tu calificacion");
	        cLetra=entrada.next().charAt(0);
	        //cadena=entrada.next();
	        //cLetra= cadena.charAt(0);
	        System.out.println(cLetra);
	      
	        switch(cLetra)
	        {
	             case 'a': System.out.println("10");
	             break;
	             case 'A': System.out.println("10");
	             break;
	             case 'b':                           //una manera de hacer and en case
	             case 'B': System.out.println("9");
	             break;
	             case 'c': System.out.println("8");
	             break;
	             case 'C': System.out.println("8");
	             break;
	             case 'd':                           //una manera de hacer and en case
	             case 'D': System.out.println("7");
	             break;
	             case 'e':                           //una manera de hacer and en case
	             case 'E': System.out.println("6");
	             break;
	             case 'f': 
	             case 'F': System.out.println("5");
	             break;
	             default: System.out.println("Calificacion no valida");
	             break;
	        }
	        System.out.println("Deseas otra calificacion? (s/n)");
	        cadena = entrada.next();
	        respuesta = cadena.charAt(0);
	      
        }while(respuesta=='s' || respuesta=='S');

	}

}
