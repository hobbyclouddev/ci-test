package HcApi.ResponseModels;

import java.util.ArrayList;

public class ListStringDataResponseModel extends StandardResponseModel {

    private ArrayList<String> data;

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }
}
