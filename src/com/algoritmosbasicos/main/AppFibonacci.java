package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppFibonacci 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int inum = 0;
		int x1 =0;
		int x2=0;
		int x = 1;
		int cont =0;
		char csalir= ' ';
		
		do
		{	
			System.out.println("Teclea el numero del elemento que quieres ver");
			inum = entrada.nextInt();
			
			System.out.println("Ciclo For");
			for(int cont2 = 1;cont2<=inum;cont2++)
			{
				System.out.print(x+" ");
				x2=x1;
				x1=x;
				x=x2+x1;
			}
			
			System.out.println("\nCiclo While");
			x1 =0;
			x2=0;
			x = 1;
			cont =1;
			while(cont<=inum)
			{
				System.out.print(x+" ");
				x2=x1;
				x1=x;
				x=x2+x1;
				cont++;
			}
			
			
			System.out.println("\nCiclo Do While");
			x1 =0;
			x2=0;
			x = 1;
			cont =1;
			do
			{
				System.out.print(x+" ");
				x2=x1;
				x1=x;
				x=x2+x1;
				cont++;
			}while(cont<=inum);
		System.out.println("\nQuieres introducir otro numero? s/n");
		
		csalir = entrada.next().charAt(0);
		}while(csalir == 's' || csalir == 'S');
	}

}
