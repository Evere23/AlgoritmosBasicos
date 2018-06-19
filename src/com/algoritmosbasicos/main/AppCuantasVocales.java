package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppCuantasVocales
{

	public static void main(String[] args)
	{
		String sNombre="";
		char car =' ';
		char csalir=' ';
		int l=0;
		int x = 0;
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		Scanner entrada = new Scanner(System.in);
		do 
		{
			System.out.println("Escribe tu nombre:");
			sNombre = entrada.nextLine();
			
			l=sNombre.length();
			System.out.println(l);
			
			char cadena_caracteres [] = new char[sNombre.length()];
			cadena_caracteres = sNombre.toCharArray();
			
			System.out.println("Cuenta las vocales con For");
			for(x=0;x<l;x++)
			{	
				switch(cadena_caracteres[x])
				{
					case 'a':a++;
					break;
					case 'A':a++;
					break;
					case 'e':e++;
					break;
					case 'E':e++;
					break;
					case 'i':i++;
					break;
					case 'I':i++;
					break;
					case 'o':o++;
					break;
					case 'O':o++;
					break;
					case 'u':u++;
					break;
					case 'U':u++;
					break;
				}
				
			}
			System.out.println("Tu nombre tiene las siguientes vocales\nA = "+a+" E = "+e+" I = "+i+" O = "+o+" U = "+u);
			
			
			System.out.println("Cuenta las vocales con While");
			 x=0;
			 a=0;
			 e=0;
			 i=0;
			 o=0;
			 u=0;
			while(x<l)
			{	
				switch(cadena_caracteres[x])
				{
					case 'a':a++;
					break;
					case 'A':a++;
					break;
					case 'e':e++;
					break;
					case 'E':e++;
					break;
					case 'i':i++;
					break;
					case 'I':i++;
					break;
					case 'o':o++;
					break;
					case 'O':o++;
					break;
					case 'u':u++;
					break;
					case 'U':u++;
					break;
				}
				x++;
			}
			System.out.println("Tu nombre tiene las siguientes vocales\nA = "+a+" E = "+e+" I = "+i+" O = "+o+" U = "+u);
			
			
			System.out.println("Cuenta las vocales con Do While");
			 x=0;
			 a=0;
			 e=0;
			 i=0;
			 o=0;
			 u=0;
			do
			{	
				switch(cadena_caracteres[x])
				{
					case 'a':a++;
					break;
					case 'A':a++;
					break;
					case 'e':e++;
					break;
					case 'E':e++;
					break;
					case 'i':i++;
					break;
					case 'I':i++;
					break;
					case 'o':o++;
					break;
					case 'O':o++;
					break;
					case 'u':u++;
					break;
					case 'U':u++;
					break;
				}
				x++;
			}while(x<l);
			System.out.println("Tu nombre tiene las siguientes vocales\nA = "+a+" E = "+e+" I = "+i+" O = "+o+" U = "+u);
			
			
			csalir = entrada.next().charAt(0);
		}while(csalir == 's' || csalir == 'S');
	}

}
