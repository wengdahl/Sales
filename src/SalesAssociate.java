import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SalesAssociate extends Employee {

    protected SalesManager SalesManager;
    protected long salesID;
    protected String employeeName;

    public  SalesAssociate(String nm, long ID)
    {
        employeeName = nm;
        salesID = ID;
    }

    /*
    Getters----
     */
    protected String getEmployeeName() {
        return employeeName;
    }

    protected SalesManager getSalesManager() {
        return SalesManager;
    }

    protected long getSalesID() {
        return salesID;
    }

    /*
    SETTERS---
     */

    protected void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    protected void setSalesManager(SalesManager salesManager) {
        SalesManager = salesManager;
    }

    protected void setSalesID(long salesID) {
        this.salesID = salesID;
    }

    /*
    make the bonus for an associate
     */
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
