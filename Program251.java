import java.util.*;

class Program251
{
	public static void main(String Arg[])
	{
		int iSize = 0,i=0;
		int Arr[];
		System.out.println("Enter the Size");
		Scanner sobj = new Scanner(System.in);
		iSize = sobj.nextInt();
        Arr = new int[iSize];

		System.out.println("Enter the Element");
		for(i=0;i < Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}

		System.out.println("Displayed Elements are :");

		for(i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
}