import java.util.*;

class Sorting
{
	public void InsertionSort(int Arr[])
	{
		int i=0,j=0,key=0,iCnt= 0;
          int size = Arr.length;

		for(i=1;i<size;i++)
		{
			key = Arr[i];
			for(j=(i-1);(j>=0)&&(Arr[j]>key);j--)
			{
			   Arr[j+1] = Arr[j];
			}
			Arr[j+1] = key;

			System.out.println("Data After pass"+ (i-1));

     		for( int k=0;k<Arr.length;k++)
     		{
     			System.out.print(Arr[k]+" ");
     		}
     		System.out.println();
     		iCnt++;
		}
		System.out.println(iCnt);
		}
}
class Program262
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
		obj.InsertionSort(Arr);

		System.out.println("Data after function call");
		for( i=0; i< Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}