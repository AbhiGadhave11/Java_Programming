import java.util.*;

class Sorting
{
     public void SelectionSort(int Arr[])
     {
     	int i=0,j=0,minindex=0,temp = 0;
     	int size = Arr.length;

     	for(i=0;i<size;i++)
     	{
     		minindex = i;
     		for(j=i;j<size;j++)
     		{
     			if(Arr[minindex] > Arr[j])
     			{
     				minindex = j;
     			}
     		}
     		temp = Arr[i];
     		Arr[i] = Arr[minindex];
     		Arr[minindex] = temp;
     		
     	    System.out.println("Data After pass"+ i+1);

     		for(int k=0;k<Arr.length;k++)
     		{
     			System.out.print(Arr[k]+" ");
     		}
     		System.out.println();
     	}
     }
}
class Program261
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
         
      
          Sorting obj = new Sorting(); 
		obj.SelectionSort(Arr);

		System.out.println("Data after function call");
		for( i=0; i< Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}