package Interview_topics;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpStatusCode {

	public static void main(String[] args) throws Throwable {
		String linkurl ="https://www.amazon.com"  ;
		Method(linkurl);

	}
    public static void Method(String linkurl) throws Throwable{
    	URL url = new URL(linkurl);
   	HttpURLConnection  huc = (HttpURLConnection)url.openConnection();
    //	hc =url.openConnection();
    	
    	huc.setConnectTimeout(3000);
    	
    	System.out.println(huc.getResponseCode());
    
    }
}
