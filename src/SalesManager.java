import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Sales manager class
 * An employee who is responsible for managing other employees
 */
public class SalesManager extends Employee{
    //Name of the employee
    protected String employeeName;
    //List of employees managed by this manager
    private ArrayList<Employee> employees;
    //manager of this manager
    protected SalesManager manager;
    //Employee ID number
    protected long salesID;

    /**
     * Constructor for salesmanager
     * @param nm name of manager
     * @param ID ID number of manager
     */
    public  SalesManager(String nm, long ID)
    {
        employeeName = nm;
        salesID = ID;
        employees = new ArrayList<Employee>();
    }

    /**
     * Accessor for manager
     * @return this employee's manager
     */
    protected SalesManager getManager()
    {
        return manager;
    }

    /**
     * Setter for manager
     * @param m the new manager of this employee
     */
    protected void setManager(SalesManager m)
    {
        manager = m;
    }

    /**
     * Calculate and return the bonus of this manager
     * @return 1000 * number of clients
     */
    protected double Bonus(){
        return 1000*super.getNumClients();
    }

    /**
     * To string method
     * @return string including name, managed employees, and clients
     */
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

    /**
     * Get the name of this employee
     * @return the employee's name
     */
    protected String getEmployeeName() {
        return employeeName;
    }

    /**
     * Add an employee to the list of employees
     * @param e the employee to add
     */
    protected void addEmployee(Employee e)
    {
        employees.add(e);
    }
}
