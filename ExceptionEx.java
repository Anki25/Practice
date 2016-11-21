/*
public class ExceptionEx
{
    public static void main(String[] args)
    {
        methodWithThrow();
    }
 
    static void methodWithThrow()
    {
        try
        {
            NumberFormatException ex = new NumberFormatException();    //Creating an object to NumberFormatException explicitly
 
            throw ex;        //throwing NumberFormatException object explicitly using throw keyword
        }
        catch(NumberFormatException ex)
        {
            System.out.println("explicitly thrown NumberFormatException object will be caught here");
        }
    }
}*/

public class ExceptionEx
{
    public static void main(String[] args)
    {
        try
        {
            methodWithThrow();
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException Re-thrown in methodWithThrow() method will be handled here");
        }
    }
 
    static void methodWithThrow()
    {
        try
        {
            String s = null;
            System.out.println(s.length());   //This statement throws NullPointerException
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException is caught here");
 
            throw ex;     //Re-throwing NullPointerException
        }
    }
}