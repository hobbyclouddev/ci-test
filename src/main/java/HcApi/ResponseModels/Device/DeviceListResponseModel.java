package HcApi.ResponseModels.Device;
import HcApi.Models.Device.ClientDevice;
import HcApi.ResponseModels.StandardResponseModel;

import java.util.ArrayList;

public class DeviceListResponseModel extends StandardResponseModel {

    private ArrayList<ClientDevice> data;

    public ArrayList<ClientDevice> getData() {
        return data;
    }

    public void setData(ArrayList<ClientDevice> data) {
        this.data = data;
    }
}
