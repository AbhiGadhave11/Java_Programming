import java.util.*;

class Sorting
{
     public void BubbleSort(int Arr[])
     {
     	int pass=0,j=0,temp=0;
     	int size = Arr.length;
     	boolean flag = false;
     	
     	for(pass=0,flag=true ;(pass<size)&&();pass++)
     	{
     		flag = false;
     		for(j=0;j<size-pass-1;j++)
     		{
                   if(Arr[j] > Arr[j+1])
                   {
                   	flag = true;
                   	 temp = Arr[j];
                   	 Arr[j] = Arr[j+1];
                   	 Arr[j+1] = temp;
                   }
     		}
     		if(flag == false)
     		{
     			break;
     		}
     		System.out.println("Data After pass"+ pass+1);
     		for(int i=0;i<Arr.length;i++)
     		{
     			System.out.print(Arr[i]+" ");
     		}
     		System.out.println();
     	}
     }
}
class Program260
{
	public static void main(String Arg[])
	{
		int i=0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size = sobj.nextInt();

		int Arr[] = new int[size];

		System.out.println("Enter the elements");
		for(i=0;i<Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}
         
      
          Sorting obj = new Sorting(); 
		obj.BubbleSort(Arr);

		System.out.println("Data after function call");
		for( i=0; i< Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}