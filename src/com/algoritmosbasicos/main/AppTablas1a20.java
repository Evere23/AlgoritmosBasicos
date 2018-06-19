package com.algoritmosbasicos.main;

public class AppTablas1a20 
{

	public static void main(String[] args) 
	{
		int iTabla=1;
		int cont = 1;
		int iRes =0;
		
		System.out.println("Tablas del 1 al 20 con For");
		for(cont=1;cont<=10;cont++)
		{
			for(iTabla=1;iTabla<=20;iTabla++)
			{
				iRes = iTabla * cont;
				System.out.print(iTabla+" x "+cont+" = "+iRes+" \t");
			}
			System.out.print(" \n");
		}
		
		
		System.out.println("Tablas del 1 al 20 con While");

		cont = 1;
		iRes =0;
		
		while(cont<=10)
		{
			iTabla=1;
			while(iTabla<=20)
			{
				iRes = iTabla * cont;
				System.out.print(iTabla+" x "+cont+" = "+iRes+" \t");
				iTabla++;
			}
			System.out.print(" \n");
			cont++;
		}
		
		
		System.out.println("Tablas del 1 al 20 con Do While");
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
			}while(iTabla<=20);
			System.out.print(" \n");
			cont++;
		}while(cont<=10);

	}

}
