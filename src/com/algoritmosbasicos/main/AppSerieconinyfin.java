package com.algoritmosbasicos.main;
import java.util.Scanner;
public class AppSerieconinyfin 
{

	public static void main(String[] args) 
	{
		int ini = 0;
		int ifin = 0;
		int cont = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe numero de inicio");
		ini = entrada.nextInt();
		System.out.println("Escribe numero final");
		ifin = entrada.nextInt();
		
		System.out.println("\nCiclo For");
		System.out.println("Serie 1 en 1");
		for(int cont2 = ini;cont2 <= ifin;cont2++)
		{
			System.out.print(cont2 + " ");
		}
		for(int cont2 = ifin;cont2 >= ini;cont2--)
		{
			System.out.print(cont2 + " ");
		}
		//
		System.out.println("\nSerie 3 en 3");
		for(int cont2 = ini;cont2 <= ifin;cont2+=3)
		{
			System.out.print(cont2 + " ");
		}
		for(int cont2 = ifin;cont2 >= ini;cont2-=3)
		{
			System.out.print(cont2 + " ");
		}
		//
		System.out.println("\nSerie 5 en 5");
		for(int cont2 = ini;cont2 <= ifin;cont2+=5)
		{
			System.out.print(cont2 + " ");
		}
		for(int cont2 = ifin;cont2 >= ini;cont2-=5)
		{
			System.out.print(cont2 + " ");
		}
		
		
		
		//While
		System.out.println("\nSerie con While");
		System.out.println("Serie 1 en 1");
		cont = ini;
		while(cont<=ifin)
		{
			System.out.print(" " + cont);	
			cont++;
		}
		cont = ifin;
		while(cont>=ini)
		{
			System.out.print(" " + cont);
			cont--;
		}
		System.out.println("\nSerie 3 en 3");
		cont = ini;
		while(cont<=ifin)
		{
			System.out.print(" " + cont);	
			cont+=3;
		}
		cont = ifin;
		while(cont>=ini)
		{
			System.out.print(" " + cont);
			cont-=3;
		}
		System.out.println("\nSerie 5 en 5");
		cont = ini;
		while(cont<=ifin)
		{
			System.out.print(" " + cont);	
			cont+=5;
		}
		cont = ifin;
		while(cont>=ini)
		{
			System.out.print(" " + cont);
			cont-=5;
		}
		
		// Do While
		System.out.println("\nSerie con Do While");
		System.out.println("Serie 1 en 1");
		cont = ini;
		do
		{
			System.out.print(" " + cont);	
			cont++;
		}while(cont<=ifin);
		cont = ifin;
		do
		{
			System.out.print(" " + cont);
			cont--;
		}while(cont>=ini);
		System.out.println("\nSerie 3 en 3");
		cont = ini;
		do
		{
			System.out.print(" " + cont);	
			cont+=3;
		}while(cont<=ifin);
		cont = ifin;
		do
		{
			System.out.print(" " + cont);
			cont-=3;
		}while(cont>=ini);
		System.out.println("\nSerie 5 en 5");
		cont = ini;
		do
		{
			System.out.print(" " + cont);	
			cont+=5;
		}while(cont<=ifin);
		cont = ifin;
		do
		{
			System.out.print(" " + cont);
			cont-=5;
		}while(cont>=ini);
		
	}

}
