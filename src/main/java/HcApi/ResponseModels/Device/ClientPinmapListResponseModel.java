package HcApi.ResponseModels.Device;
import HcApi.Models.Device.ClientPinMap;
import HcApi.ResponseModels.StandardResponseModel;

import java.util.ArrayList;



public class ClientPinmapListResponseModel extends StandardResponseModel {

    private ArrayList<ClientPinMap> data;

    public ArrayList<ClientPinMap> getData() {
        return data;
    }

    public void setData(ArrayList<ClientPinMap> data) {
        this.data = data;
    }
}
