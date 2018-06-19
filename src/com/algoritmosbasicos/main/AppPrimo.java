package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppPrimo 
{

	
	public static void main(String[] args) 
	{
	
		int inum=0;
		Scanner entrada = new Scanner(System.in);
		boolean isPrimo = true;
		
		System.out.println("Dame un numero");
		inum = entrada.nextInt();
		
		//Ciclo For
		System.out.println("Ciclo For");
		for (int cont2=2;cont2<inum; cont2++)
		{
			if(inum%cont2==0)
			{
				isPrimo = false;
			}
				
		}
		System.out.println("el numero es primo?  "+isPrimo);
		
		//Ciclo while
		System.out.println("Ciclo While");
		isPrimo = true;
		int cont=2;
		
		while(cont<inum)
		{
			if(inum%cont==0)
			{
				isPrimo = false;
			}
		cont++;	
		}
		System.out.println("el numero es primo?  "+isPrimo);
		
		//Ciclo Do while
		System.out.println("Ciclo Do While");
		isPrimo = true;
		cont=2;
		do
		{
			if(inum%cont==0)
			{
				isPrimo = false;
			}
		cont++;
		}while(cont<inum);
		System.out.println("el numero es primo?  "+isPrimo);
		
	}

}
