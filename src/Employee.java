
import java.util.ArrayList;

/**
 * Employee class
 * Abstract class representing a sales employee with assigned clients
 */
public abstract class Employee {
    //Sorted list of clients
    private ArrayList<Client> myClients;

    /**
     * Constructor for employee
     */
    public Employee()
    {
        myClients = new ArrayList<Client>();
    }

    /**
     * Add a client to this employee's list of clients in the correct location
     * @param c the client to add
     * @return true if successful, false if failed
     */
    public boolean addClient(Client c)
    {
        for(int i = 0; i<myClients.size();i++)
        {
            Client curr = myClients.get(i);
            if(c.getClientID()<curr.getClientID())
            {
                myClients.add(i,c);
                return true;
            }else if(c.getClientID()==curr.getClientID()){
                return false;//ID duplicated, not possible to have clients share an ID
            }
        }
        return myClients.add(c);//If not found, place at the end
    }

    /**
     * Get the list of clients
     * @return the client arraylist
     */
    private ArrayList<Client> getClients()
    {
        return myClients;
    }

    /**
     * Abstract method, to get name of employee
     * @return employee name
     */
    protected abstract String getEmployeeName();

    /**
     * Provide the number of clients in the list
     * @return size of client arraylist
     */
    protected int getNumClients()
    {
        return myClients.size();
    }

    /**
     * Get the string representation of the client list
     * @return string including name and ID of all clients
     */
    protected String clientString()
    {
        String s = " ";
        for(int i = 0; i<myClients.size();i++)
        {
            s+=myClients.get(i).getLabelString()+", ";
        }
        return s.substring(0,s.length()-1);
    }
}
