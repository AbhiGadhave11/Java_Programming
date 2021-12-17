import java.util.*;

class Program143
{
	public static void main(String arg[])
	{
		int iSize=0,iCnt=0;
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter Number Of Elements");
      iSize = sobj.nextInt();

      int arr[] = new int[iSize];
      
      System.out.println("Enter Numbers");
      for(iCnt=0;iCnt<arr.length;iCnt++)
      {
          arr[iCnt] = sobj.nextInt();
      }
     
      System.out.println("Displayed Elements are:");
     
      for(iCnt=0;iCnt<arr.length;iCnt++)
      {
      	System.out.println(arr[iCnt]);
      }
	} 
}