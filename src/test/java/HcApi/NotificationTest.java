package HcApi;

import HcApi.Models.Device.ClientDevice;
import HcApi.Models.Notification.ClientNotification;
import HcApi.Models.Notification.UpdateNotificationModel;
import HcApi.Token.Token;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class NotificationTest {


    @Test
    public void NotificationGetAllTest() {
        assertTrue("Login failed", LoginTest.TryLogin());
        ArrayList<ClientNotification> Notifications = NotificationManager.GetAllNotification();
    }


    @Test
    public void CreateUpdateDeleteNotificationTest() {
        assertTrue("Login failed", LoginTest.TryLogin());

        ArrayList<ClientDevice> devices = DeviceManager.GetAllDevice();
        if (devices.size() == 0) assertTrue("##HIBA## device nelkul nincs notification test",false);
        String sensorId = devices.get(0).getSensors().get(0).getId();

        //create
        ClientNotification newNotification = NotificationManager.CreateNotification("new Notification", sensorId);

        UpdateNotificationModel changedModel = new UpdateNotificationModel();
        changedModel.setId(newNotification.getID());
        changedModel.setEmailNotification(newNotification.isEmailNotification());
        changedModel.setName(newNotification.getName());

        ClientNotification not = NotificationManager.UpdateNotification(changedModel);

        //delete
        boolean res = NotificationManager.DeleteNotification(newNotification.getID());

    }

}
