package HcApi.Models.Device;

public class Wifi {

    private String SSID;

    private String Password;

    private String Signal;

    //

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSignal() {
        return Signal;
    }

    public void setSignal(String signal) {
        Signal = signal;
    }
}
