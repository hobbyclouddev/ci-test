package HcApi.Models.Sensor;

public class ClientSensor {

    private String id;

    private String name ;

    private String dataType ; //DataTypeEnum

    private String dataHistory ; // DataHistoryEnum

    private boolean FilterActive ;

    private float FilterMinValue ;

    private float FilterMaxValue ;

    private float FilterMultiplier ;

    private float FilterDivider ;

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

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataHistory() {
        return dataHistory;
    }

    public void setDataHistory(String dataHistory) {
        this.dataHistory = dataHistory;
    }

    public boolean isFilterActive() {
        return FilterActive;
    }

    public void setFilterActive(boolean filterActive) {
        FilterActive = filterActive;
    }

    public float getFilterMinValue() {
        return FilterMinValue;
    }

    public void setFilterMinValue(float filterMinValue) {
        FilterMinValue = filterMinValue;
    }

    public float getFilterMaxValue() {
        return FilterMaxValue;
    }

    public void setFilterMaxValue(float filterMaxValue) {
        FilterMaxValue = filterMaxValue;
    }

    public float getFilterMultiplier() {
        return FilterMultiplier;
    }

    public void setFilterMultiplier(float filterMultiplier) {
        FilterMultiplier = filterMultiplier;
    }

    public float getFilterDivider() {
        return FilterDivider;
    }

    public void setFilterDivider(float filterDivider) {
        FilterDivider = filterDivider;
    }
}
