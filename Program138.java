import java.lang.*;
import java.util.*;

class Program138
{
	public static void main(String Arg[])
	{
        int iValue1 = 0;
        int iValue2 = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First Number");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter Second Number");
        iValue2 = sobj.nextInt();
         
         int iAns=0;
         iAns = iValue1 + iValue2;
        
        System.out.println("Addition is "+iAns);  
	}
}