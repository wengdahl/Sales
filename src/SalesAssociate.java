import java.util.ArrayList;

public class SalesAssociate extends Employee {

    protected String employeeName;

    protected String getEmployeeName() {
        return employeeName;
    }

    protected void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    protected String getSalesManager() {
        return SalesManager;
    }

    protected void setSalesManager(String salesManager) {
        SalesManager = salesManager;
    }

    protected long getSalesID() {
        return salesID;
    }

    protected void setSalesID(long salesID) {
        this.salesID = salesID;
    }

    protected String SalesManager;
    protected long salesID;

    double bonus(){

        return 0;
    }

}
