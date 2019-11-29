package ir.sample.DesignPatternProxy1;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet
{
    private  Internet internet = new RealInternet();
    private static List<String> restrictedSites ;

    static {
        restrictedSites = new ArrayList<String>();
        restrictedSites.add("www.google.com");
        restrictedSites.add("www.youtube.com");
        restrictedSites.add("www.twitter.com");
        restrictedSites.add("www.facebook.com");

    }
    @Override
    public void connectTo(String host) throws Exception
    {
        if(!restrictedSites.contains(host.toLowerCase()))
        {
            internet.connectTo(host);
        }
        else
        throw new Exception("Company restricted site: "+host);
    }
}
