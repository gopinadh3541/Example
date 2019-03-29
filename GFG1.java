package com.capgemini.practice;

import java.io.*;

public class GFG1 {
	static int b[]=new int[8];
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter the Size of Array:");
		int n=Integer.parseInt(br.readLine());
		for(int z=0;z<n;z++)
		{
		int a1[]= {};
		System.out.println("Enter the Number");
		int number=Integer.parseInt(br.readLine());
		if(number==1)
		{
			System.out.println("0");
		}
		else if(number==0 || number==2)
		{
			System.out.println("1");
		}
		else
		{
		
		int a=convertToBinary(number);
		int temp[]=new int[a];
		for(int j=a-1,k=0;j>=0;j--,k++)
		{
			temp[k]=b[j];
		}
	int b1[]=	changeMiddle(temp);
		
		convertToDecimal(b1);
		}
		}
	}

	private static void convertToDecimal(int[] temp) {
		int sum=0;
		for(int i=0;i<temp.length;i++)
		{
			
			sum=sum+((int)Math.pow(2, temp.length-1-i))*temp[i];
		}
		System.out.println(sum);
		
	}

	private static int[] changeMiddle(int[] temp) {
		int a=temp.length;
		
		int n=a/2;
		
		if(a%2==0)
		{
			if(temp[n]==0&&temp[n-1]==0)
			{
				temp[n]=1;
				temp[n-1]=1;
			}
			else if(temp[n]==1&&temp[n-1]==1)
			{
				temp[n]=0;
				temp[n-1]=0;
			}
			else if(temp[n]==0&&temp[n-1]==1)
			{
				temp[n]=1;
				temp[n-1]=0;
			}
			else if(temp[n]==1&&temp[n-1]==0)
			{
				temp[n]=0;
				temp[n-1]=1;
			}
		}
		else
		{
			if(temp[n]==0)
				temp[n]=1;
			else
				temp[n]=0;
		}
		
		return temp;
		
	}

	private static int convertToBinary(int n) {
		
		int i=0;
		while(n>0)
		{
			b[i]=n%2;
			//System.out.print(b[i]);
			n=n/2;
			i++;
		}
		return i;
	}

}
