import java.util.*;

class Marvellous
{
	public boolean CkhPrime(int iNo)
	{
        int iCnt = 0;
        boolean bFlag = true;

        for(iCnt=2;iCnt<iNo/2;iCnt++)
        {
        	if(iNo%iCnt==0)
        	{
        		bFlag = false;
        		break;
        	}
        }
        return bFlag;
    }

	
}
class Program142
{
	
	public static void main(String Arg[])
	{
		int iValue = 0;
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number");

		iValue = sobj.nextInt();

        boolean bRet = false;
 
     Marvellous mobj = new Marvellous();
     bRet = mobj.CkhPrime(iValue);
		if(bRet == true)
		{
			System.out.println("Given no. is Prime");
		}
		else
		{
			System.out.println("Given No. is Not Prime");
		}

	}
}