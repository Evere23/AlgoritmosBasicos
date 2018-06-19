package com.algoritmosbasicos.main;

public class AppSumaParesyPrimos
{

	public static void main(String[] args) 
	{
		int iSum=0;
		int iRes=0;
		int cont=0;
		int cont4=0;
		boolean isPrimo = true;
		int ver = 0;
		
		System.out.println("Sumar pares y primos del 100 al 200 con For");
		for(int cont2=101;cont2<=200;cont2++)
		{
			isPrimo = true;
			if (cont2-1 == 100)
			{	
				iSum=100;
				iRes=iSum;
				System.out.print(iSum);
			}
			for(int cont3 =2;cont3<cont2;cont3++)
			{
				if(cont2%cont3 == 0)
					isPrimo= false;
			}
			if(isPrimo == true)
			{
				iSum=cont2;
				iRes+=iSum;			
				System.out.print(" + "+iSum);
			}
			
			if(cont2%2 == 0)
			{
				iSum=cont2;
				iRes+=iSum;
				System.out.print(" + "+iSum);
				
			}
			
		}
		System.out.print(" = "+iRes);
		
		
		System.out.println("\nSumar pares y primos del 100 al 200 con While");
		cont=101;
		isPrimo = true;
		while(cont<=200)
		{
			isPrimo = true;
			if (cont-1 == 100)
			{	
				iSum=100;
				iRes=iSum;
				System.out.print(iSum);
			}
			cont4 =2;
			while(cont4<cont)
			{
				if(cont%cont4 == 0)
				{
					isPrimo= false;
				}
				cont4++;
			}
			if(isPrimo == true)
			{
				iSum=cont;
				iRes+=iSum;			
				System.out.print(" + "+iSum);
			}
			
			if(cont%2 == 0)
			{
				iSum=cont;
				iRes+=iSum;
				System.out.print(" + "+iSum);
				
			}
		cont++;	
		isPrimo = true;
		}
		System.out.print(" = "+iRes);
		
		
		System.out.println("\nSumar pares y primos del 100 al 200 con Do While");
		cont=101;
		isPrimo = true;
		do
		{
			isPrimo = true;
			if (cont-1 == 100)
			{	
				iSum=100;
				iRes=iSum;
				System.out.print(iSum);
			}
			cont4 =2;
			do
			{
				if(cont%cont4 == 0)
				{
					isPrimo= false;
				}
				cont4++;
			}while(cont4<cont);
			if(isPrimo == true)
			{
				iSum=cont;
				iRes+=iSum;			
				System.out.print(" + "+iSum);
			}
			
			if(cont%2 == 0)
			{
				iSum=cont;
				iRes+=iSum;
				System.out.print(" + "+iSum);
				
			}
		cont++;	
		isPrimo = true;
		}while(cont<=200);
		System.out.print(" = "+iRes);
	}

}
