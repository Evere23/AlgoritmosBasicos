package com.algoritmosbasicos.main;

import java.util.Scanner;
public class AppTablasConLimites 
{

	public static void main(String[] args)
	{
		int iTabla=0;
		int inum=0;
		int cont = 0;
		int iLimTabla=0;
		int iRes =0;
		Scanner entrada = new Scanner(System.in);
		char cexit= ' ';
		do
		{
				System.out.println("Hasta que numero de tabla quieres?");
				iLimTabla = entrada.nextInt();
				System.out.println("Hasta que numero quieres que se multiplique?");
				inum = entrada.nextInt();
				
				System.out.println("Tablas con limites con For");
				for(cont=1;cont<=inum;cont++)
				{
					for(iTabla=1;iTabla<=iLimTabla;iTabla++)
					{
						iRes = iTabla * cont;
						System.out.print(iTabla+" x "+cont+" = "+iRes+" \t");
					}
					System.out.print(" \n");
				}
				
				
				System.out.println("Tablas con limites con While");
		
				cont = 1;
				iRes =0;
				iTabla=0;
				
				while(cont<=inum)
				{
					iTabla=1;
					while(iTabla<=iLimTabla)
					{
						iRes = iTabla * cont;
						System.out.print(iTabla+" x "+cont+" = "+iRes+" \t");
						iTabla++;
					}
					System.out.print(" \n");
					cont++;
				}
				
				
				System.out.println("Tablas con limites con Do While");
				cont = 1;
				iRes =0;
				
				do
				{
					iTabla=1;
					do
					{
						iRes = iTabla * cont;
						System.out.print(iTabla+" x "+cont+" = "+iRes+" \t");
						iTabla++;
					}while(iTabla<=iLimTabla);
					System.out.print(" \n");
					cont++;
				}while(cont<=inum);
				
				
				System.out.println("\nQuieres introducir otro numero? s/n");
				cexit = entrada.next().charAt(0);
		}while(cexit == 's' || cexit == 'S');

	}

}
