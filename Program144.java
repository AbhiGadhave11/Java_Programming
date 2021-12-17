import java.util.*;

class Marvellous
{
   public int Addition(int Brr[])
   {
      int iCnt = 0;
      int iSum = 0;
      
      for(iCnt=0;iCnt < Brr.length;iCnt++)
      {
         iSum = iSum + Brr[iCnt];
      }
      
      return iSum;
   }
}
class Program144
{
	public static void main(String arg[])
	{
		int iSize=0,iCnt=0;
    int iRet;
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter Number Of Elements");
      iSize = sobj.nextInt();

      int arr[] = new int[iSize];
      
      System.out.println("Enter Numbers");
      for(iCnt=0;iCnt<arr.length;iCnt++)
      {
          arr[iCnt] = sobj.nextInt();
      }
     
      Marvellous mobj = new Marvellous();
      iRet = mobj.Addition(arr);

      System.out.println("Addition of all Numbers is:"+iRet);

	} 
}