package ir.sample.DesignPatternProxy1;

public class ProxyPattern
{
    public static void main(String[] args)
    {
        CheckUrl("www.google.com");
        CheckUrl("www.time.ir");

    }
    public static void CheckUrl(String url){
        Internet internetConnection = new InternetProxy();
        try
        {
            internetConnection.connectTo(url);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
