package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppEdad 
{

	public static void main(String[] args) 
	{
		
		int iEdad=0;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Dame tu edad");
		iEdad = entrada.nextInt();
		
		if(iEdad<5)
		{
			System.out.println("nino");
		}
		else if (iEdad>=5 && iEdad<19)
		{
			System.out.println("Adolecente");
		}
		else if (iEdad>=19 && iEdad<36)
		{
			System.out.println("Chavorruco");
		}
		else if (iEdad == 36)
		{
			System.out.println("Inmortal");
		}
		else if (iEdad>36)
		{
			System.out.println("Viejito");
		}
		
	}

}
