package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppPotencia
{

	public static void main(String[] args) 
	{
		
		int iNum = 0;
		int iPot =0;
		int iRes = 0;
		int cont = 1;
		char cexit =' ';
		Scanner entrada = new Scanner(System.in);
		
		do
		{
			System.out.println("escribe un numero");
			iNum = entrada.nextInt();
			System.out.println("escribe la potencia a la cual elevar el numero");
			iPot = entrada.nextInt();
			
			System.out.println("Ciclo For");
			iRes = iNum;
			System.out.print(iNum);
			for(int cont2 = 1;cont2 < iPot;cont2++)
			{
				iRes*=iNum;
				System.out.print(" x "+iNum);
			}
			System.out.println(" = "+iRes);
			
			System.out.println("Ciclo While");
			iRes = iNum;
			cont = 1;
			System.out.print(iNum);
			while(cont < iPot)
			{
				iRes*=iNum;
				System.out.print(" x "+iNum);
				cont++;
			}
			System.out.println(" = "+iRes);
			
			System.out.println("Ciclo While");
			iRes = iNum;
			cont = 1;
			System.out.print(iNum);
			do
			{
				iRes*=iNum;
				System.out.print(" x "+iNum);
				cont++;
			}while(cont < iPot);
			System.out.println(" = "+iRes);

			System.out.println("\nQuieres introducir otro numero? s/n");
			cexit = entrada.next().charAt(0);
		}while(cexit == 's' || cexit == 'S');
	}

}
