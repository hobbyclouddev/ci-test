package HcApi.ResponseModels;

public class LoginResponseModel {


	private String token;

    private Object data;

    private boolean error;

    private int errorCode;
    
    private boolean success;

    private String errorCodeStr;

	//
    
    public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
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

	public String getErrorCodeStr() {
		return errorCodeStr;
	}

	public void setErrorCodeStr(String errorCodeStr) {
		this.errorCodeStr = errorCodeStr;
	}

    
}
