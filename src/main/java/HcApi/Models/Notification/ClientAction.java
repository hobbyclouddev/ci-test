package HcApi.Models.Notification;

public class ClientAction {

    private String ActionName ;

    private String ToolAction ;

    private String BindValue ;

    //


    public String getActionName() {
        return ActionName;
    }

    public void setActionName(String actionName) {
        ActionName = actionName;
    }

    public String getToolAction() {
        return ToolAction;
    }

    public void setToolAction(String toolAction) {
        ToolAction = toolAction;
    }

    public String getBindValue() {
        return BindValue;
    }

    public void setBindValue(String bindValue) {
        BindValue = bindValue;
    }
}
