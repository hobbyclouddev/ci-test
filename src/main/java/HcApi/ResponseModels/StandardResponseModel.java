package HcApi.ResponseModels;

public class StandardResponseModel {

    private boolean error;

    private int errorCode;

    private boolean success;

    public String getErrorCodeStr() {
        return errorCodeStr;
    }

    public void setErrorCodeStr(String errorCodeStr) {
        this.errorCodeStr = errorCodeStr;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    private String errorCodeStr;


    //



}
