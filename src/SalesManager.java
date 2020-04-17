import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

    private ArrayList getClients() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //for accessing private method
        Method m=Employee.class.getDeclaredMethod("getClients");
        m.setAccessible(true);
        return (ArrayList)(m.invoke(this.getClass().getSuperclass()));
    }

    protected double Bonus() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        return 1000*super.getNumClients();
    }

  public String toString()
  {
      String s ="Sales  Manager: "+employeeName+". Employees: ";
        for (Employee e: employees)
        {
            s+=e.getEmployeeName()+",";
        }
        s = s.substring(0,s.length()-1)+". Clients:";
        s+=super.clientString();
        return s;
    }

    @Override
    protected String getEmployeeName() {
        return employeeName;
    }

    protected void addEmployee(Employee e)
    {
        employees.add(e);
    }
}
