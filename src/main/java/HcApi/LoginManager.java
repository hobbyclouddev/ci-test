package HcApi;

import HcApi.ResponseModels.LoginResponseModel;
import HcApi.ResponseModels.StandardResponseModel;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class LoginManager {

	public static String Login(String userEmail, String password)
	{
		try
		{
			String url = SiteAddress.Login.LoginUrl;
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add(new BasicNameValuePair("username", userEmail));
			urlParameters.add(new BasicNameValuePair("password", password));
			post.setEntity(new UrlEncodedFormEntity(urlParameters));
			HttpResponse response = client.execute(post);
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
	
			StringBuffer jsonResult = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				jsonResult.append(line);
			}
			
			Gson gson = new Gson();
			LoginResponseModel responseModel = gson.fromJson(jsonResult.toString(), LoginResponseModel.class);
			return responseModel.getToken();
		}
		catch(Exception e)
		{
			return "";		
		}
	}
	
    
	public static boolean GetTime()
	{
		try
		{
			String url = SiteAddress.Login.GetTimeUrl;
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);
			HttpResponse response = client.execute(request);
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
			BufferedReader rd = new BufferedReader( new InputStreamReader(response.getEntity().getContent()));
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			return true;
		}
		catch(Exception e)
		{
			return false;		
		}
	}
	
	public static boolean Registration(String userEmail, String password, String firstName, String lastName)
    {
		try
		{
			String url = SiteAddress.Login.RegistrationUrl;
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add(new BasicNameValuePair("email", userEmail));
			urlParameters.add(new BasicNameValuePair("password", password));
			urlParameters.add(new BasicNameValuePair("firstName", firstName));
			urlParameters.add(new BasicNameValuePair("lastName", lastName));
			post.setEntity(new UrlEncodedFormEntity(urlParameters));
			HttpResponse response = client.execute(post);
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
	
			StringBuffer jsonResult = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				jsonResult.append(line);
			}
			String testJsonResult = jsonResult.toString();
			Gson gson = new Gson();
			StandardResponseModel responseModel = gson.fromJson(jsonResult.toString(), StandardResponseModel.class);
			return !responseModel.isError();
		}
		catch(Exception e)
		{
			return false;
		}
    }
	
}
