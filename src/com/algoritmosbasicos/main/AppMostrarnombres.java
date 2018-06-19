package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppMostrarnombres 
{

	public static void main(String[] args) 
	{
		int cont2=0;
		String sNombre="";  // variable donde guardare el nombre
		Scanner entrada = new Scanner(System.in); //Se necesita para que pueda escribir con el teclado en mi programa
		///*    Ciclo For
		System.out.println("Escribe tu nombre");  //Mostrar "Escribe tu nombre"
		sNombre = entrada.nextLine();             //Esta es la manera de aceptar una entrada
		                                          //Con nextline acepta una cadena con todo y espacios y next solo hasta el primer espacio
		
		for(int cont=0;cont<100;cont++)
		{
			System.out.println("Hola "+ sNombre);//Mostrar el nombre 
		}	
		//*/
		
		
		///*   Ciclo while
		System.out.println("Escribe tu nombre");  //Mostrar "Escribe tu nombre"
		sNombre = entrada.nextLine();             //Esta es la manera de aceptar una entrada
		while (cont2<100)
		{
			System.out.println("Hola "+ sNombre);//Mostrar el nombre
			cont2++;
		}	
		//*/	
		
		
		///*    Ciclo Do While
		System.out.println("Escribe tu nombre");  //Mostrar "Escribe tu nombre"
		sNombre = entrada.nextLine(); //Esta es la manera de aceptar una entrada
		cont2=0;
		do
		{	
			System.out.println("Hola "+ sNombre);//Mostrar el nombre
			cont2++;
		}while(cont2<100);
		//*/
	}

}
