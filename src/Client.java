public class Client {

    private int clientID;
    private String clientName;
    private Employee emp;

    public  Client(String nm, int ID)
    {
        clientName = nm;
        clientID = ID;
    }

    /*
    GETTERS----
     */
    protected int getClientID() {
        return clientID;
    }

    protected Employee getEmp() {
        return emp;
    }

    protected String getClientName() {
        return clientName;
    }

    protected String getLabelString()
    {
        return clientName+" "+clientID;
    }

    /*
    SETTERS-----
     */

    protected void setClientID(int clientID) {
        this.clientID = clientID;
    }

    protected void setClientName(String clientName) {
        this.clientName = clientName;
    }

    protected void setEmp(Employee emp) {
        this.emp = emp;
    }

    //start sales at 0
    double totalSales(){
        return 0;
    }

    public String toString(){
        String s = "Client: "+clientName+". Sales Employee: "+emp.getEmployeeName();
        return s;
    }

}
