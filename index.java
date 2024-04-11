import java.util.*;
import java.lang.*;
import java.io.*;

class boxgame
{
	public static void main(String args[])throws IOException
	{
		int a[][]=new int[3][3];
		a[0][0]=0;
		a[0][1]=0;
		a[0][2]=1;
		a[1][0]=0;
		a[1][1]=1;
		a[1][2]=0;
		a[2][0]=1;
		a[2][1]=0;
		a[2][2]=0;
		int i,j;
		DataInputStream in = new DataInputStream(System.in);
		System.out.println("  \n");
		System.out.println("*****************************************************************************************");
		System.out.println("*****************        WELCOME THE BOXING GAME     ************************************");
		System.out.println("*****************************************************************************************");
		System.out.println("                ");
		System.out.println("	---Hi gays, welcome my game *Row or column is same* your win---");
		System.out.println("	some example:");
		System.out.println("					"+a[0][0]+"	"+ a[0][1]+"	"+ a[0][2]);
		System.out.println("					"+a[1][0]+"	"+ a[1][1]+"	"+ a[1][2]);
		System.out.println("					"+a[2][0]+"	"+ a[2][1]+"	"+ a[2][2]);
		int v;
		do
		{
		int b[][]=new int[3][3];		
		try
		{
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{	
					b[i][j]=0;		
					//System.out.println(" "+ a[i][j]);
				}
				//System.out.println(" ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error");
		}
		System.out.println("	");
		System.out.println("	---Starting is all elements or zero...");
		System.out.println("					"+b[0][0]+"	"+ b[0][1]+"	"+ b[0][2]);
		System.out.println("					"+b[1][0]+"	"+ b[1][1]+"	"+ b[1][2]);
		System.out.println("					"+b[2][0]+"	"+ b[2][1]+"	"+ b[2][2]);
		System.out.println("-->First  operand use (*1*) and Text operand use(*2*).  This simple using only play the game<-- ");
		int c[][]=new int[3][3];
		c[0][0]=1;
		c[0][1]=2;
		c[0][2]=3;
		c[1][0]=4;
		c[1][1]=5;
		c[1][2]=6;
		c[2][0]=7;
		c[2][1]=8;
		c[2][2]=9;
		System.out.println("We are given slate for located in number to save so you must mention slate");
		System.out.println("		"+c[0][0]+"	"+ c[0][1]+"	"+ c[0][2]);
		System.out.println("		"+c[1][0]+"	"+ c[1][1]+"	"+ c[1][2]);
		System.out.println("		"+c[2][0]+"	"+ c[2][1]+"	"+ c[2][2]);
		int k,q,x,m,n,ch,u;
			System.out.println("		\n");
			System.out.println("**We are Read for game  yes is=1 (or) no is=2**");
			ch=Integer.parseInt(in.readLine());
			switch(ch)
			{
				case 1:
					u=0;
					for(k=1;k<=9;k++)
					{
						if(u!=7)
						{
							System.out.println("	");
							System.out.println("Once more the Slate*****");
							System.out.println("	"+c[0][0]+"	"+ c[0][1]+"	"+ c[0][2]);
							System.out.println("	"+c[1][0]+"	"+ c[1][1]+"	"+ c[1][2]);
							System.out.println("	"+c[2][0]+"	"+ c[2][1]+"	"+ c[2][2]);
							System.out.println("!!!Enter the your slate:");
							q=Integer.parseInt(in.readLine());
							System.out.println("!!!!Enter your number:");
							x=Integer.parseInt(in.readLine());	
							if(x==1 || x==2)
							{
								if(((k==1)&&(x==1)) || ((k==2)&&(x==2)) || ((k==3)&&(x==1)) || ((k==4)&&(x==2)) || ((k==5)&&(x==1)) || ((k==6)&&(x==2)) || ((k==7)&&(x==1)) || ((k==8)&&(x==2)) || ((k==9)&&(x==1)))
								{
									try
									{
										for(n=0;n<3;n++)
										{
											for(m=0;m<3;m++)
											{	
												if(c[n][m]==q)
												{	
													b[n][m]=x;
													System.out.println("		");
													System.out.println("		");
													System.out.println("					"+b[0][0]+"	"+ b[0][1]+"	"+ b[0][2]);
													System.out.println("					"+b[1][0]+"	"+ b[1][1]+"	"+ b[1][2]);
													System.out.println("					"+b[2][0]+"	"+ b[2][1]+"	"+ b[2][2]);	
													if(((b[0][0]==1)&&(b[0][1]==1)&&(b[0][2]==1)) || ((b[0][0]==2)&&(b[0][1]==2)&&(b[0][2]==2)))
													{
														
														System.out.println("\n					**********win the match***********");
														u=7;
														break;
													}else if(((b[0][0]==1)&&(b[1][0]==1)&&(b[2][0]==1)) || ((b[0][0]==2)&&(b[1][0]==2)&&(b[2][0]==2)))
													{
														System.out.println("\n					**********win the match**********");
														u=7;
														break;
													}else if(((b[0][1]==1)&&(b[1][1]==1)&&(b[2][1]==1)) || ((b[0][1]==2)&&(b[1][1]==2)&&(b[2][1]==2)))
													{
														System.out.println("\n					**********win the match**********");
														u=7;
														break;
													}else if(((b[0][2]==1)&&(b[1][2]==1)&&(b[2][2]==1)) || ((b[0][2]==2)&&(b[1][2]==2)&&(b[2][2]==2)))
													{														
														System.out.println("\n					***********win the match*********");
														u=7;
														break;
													}else if(((b[0][0]==1)&&(b[1][1]==1)&&(b[2][2]==1)) || ((b[0][0]==2)&&(b[1][1]==2)&&(b[2][2]==2)))
													{
														System.out.println("\n					**********win the match**********");
														u=7;
														break;
													}else if(((b[2][0]==1)&&(b[1][1]==1)&&(b[0][2]==1)) || ((b[2][0]==2)&&(b[1][1]==2)&&(b[0][2]==2)))
													{
														System.out.println("\n					*********win the match**********");
														u=7;
														break;
													}else if(((b[2][0]==1)&&(b[2][1]==1)&&(b[2][2]==1)) || ((b[2][0]==2)&&(b[2][1]==2)&&(b[2][2]==2)))
													{
														System.out.println("\n					*********win the match**********");
														u=7;
														break;
													}else if(((b[1][0]==1)&&(b[1][1]==1)&&(b[1][2]==1)) || ((b[1][0]==2)&&(b[1][1]==2)&&(b[1][2]==2)))
													{
														System.out.println("\n					**********win the match**********");
														u=7;
														break;
													}else
													{
														System.out.println("-->continue");	
													}			
												}
											}
										}
									}
									catch(ArrayIndexOutOfBoundsException e)
									{
										System.out.println("error");
									}
								}else	
								{
									System.out.println(" "+ k+" Time Your playing so,"+ x+" no. player is  play. Please correctly enter the number");
									k=k-1;
								}		
							}else
							{
						
								System.out.println("!!!Default number given, your given 1 or 2!!!");
								k=k-1;
							}
						}
					}
					break;
				case 2:
					System.out.println("			Okay exit from game		");
					break;
				default:
					System.out.println("			Default value is given		");
					break;
			}
			System.out.println("		\n\n\n");
			System.out.println("*****We are play oncemore press the button 1 is yes , 0 is no:");
			v=Integer.parseInt(in.readLine());
		}while(v!=0);
		
	}

}
