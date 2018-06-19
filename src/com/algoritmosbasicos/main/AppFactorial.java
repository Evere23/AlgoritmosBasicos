package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppFactorial
{

	public static void main(String[] args) 
	{
		char cexit = ' ';
		Scanner entrada=new Scanner(System.in);
		int inum =0;
		int cont =0;
		int fact=0;
		
		
		do 
		{
			
			System.out.println("Escribe un numero");
			inum = entrada.nextInt();
			
			System.out.println("Factorial con For");
			fact=inum;
			System.out.print("El factorial de "+inum+" es: "+inum);
			for(cont=inum-1;cont>0;cont--)
			{
				fact*=cont;
				System.out.print(" x "+cont);
			}
			System.out.println(" = "+fact);
			
			
			System.out.println("Factorial con While");
			fact=inum;
			cont=inum-1;
			System.out.print("El factorial de "+inum+" es: "+inum);
			while(cont>0)
			{
				fact*=cont;
				System.out.print(" x "+cont);
				cont--;
			}
			System.out.println(" = "+fact);
			
			
			System.out.println("Factorial con Do While");
			fact=inum;
			cont=inum-1;
			System.out.print("El factorial de "+inum+" es: "+inum);
			do
			{
				fact*=cont;
				System.out.print(" x "+cont);
				cont--;
			}while(cont>0);
			System.out.println(" = "+fact);
			
			
			System.out.println("\nQuieres introducir otro numero? s/n");
			cexit = entrada.next().charAt(0);
		}while(cexit == 's' || cexit == 'S');

	}

}
