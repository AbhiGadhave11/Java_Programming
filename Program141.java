import java.lang.*;
import java.util.*;

class Infosystems
{
	public boolean ChkArmstrong(int iNo)
	{
		int iTemp=0,iDigit=0,iDigCnt=0,iPower=1;
		int iSum = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		iTemp = iNo;

		while(iTemp!=0)
		{
           iDigCnt++; 
           iTemp = iTemp / 10; 
		}
        
        iTemp = iNo;

       while(iTemp!=0)
       {
       	  iDigit = iDigit%10;
          for(int iCnt=1;iCnt<=iDigCnt;iCnt++)
          {
          	iPower = iPower * iDigit;
          }
          iSum = iSum + iPower; 
          iPower=1;
       	  iTemp = iTemp/10;
       }
       
       if(iSum == iNo)
       {
       	  return true;
       }
       else
       {
       	  return false;
       }
	}	
}
class Program141
{
	
	public static void main(String Arg[])
	{
		int iValue = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number");

		iValue = sobj.nextInt();

        boolean bRet = false;
 
     Infosystems mobj = new Infosystems();
     bRet = mobj.ChkArmstrong(iValue);
		
		if(bRet == true)
		{
			System.out.println("Given no. is Armstrong");
		}
		else
		{
			System.out.println("Given No. is Not Armstrong");
		}

	}
}