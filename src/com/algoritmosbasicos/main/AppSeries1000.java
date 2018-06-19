package com.algoritmosbasicos.main;

public class AppSeries1000 
{

	public static void main(String[] args) 
	{
		int cont = 0;
		
		System.out.println("Ciclo For");
		System.out.println("Serie 2 en 2");
		for(int cont2=0;cont2<=1000;cont2+=2)
		{
			System.out.print(cont2 + ", ");
		}
		System.out.println("\nSerie 3 en 3");
		for(int cont2=0;cont2<=1000;cont2+=3)
		{
			System.out.print(cont2 + ", ");
		}
		System.out.println("\nSerie 5 en 5");
		for(int cont2=0;cont2<=1000;cont2+=5)
		{
			System.out.print(cont2 + ", ");
		}
		
		System.out.println("\nCiclo While");
		System.out.println("Serie 2 en 2");
		while(cont<=1000)
		{
			System.out.print(cont + ", ");
			cont += 2;
		}
		System.out.println("\nSerie 3 en 3");
		cont=0;
		while(cont<=1000)
		{
			System.out.print(cont + ", ");
			cont += 3;
		}
		System.out.println("\nSerie 5 en 5");
		cont=0;
		while(cont<=1000)
		{
			System.out.print(cont + ", ");
			cont += 5;
		}
		
		System.out.println("\nCiclo Do While");
		System.out.println("Serie 2 en 2");
		cont=0;
		do
		{
			System.out.print(cont + ", ");
			cont += 2;
		}while(cont<=1000);
		System.out.println("\nSerie 3 en 3");
		cont=0;
		do
		{
			System.out.print(cont + ", ");
			cont += 3;
		}while(cont<=1000);
		System.out.println("\nSerie 5 en 5");
		cont=0;
		do
		{
			System.out.print(cont + ", ");
			cont += 5;
		}while(cont<=1000);
		
	}

}
