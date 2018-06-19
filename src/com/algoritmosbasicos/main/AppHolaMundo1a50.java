package com.algoritmosbasicos.main;

public class AppHolaMundo1a50
{

	public static void main(String[] args) 
	{
		int cont = 1;
		
		System.out.println("Hola Mundo con For");
		for(int cont2= 1; cont2<=50;cont2++)
		{
			System.out.print(" Hola Mundo "+cont2);
		}
		
		System.out.println("\nHola Mundo con While");
		cont= 1;
		while(cont<=50)
		{
			System.out.print(" Hola Mundo "+cont);
			cont++;
		}
		
		System.out.println("\nHola Mundo con Do While");
		cont= 1;
		do
		{
			System.out.print(" Hola Mundo "+cont);
			cont++;
		}while(cont<=50);

	}

}
