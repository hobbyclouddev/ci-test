package HcApi.ResponseModels.Device;
import HcApi.Models.Device.ClientDevice;
import HcApi.ResponseModels.StandardResponseModel;

public class DeviceResponseModel extends StandardResponseModel {

    private ClientDevice data;

    public ClientDevice getData() {
        return data;
    }

    public void setData(ClientDevice data) {
        this.data = data;
    }
}
