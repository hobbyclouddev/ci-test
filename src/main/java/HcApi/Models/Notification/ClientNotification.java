package HcApi.Models.Notification;
import HcApi.Models.Device.DataTypeEnum;
import java.util.ArrayList;

public class ClientNotification {

    private String ID ;

    private String Name ;

    private boolean Activated ;

    private int NextNotificationAfterMinutes;

    private String OwnerUser;

    private HcApi.Models.License.License License ;

    private String SensorId ;

    private float MinValue ;

    private float MaxValue ;

    private boolean MobileNotification ;

    private boolean EmailNotification ;

    private ArrayList<String> NotifyEmails ;

    private DataTypeEnum ValueDataType ;

    private ArrayList<ClientAction> Actions;

    private String NotificationRuleType ; //NotificationRuleTypeEnum

    //


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isActivated() {
        return Activated;
    }

    public void setActivated(boolean activated) {
        Activated = activated;
    }

    public int getNextNotificationAfterMinutes() {
        return NextNotificationAfterMinutes;
    }

    public void setNextNotificationAfterMinutes(int nextNotificationAfterMinutes) {
        NextNotificationAfterMinutes = nextNotificationAfterMinutes;
    }

    public String getOwnerUser() {
        return OwnerUser;
    }

    public void setOwnerUser(String ownerUser) {
        OwnerUser = ownerUser;
    }

    public HcApi.Models.License.License getLicense() {
        return License;
    }

    public void setLicense(HcApi.Models.License.License license) {
        License = license;
    }

    public String getSensorId() {
        return SensorId;
    }

    public void setSensorId(String sensorId) {
        SensorId = sensorId;
    }

    public float getMinValue() {
        return MinValue;
    }

    public void setMinValue(float minValue) {
        MinValue = minValue;
    }

    public float getMaxValue() {
        return MaxValue;
    }

    public void setMaxValue(float maxValue) {
        MaxValue = maxValue;
    }

    public boolean isMobileNotification() {
        return MobileNotification;
    }

    public void setMobileNotification(boolean mobileNotification) {
        MobileNotification = mobileNotification;
    }

    public boolean isEmailNotification() {
        return EmailNotification;
    }

    public void setEmailNotification(boolean emailNotification) {
        EmailNotification = emailNotification;
    }

    public ArrayList<String> getNotifyEmails() {
        return NotifyEmails;
    }

    public void setNotifyEmails(ArrayList<String> notifyEmails) {
        NotifyEmails = notifyEmails;
    }

    public DataTypeEnum getValueDataType() {
        return ValueDataType;
    }

    public void setValueDataType(DataTypeEnum valueDataType) {
        ValueDataType = valueDataType;
    }

    public ArrayList<ClientAction> getActions() {
        return Actions;
    }

    public void setActions(ArrayList<ClientAction> actions) {
        Actions = actions;
    }

    public String getNotificationRuleType() {
        return NotificationRuleType;
    }

    public void setNotificationRuleType(String notificationRuleType) {
        NotificationRuleType = notificationRuleType;
    }
}
