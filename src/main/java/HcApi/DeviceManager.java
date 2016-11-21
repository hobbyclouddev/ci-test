package HcApi;

import HcApi.Models.Device.ClientDevice;
import HcApi.Models.Device.ClientPinMap;
import HcApi.ResponseModels.Device.ClientPinmapListResponseModel;
import HcApi.ResponseModels.Device.DeviceListResponseModel;
import HcApi.ResponseModels.Device.DeviceResponseModel;
import HcApi.ResponseModels.ListStringDataResponseModel;
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

public class DeviceManager {


    public static ArrayList<ClientDevice> GetAllDevice()
    {
        try
        {
            String url = SiteAddress.Device.GetAll;
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

            DeviceListResponseModel responseModel = gson.fromJson(jsonResult.toString(), DeviceListResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                ArrayList<ClientDevice> devices = responseModel.getData();
                return devices;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }


    public static ClientDevice CreateDevice(String deviceName)
    {
        try
        {
            String url = SiteAddress.Device.Create;
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(url);
            List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
            urlParameters.add(new BasicNameValuePair("name", deviceName));
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

            DeviceResponseModel responseModel = gson.fromJson(jsonResult.toString(), DeviceResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                ClientDevice Device = responseModel.getData();
                return Device;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

    public static ClientDevice GetDevice(String DeviceId)
    {
        try
        {
            String url = SiteAddress.Device.GetDevice + "/" + DeviceId;
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

            DeviceResponseModel responseModel = gson.fromJson(jsonResult.toString(), DeviceResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                ClientDevice Devices = responseModel.getData();
                return Devices;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }


    public static String DeleteDevice(String DeviceId)
    {
        try
        {
            String url = SiteAddress.Device.Delete + "/" + DeviceId;
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

    public static ArrayList<String> GetAllConnectedControl()
    {
        try
        {
            String url = SiteAddress.Device.GetAllConnectedControl;
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

            ListStringDataResponseModel responseModel = gson.fromJson(jsonResult.toString(), ListStringDataResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                ArrayList<String> controls = responseModel.getData();
                return controls;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

    public static ArrayList<ClientPinMap> GetHwMapping(String deviceId)
    {
        try
        {
            String url = SiteAddress.Device.GetHwMapping + "/" + deviceId;
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

            ClientPinmapListResponseModel responseModel = gson.fromJson(jsonResult.toString(), ClientPinmapListResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                ArrayList<ClientPinMap> pinmaps = responseModel.getData();
                return pinmaps;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }


}
