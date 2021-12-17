// Important term is that our Array list should be 
// in ascending sorted format to use the concept 
// of BinarySearch. 

import java.util.*;

class Searching
{
     public boolean BinarySearch(int Arr[],int no)
     {
     	int start,end,mid;
     	start = 0;
     	end = Arr.length-1;
     	mid = (start + end) / 2;

     	while(start <= end)
     	{
     		if(Arr[mid] == no)
     		{
     			break;
     		}
     		else if(no>Arr[mid])
     		{
     			start = mid + 1;
     		}
     	     else if(no < Arr[mid])
     	     {
     	     	end = mid - 1;
     	     }

     	      mid = (start + end) / 2;
     	}
     	if(Arr[mid] == no)
     	{
     	    return true;
     	}
     	else
     	{
     	    return false;
     	}
     }
}

class Program255
{
	public static void main(String Arg[])
	{
		int i=0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the SIze of array");
		int size = sobj.nextInt();

		int Arr[] = new int[size];

		System.out.println("Enter the elements");
		
		for(i=0;i<Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}
         
         System.out.println("Enter the Element that we want to search");
         int iValue = sobj.nextInt();
		Searching obj = new Searching();

		boolean bRet = obj.BinarySearch(Arr,iValue);

		if(bRet == true)
		{
			System.out.println("Element is there");
		}
		else
		{
			System.out.println("Element  not present");
		}
	}
}