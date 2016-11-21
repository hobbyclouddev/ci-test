package HcApi.ResponseModels.Notification;
import HcApi.Models.Notification.ClientNotification;
import HcApi.ResponseModels.StandardResponseModel;

import java.util.ArrayList;

public class NotificationListResponseModel extends StandardResponseModel {

    private ArrayList<ClientNotification> data;

    public ArrayList<ClientNotification> getData() {
        return data;
    }

    public void setData(ArrayList<ClientNotification> data) {
        this.data = data;
    }
}
