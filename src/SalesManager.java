import java.util.ArrayList;

public class SalesManager extends Employee{
    protected String employeeName;
    private ArrayList<Employee> employees;
    protected SalesManager manager;
    protected long salesID;

    public  SalesManager(String nm, long ID)
    {
        employeeName = nm;
        salesID = ID;
        employees = new ArrayList<Employee>();
    }
    protected SalesManager getManager()
    {
        return manager;
    }
    protected void setManager(SalesManager m)
    {
        manager = m;
    }

    protected double Bonus()
    {
        return 666;
    }

}
