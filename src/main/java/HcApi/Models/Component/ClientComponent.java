package HcApi.Models.Component;
import java.util.ArrayList;


public class ClientComponent {


    private String title;

    private String id;

    private String type;

    private ComponentProperties properties ;

    private String ordering;

    private ArrayList<String> controlBindings;

    private ArrayList<String> sensorBindings;

    ///


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ComponentProperties getProperties() {
        return properties;
    }

    public void setProperties(ComponentProperties properties) {
        this.properties = properties;
    }

    public String getOrdering() {
        return ordering;
    }

    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }

    public ArrayList<String> getControlBindings() {
        return controlBindings;
    }

    public void setControlBindings(ArrayList<String> controlBindings) {
        this.controlBindings = controlBindings;
    }

    public ArrayList<String> getSensorBindings() {
        return sensorBindings;
    }

    public void setSensorBindings(ArrayList<String> sensorBindings) {
        this.sensorBindings = sensorBindings;
    }
}

