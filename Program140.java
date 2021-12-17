import java.util.*;

class Marvellous
{
     public int Addition(int iNo1,int iNo2)
    {
        int iResult = 0;
        iResult = iNo1 + iNo2;
        return iResult;
    }
}
class Program140
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
       
        Marvellous mobj = new Marvellous();
        int iAns = mobj.Addition(iValue1,iValue2);

       System.out.println("Addition is "+iAns);  
	}
}