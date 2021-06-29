import java.io.IOException;
import okhttp3.OkHttpClient;

import okhttp3.Request;
import okhttp3.Response;

	

public class javahttp_Demo {
	
	public static void main(String[] args)
	{
	              OkHttpClient client = new OkHttpClient().newBuilder()
	              .build();
	              Request request = new Request.Builder()
	              .url("http://postman-echo.com/get")
	              .method("GET", null)
	              .build();
	              try {
	              Response response = client.newCall(request).execute();
	              }
	              catch(Exception e) {}System.out.println("Ok HTTP code");
	              
	}

	
	

}