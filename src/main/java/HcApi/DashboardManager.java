package HcApi;

import HcApi.Models.Dashboard.ClientDashboard;
import HcApi.ResponseModels.Dashboard.DashboardListResponseModel;
import HcApi.ResponseModels.Dashboard.DashboardResponseModel;
import HcApi.ResponseModels.StringDataResponseModel;
import HcApi.Token.Token;
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

public class DashboardManager {


    public static ArrayList<ClientDashboard> GetAllDashboard()
    {
        try
        {
            String url = SiteAddress.Dashboard.GetAll;
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(url);
            String tokenKey = Token.getKey();
            request.addHeader("Authorization", tokenKey);
            HttpResponse response = client.execute(request);
            System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
            BufferedReader rd = new BufferedReader( new InputStreamReader(response.getEntity().getContent()));

            StringBuffer jsonResult = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                jsonResult.append(line);
            }
            String testJsonResult = jsonResult.toString();
            Gson gson =  new Gson();

            DashboardListResponseModel responseModel = gson.fromJson(jsonResult.toString(), DashboardListResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                ArrayList<ClientDashboard> dashboards = responseModel.getData();
                return dashboards;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }


    public static ClientDashboard CreateDashboard(String dashboardName)
    {
        try
        {
            String url = SiteAddress.Dashboard.Create;
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(url);
            List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
            urlParameters.add(new BasicNameValuePair("name", dashboardName));
            post.setEntity(new UrlEncodedFormEntity(urlParameters));
            String tokenKey = Token.getKey();
            post.addHeader("Authorization", tokenKey);
            HttpResponse response = client.execute(post);
            System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
            BufferedReader rd = new BufferedReader( new InputStreamReader(response.getEntity().getContent()));

            StringBuffer jsonResult = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                jsonResult.append(line);
            }
            String testJsonResult = jsonResult.toString();
            Gson gson =  new Gson();

            DashboardResponseModel responseModel = gson.fromJson(jsonResult.toString(), DashboardResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                ClientDashboard dashboard = responseModel.getData();
                return dashboard;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

    public static ClientDashboard GetDashboard(String dashboardId)
    {
        try
        {
            String url = SiteAddress.Dashboard.GetDashboard + "/" + dashboardId;
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(url);
            String tokenKey = Token.getKey();
            request.addHeader("Authorization", tokenKey);
            HttpResponse response = client.execute(request);
            System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
            BufferedReader rd = new BufferedReader( new InputStreamReader(response.getEntity().getContent()));

            StringBuffer jsonResult = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                jsonResult.append(line);
            }
            String testJsonResult = jsonResult.toString();
            Gson gson =  new Gson();

            DashboardResponseModel responseModel = gson.fromJson(jsonResult.toString(), DashboardResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                ClientDashboard dashboards = responseModel.getData();
                return dashboards;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }


    public static String DeleteDashboard(String dashboardId)
    {
        try
        {
            String url = SiteAddress.Dashboard.Delete + "/" + dashboardId;
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(url);
            String tokenKey = Token.getKey();
            request.addHeader("Authorization", tokenKey);
            HttpResponse response = client.execute(request);
            System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
            BufferedReader rd = new BufferedReader( new InputStreamReader(response.getEntity().getContent()));

            StringBuffer jsonResult = new StringBuffer();
            String line = "";
            while ((line = rd.readLine()) != null) {
                jsonResult.append(line);
            }
            String testJsonResult = jsonResult.toString();
            Gson gson =  new Gson();

            StringDataResponseModel responseModel = gson.fromJson(jsonResult.toString(), StringDataResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                String data = responseModel.getData();
                return data;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

}
