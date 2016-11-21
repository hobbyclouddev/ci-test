package HcApi.Models.Notification;
import java.util.ArrayList;

public class UpdateNotificationModel {

    private String Name ;

    private String Id;

    private boolean Activated;

    private int NextNotificationAfterMinutes ;

    private float MinValue ;

    private float MaxValue;

    private boolean MobileNotification;

    private boolean EmailNotification;

    private ArrayList<String> NotifyEmails;

    private String NotificationRuleType ; //NotificationRuleTypeEnum

    //


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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

    public String getNotificationRuleType() {
        return NotificationRuleType;
    }

    public void setNotificationRuleType(String notificationRuleType) {
        NotificationRuleType = notificationRuleType;
    }
}
