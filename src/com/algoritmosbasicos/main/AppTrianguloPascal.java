package com.algoritmosbasicos.main;

import java.util.Scanner;


public class AppTrianguloPascal
{

	public static void main(String[] args) 
	{
		
		int pisos=  0;
		int n = 0 ;
		int m=0;
		int mn=0;
		int ires = 0 ;
		int factm = 1 ;
		int factn = 1 ;
		int factmn=1;
		int a=1;
		char cexit= ' ';
		
		Scanner entrada=new Scanner(System.in);
		
		do
		{

			System.out.println("Cuantos pisos quieres?");
			pisos= entrada.nextInt();
			

					for(n=0;n<pisos;n++)
						{
						a=1;
						
							for(m=0;m<=n;m++)
							{
								mn=0;
								factn = 1 ;
								factm = 1 ;
								factmn = 1 ;
								if(m == 0)
								{
								   ires=a;
								}
								else
									{
										if (m == n)
										{
											ires=a;
										}
										else
										{
											mn=n-m;
											
											if(mn != 0)
											{
												for(int cont = m;cont>0;cont--)
												{
													factm*=cont;
												}
												
												for(int cont = n;cont>0;cont--)
												{
													factn*=cont;
												}
												
												for(int cont = mn;cont>0;cont--)
												{
													
													factmn*=cont;
												}
												
												ires=factn/(factm*factmn);
			
											}
												
											
											
										
										}
								}
								System.out.print(ires+"\t");
					
							}
							
							System.out.print("\n");
							
						}
				System.out.println("\nQuieres introducir otro numero? s/n");
				cexit = entrada.next().charAt(0);
		}while(cexit == 's' || cexit == 'S');
	}

}
