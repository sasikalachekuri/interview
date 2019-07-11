package Interview_topics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, Throwable {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		// -----------listing all the links (includes a tag and img tags)
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img"))); // addall method
		System.out.println(links.size());
		// ---------------all a tags and img tags included---------------------

		// ---------------Declaring a new array list---------------------------
		List<WebElement> active_links = new ArrayList<WebElement>();
		// --------------------------------------------------------------------
		for (int i = 0; i < links.size(); i++) {
			if ((links.get(i).getAttribute("href") != null) && (links.get(i).getText()) != null) {
				// if(links.get(i).getAttribute("href")==null){ //
				active_links.add(links.get(i));

				String linktext = active_links.get(i).getAttribute("href");
				// System.out.println(linktext);
			}
		}
		// -------End of for loop
		System.out.println(active_links.size());
		// check the response code and messagge
		// openconnection
		for (int j = 0; j < active_links.size(); j++) {
			String al = active_links.get(j).getAttribute("href");
			HttpURLConnection connection = (HttpURLConnection) new URL(al).openConnection();
			connection.connect();
			int ResponceCode = connection.getResponseCode();
			String ResponseMessage = connection.getResponseMessage();
			connection.disconnect();
			// list all the broken links
			if (ResponceCode == 404) {
				List<WebElement> BrokenLinks = new ArrayList<WebElement>();
				BrokenLinks.add(active_links.get(j));
				System.out.println(active_links.get(j).getAttribute("href") + "--------->" + ResponceCode + "-->"
						+ ResponseMessage);
				System.out.println(BrokenLinks.size());
			}

		} // End of for loop

		driver.quit();

	}

}
