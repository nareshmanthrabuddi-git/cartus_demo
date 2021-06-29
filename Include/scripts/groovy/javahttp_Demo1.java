import java.io.IOException;
import okhttp3.OkHttpClient;
//import com.squareup.okhttp.Request;
//import com.squareup.okhttp.RequestBody;
//import com.squareup.okhttp.Response;
import okhttp3.Request;
import okhttp3.Response;

	

public class javahttp_Demo1 {
	
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