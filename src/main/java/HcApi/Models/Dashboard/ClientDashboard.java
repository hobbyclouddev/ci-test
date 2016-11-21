package HcApi.Models.Dashboard;
import HcApi.Models.Component.ClientComponent;
import HcApi.Models.License.License;

import java.util.ArrayList;

public class ClientDashboard {

    private String id ;

    private String name ;

    private License license;

    private int refreshRateInSec;

    private String ownerUser;

    private ArrayList<String> sharedWithUsers;

    private ArrayList<ClientComponent> components;

    private String ordering ;

    ///


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

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public int getRefreshRateInSec() {
        return refreshRateInSec;
    }

    public void setRefreshRateInSec(int refreshRateInSec) {
        this.refreshRateInSec = refreshRateInSec;
    }

    public String getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(String ownerUser) {
        this.ownerUser = ownerUser;
    }

    public ArrayList<String> getSharedWithUsers() {
        return sharedWithUsers;
    }

    public void setSharedWithUsers(ArrayList<String> sharedWithUsers) {
        this.sharedWithUsers = sharedWithUsers;
    }

    public ArrayList<ClientComponent> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<ClientComponent> components) {
        this.components = components;
    }

    public String getOrdering() {
        return ordering;
    }

    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }
}
