package ir.sample.DesignPatternSingelton;
/**********************
*    Lazy Loading     *
***********************/
public class SingeltonClass
{
    private static SingeltonClass ourInstance;

    public static SingeltonClass getInstance()
    {
        if (ourInstance == null)
        {
            ourInstance = new SingeltonClass();
        }
        return ourInstance;
    }

    private SingeltonClass()
    {
    }
}



/*******************************
 *    Early Instancetiation     *
 ********************************/

//public class SingeltonClass
//{
//    private static SingeltonClass ourInstance = new SingeltonClass();
//
//    public static SingeltonClass getInstance()
//    {
//        return ourInstance;
//    }
//
//    private SingeltonClass()
//    {
//    }
//}