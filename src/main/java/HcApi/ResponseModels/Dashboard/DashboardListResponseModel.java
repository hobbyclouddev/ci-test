package HcApi.ResponseModels.Dashboard;
import HcApi.Models.Dashboard.ClientDashboard;
import HcApi.ResponseModels.StandardResponseModel;

import java.util.ArrayList;

public class DashboardListResponseModel extends StandardResponseModel {

    private ArrayList<ClientDashboard> data;

    public ArrayList<ClientDashboard> getData() {
        return data;
    }

    public void setData(ArrayList<ClientDashboard> data) {
        this.data = data;
    }
}
