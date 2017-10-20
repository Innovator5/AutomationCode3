/**
 * 
 */
package TestCases;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


/**
 * @author Dhruv
 * Mar 18, 2016
 */
public class GridTest {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {

		 int n, i, j, k;
	        System.out.println("How many row you want: ");
	         n = 10;
	         for(i=1;i<=n;i++)
	            {
	                for(k=0;k<=n-i;k++)
	                {
	                     System.out.print(" ");
	                }

	               for(j=n;j>=k;j--)
	               {
	                   System.out.print("*");
	               }

	                 System.out.print("\n");
	            }

    }
}
