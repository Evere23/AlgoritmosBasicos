package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppNumPrimoPar 
{

	public static void main(String[] args)
	{
		int inum = 0;
		int cont = 0;
		String sPrimo = " es Primo ";
		String sPar = " es Par ";
		char cexit = ' ';
		Scanner entrada = new Scanner(System.in);
		
		do
		{
			
			
			
			System.out.println("introduce un numero");
			inum = entrada.nextInt();
			sPrimo = " es Primo ";
			sPar = " no es Par ";
			
			System.out.println("Ciclo For");
			for(int cont2 = 2;cont2<inum;cont2++)
			{
				if(inum%cont2==0)
				{
					sPrimo = " no es Primo ";
				}
			}
			if((inum%2) == 0) 
			{
				sPar = " es Par ";
			}
			System.out.println("El numero "+inum+sPrimo+" y "+sPar);
			
			System.out.println("Ciclo while");
			cont = 2;
			sPrimo = " es Primo ";
			sPar = " no es Par ";
			while(cont<inum)
			{
				if(inum%cont==0)
				{
					sPrimo = " no es Primo ";
				}
				cont++;
			}
			if((inum%2) == 0) 
			{
				sPar = " es Par ";
			}
			System.out.println("El numero "+inum+sPrimo+" y "+sPar);
			
			System.out.println("Ciclo do while");
			cont = 2;
			sPrimo = " es Primo ";
			sPar = " no es Par ";
			do
			{
				if(inum%cont==0)
				{
					sPrimo = " no es Primo ";
				}
				cont++;
			}while(cont<inum);
			if((inum%2) == 0) 
			{
				sPar = " es Par ";
			}
			System.out.println("El numero "+inum+sPrimo+" y "+sPar);
			
			
			System.out.println("\nQuieres introducir otro numero? s/n");
			cexit = entrada.next().charAt(0);
			}while(cexit == 's' || cexit == 'S');
	}

}
