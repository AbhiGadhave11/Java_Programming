import java.util.*;

class StringX
{
    public String str;
    
    public void Accept()
    {
    	Scanner sobj = new Scanner(System.in);
    	System.out.println("Enter String");
    	str = sobj.nextLine();
    }

    public void Display()
    {
    	System.out.println("String is : "+str);
    }
}

class Marvellous extends StringX
{
  public boolean ChkPalindrome()
  {
    char Arr[];
    Arr = str.toCharArray();
    int iStart = 0,iEnd = (Arr.length-1),i=0;
    char temp;
    while(iStart < iEnd)
    {
        temp = Arr[iStart];
        Arr[iStart] = Arr[iEnd];
        Arr[iEnd] = temp;
        iStart++;
        iEnd--;
    }
    String newstr = new String(Arr);
    boolean bret = newstr.equals(str);
    return bret;

  }
}


class Program156
{
	public static void main(String Arg[])
	{
    String str1;
      Marvellous mobj = new Marvellous();
      
      mobj.Accept();
      mobj.Display();
     boolean bret = false;
     bret = mobj.ChkPalindrome();
     if(bret == true)
     {
      System.out.println("String is Palindrome");
     }
     else
     {
       System.out.println("String is Not Palindrome");
     }
  }
}
