package Squre;

import java.util.Iterator;

public class Study {
	public static void main(String[] args) {
		
		System.out.println("===========직사각형=============");

		for(int i =0; i<5; i++) {
			for(int j =0; j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===========직사각형=============");
		
		
		System.out.println("============직각삼각형============");
		for(int i=1; i<6; i++) {
			for(int j =0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============직각삼각형============");
		
		
		
		System.out.println("============직각삼각형 역으로============");
		for(int i=0; i<5; i++) {
			for(int j =0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("============직각삼각형 역으로============");
		
		System.out.println("============마름모============");
		  int num = 3;
		  for(int i =0;i <5; i++) 
		  {
			  for(int j =i; j<4; j++) 
			  {
			  System.out.print(" ");
			  }
			  for(int a =0;a< i*2+1;a++) 
			  {
				  System.out.print("*");
			  }
			  System.out.println("");
		  }
		  for(int q =0; q<5;q++) 
		  {
			  for(int w=0;w<= q;w++)
			  {
				  System.out.print(" ");
			  }
			  for(int e = num*2+1; e>0;e--)
			  {
				  System.out.print("*");
			  }
			  System.out.println();
			  num --;
		  }
			System.out.println("============마름모============");
			
			System.out.println("============피라미드============");
			for(int i=0; i< 6;i++) {
				for(int a =i; a<5;a++) {
					System.out.print(" ");
				}
				for(int j=0;j<i*2+1;j++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("============피라미드============");
	}
}
