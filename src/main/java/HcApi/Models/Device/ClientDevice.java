package HcApi.Models.Device;
import HcApi.Models.Sensor.ClientSensor;
import HcApi.Models.License.License;
import java.util.ArrayList;
import java.util.List;

public class ClientDevice {

    private String id;

    private String name;

    private String macAddress ;

    private String ipAddress ;

    private ArrayList<Wifi> wifiNetworks ;

    private String chipId ;

    private String redisKey ;

    private ArrayList<String> hwMapping ;

    private License license ;

    private String ownerUser ;

    private List<ClientSensor> sensors ;

    private ArrayList<String> controls;

    private ArrayList<String> notifications;

    //


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ArrayList<Wifi> getWifiNetworks() {
        return wifiNetworks;
    }

    public void setWifiNetworks(ArrayList<Wifi> wifiNetworks) {
        this.wifiNetworks = wifiNetworks;
    }

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    public String getRedisKey() {
        return redisKey;
    }

    public void setRedisKey(String redisKey) {
        this.redisKey = redisKey;
    }

    public ArrayList<String> getHwMapping() {
        return hwMapping;
    }

    public void setHwMapping(ArrayList<String> hwMapping) {
        this.hwMapping = hwMapping;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public String getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(String ownerUser) {
        this.ownerUser = ownerUser;
    }

    public List<ClientSensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<ClientSensor> sensors) {
        this.sensors = sensors;
    }

    public ArrayList<String> getControls() {
        return controls;
    }

    public void setControls(ArrayList<String> controls) {
        this.controls = controls;
    }

    public ArrayList<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(ArrayList<String> notifications) {
        this.notifications = notifications;
    }
}
