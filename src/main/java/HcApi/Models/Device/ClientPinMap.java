package HcApi.Models.Device;

public class ClientPinMap {

    private String CloudObject;

    private String CloudObjectName ;

    private String CloudObjectType ;       // enum CloudObjectType pl: Control, Sensor

    private int Pin ;

    private String Type ;  // enum HwModul pl: CONTROL_RGBLED

    private HwModulSettings Settings;


    public String getCloudObject() {
        return CloudObject;
    }

    public void setCloudObject(String cloudObject) {
        CloudObject = cloudObject;
    }

    public String getCloudObjectName() {
        return CloudObjectName;
    }

    public void setCloudObjectName(String cloudObjectName) {
        CloudObjectName = cloudObjectName;
    }

    public String getCloudObjectType() {
        return CloudObjectType;
    }

    public void setCloudObjectType(String cloudObjectType) {
        CloudObjectType = cloudObjectType;
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int pin) {
        Pin = pin;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public HwModulSettings getSettings() {
        return Settings;
    }

    public void setSettings(HwModulSettings settings) {
        Settings = settings;
    }
}
