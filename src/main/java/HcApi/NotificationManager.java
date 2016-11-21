package HcApi;
import HcApi.Models.Notification.ClientNotification;
import HcApi.Models.Notification.UpdateNotificationModel;
import HcApi.ResponseModels.Notification.NotificationListResponseModel;
import HcApi.ResponseModels.Notification.NotificationResponseModel;
import HcApi.ResponseModels.StandardResponseModel;
import HcApi.ResponseModels.StringDataResponseModel;
import HcApi.Token.Token;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NotificationManager {

    public static ArrayList<ClientNotification> GetAllNotification()
    {
        try
        {
            String url = SiteAddress.Notification.GetAll;
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

            NotificationListResponseModel responseModel = gson.fromJson(jsonResult.toString(), NotificationListResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                ArrayList<ClientNotification> Notifications = responseModel.getData();
                return Notifications;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }


    public static ClientNotification CreateNotification( String notificationName, String sensorId)
    {
        try
        {
            String url = SiteAddress.Notification.Create;
            HttpClient client = HttpClientBuilder.create().build();
            HttpPost post = new HttpPost(url);
            List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
            urlParameters.add(new BasicNameValuePair("notificationName", notificationName));
            urlParameters.add(new BasicNameValuePair("sensorId", sensorId));
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

            NotificationResponseModel responseModel = gson.fromJson(jsonResult.toString(), NotificationResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                ClientNotification Notification = responseModel.getData();
                return Notification;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }

    public static ClientNotification UpdateNotification(UpdateNotificationModel updateNotificationModel)
    {
        try
        {
            String url = SiteAddress.Notification.Update;
            HttpClient client = HttpClientBuilder.create().build();

            HttpPost post = new HttpPost(url);
            Gson gson =  new Gson();
            String jsonModel = gson.toJson(updateNotificationModel);
            post.setEntity(new StringEntity(jsonModel));

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
            //Gson gson =  new Gson();

            NotificationResponseModel responseModel = gson.fromJson(jsonResult.toString(), NotificationResponseModel.class);

            if (responseModel.isError())
            {
                return null;
            }
            else
            {
                ClientNotification Notifications = responseModel.getData();
                return Notifications;
            }
        }
        catch(Exception e)
        {
            return null;
        }
    }


    public static boolean DeleteNotification(String NotificationId)
    {
        try
        {
            String url = SiteAddress.Notification.Delete + "/" + NotificationId;
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

            StandardResponseModel responseModel = gson.fromJson(jsonResult.toString(), StandardResponseModel.class);

            return responseModel.isSuccess();
        }
        catch(Exception e)
        {
            return false;
        }
    }


}
