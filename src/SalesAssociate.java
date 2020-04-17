import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SalesAssociate extends Employee {

    public  SalesAssociate(String nm, long ID)
    {
        employeeName = nm;
        salesID = ID;
    }

    protected String employeeName;

    protected String getEmployeeName() {
        return employeeName;
    }

    protected void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    protected SalesManager getSalesManager() {
        return SalesManager;
    }

    protected void setSalesManager(SalesManager salesManager) {
        SalesManager = salesManager;
    }

    protected long getSalesID() {
        return salesID;
    }

    protected void setSalesID(long salesID) {
        this.salesID = salesID;
    }

    protected SalesManager SalesManager;
    protected long salesID;

    protected double Bonus() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        //for accessing private method
        Method m=Employee.class.getDeclaredMethod("getClients");
        m.setAccessible(true);
        return 500*((ArrayList)(m.invoke(this.getClass().getSuperclass()))).size();
    }

    public String toString()
    {
        String s ="Sales  Associate: "+employeeName+". Sales Manager: "+SalesManager.getEmployeeName()+". Clients: " +super.clientString();
        return s;
    }


}
