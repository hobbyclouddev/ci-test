package HcApi.ResponseModels.Notification;
import HcApi.Models.Notification.ClientNotification;
import HcApi.ResponseModels.StandardResponseModel;

public class NotificationResponseModel extends StandardResponseModel {

    private ClientNotification data;

    public ClientNotification getData() {
        return data;
    }

    public void setData(ClientNotification data) {
        this.data = data;
    }
}
