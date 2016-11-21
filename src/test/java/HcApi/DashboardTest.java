package HcApi;
import HcApi.Models.Dashboard.ClientDashboard;
import HcApi.Token.Token;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;


public class DashboardTest {


    @Test
    public void DashboardGetAllTest() {
        assertTrue("Login failed", LoginTest.TryLogin());

        ArrayList<ClientDashboard> dashboards = DashboardManager.GetAllDashboard();
    }


    @Test
    public void CreateGetDeleteDashboardTest() {
        assertTrue("Login failed", LoginTest.TryLogin());

        //create
        ClientDashboard newDashboard = DashboardManager.CreateDashboard("new dashboard");

        //get
        ClientDashboard db = DashboardManager.GetDashboard(newDashboard.getId());

        //delete
        String res = DashboardManager.DeleteDashboard(db.getId());

    }


}
