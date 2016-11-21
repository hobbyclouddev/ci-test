package HcApi.ResponseModels.Dashboard;
import HcApi.Models.Dashboard.ClientDashboard;
import HcApi.ResponseModels.StandardResponseModel;

public class DashboardResponseModel extends StandardResponseModel {

    private ClientDashboard data;

    public ClientDashboard getData() {
        return data;
    }

    public void setData(ClientDashboard data) {
        this.data = data;
    }
}
