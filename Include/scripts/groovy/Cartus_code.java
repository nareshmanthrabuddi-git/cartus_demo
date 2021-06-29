
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.*;

import org.testng.annotations.Test;

public class Cartus_code {
	
	@Test(groups = { "Cartus_code" })
	public void TestCase() throws InterruptedException, IOException, Exception {
		
		// PostMan Script Copied
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				Request request = new Request.Builder()
				  .url("http://postman-echo.com/get")
				  .method("GET", null)
				  .addHeader("Cookie", "sails.sid=s%3AZXysZTa5lewsf8aThTqS679DnAQISST-.Q3HkjH7Uvv%2F3z8RjoQ23y2Yo%2FFwcqa9z3CSOtXlzEAI")
				  .build();
				Response response = client.newCall(request).execute();
				
				//PostMan Ends...
				
				System.out.println("Response-\n"+response);
				System.out.println("*******************************");
				System.out.println("Body\n"+response.body());
				System.out.println("*******************************");
				System.out.println("Message\n"+response.message());
				System.out.println("*******************************");
	}

}