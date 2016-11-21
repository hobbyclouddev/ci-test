package HcApi;

import HcApi.Models.Device.ClientDevice;
import HcApi.Models.Device.ClientPinMap;
import HcApi.Token.Token;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class DeviceTest {


    @Test
    public void DeviceGetAllTest() {
        assertTrue("Login failed", LoginTest.TryLogin());

        ArrayList<ClientDevice> devices = DeviceManager.GetAllDevice();

    }


    @Test
    public void CreateGetDeleteDeviceTest() {
        assertTrue("Login failed", LoginTest.TryLogin());

        //create
        ClientDevice newDevice = DeviceManager.CreateDevice("new device");
        if (newDevice == null) assertTrue("create device failed",false);

        //get
        ClientDevice dev = DeviceManager.GetDevice(newDevice.getId());
        if (dev == null) assertTrue("get device failed",false);

        if (dev != null)
        {
            ArrayList<String> connectedComponents = DeviceManager.GetAllConnectedControl();
            ArrayList<ClientPinMap> pinmaps = DeviceManager.GetHwMapping(dev.getId());              // controlt kell hozzáadni hogy legyen pinmap
        }


        //delete
        String res = DeviceManager.DeleteDevice(dev.getId());
        assertTrue("delete device failed",res.contains("successful"));
    }

}
