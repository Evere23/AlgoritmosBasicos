package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppSuma2Numeros 
{
	
	public static void main(String[] args) 
	{
		int inum1=0;
		int inum2=0;
		int iResultado=0;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Escribe un numero");  //Mostrar 
		inum1 = entrada.nextInt();             //Esta es la manera de aceptar una entrada
		System.out.println("Escribe otro numero");  //Mostrar 
		inum2 = entrada.nextInt();             //Esta es la manera de aceptar una entrada
		
		iResultado=inum1 + inum2;
		System.out.println("La suma es "+ iResultado);  //Mostrar 
	}

}
