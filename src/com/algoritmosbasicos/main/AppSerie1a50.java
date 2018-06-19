package com.algoritmosbasicos.main;

public class AppSerie1a50 
{

	public static void main(String[] args) 
	{
		int cont2=0;
		
		System.out.println("Serie con For");
		System.out.println("Acendente");
		for(int cont=1;cont<51;cont++)
		{
			System.out.print(" " + cont);
		}
		System.out.println("\n Decendente");
		for(int cont=50;cont>0;cont--)
		{
			System.out.print(" " + cont);
		}
		
		System.out.println("\n Serie con While");
		System.out.println("Acendente");
		while(cont2<=49)
		{
			cont2++;
			System.out.print(" " + cont2);
			
		}
		System.out.println("\n Decendente");
		while(cont2>0)
		{
			System.out.print(" " + cont2);
			cont2--;
		}
		
		System.out.println("\n Serie con Do While");
		System.out.println("Acendente");
		do
		{
			cont2++;
			System.out.print(" " + cont2);
			
		}while(cont2<=49);
		System.out.println("\n Decendente");
		do
		{
			System.out.print(" " + cont2);
			cont2--;
		}while(cont2>0);
		
		
	}

}
