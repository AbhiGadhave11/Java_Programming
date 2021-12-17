import java.lang.*;
import java.util.*;

class Program139
{
    public static int Addition(int iNo1,int iNo2)
    {
        int iResult = 0;
        iResult = iNo1 + iNo2;
        return iResult;
    }
	public static void main(String Arg[])
	{
        int iValue1 = 0;
        int iValue2 = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First Number");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter Second Number");
        iValue2 = sobj.nextInt();
       
        int iAns = 0;
        
        iAns = Addition(iValue1,iValue2);

       System.out.println("Addition is "+iAns);  
	}
}