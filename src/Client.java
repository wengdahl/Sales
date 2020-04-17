public class Client {

    public  Client(String nm, int ID)
    {
        clientName = nm;
        clientID = ID;
    }

    protected int getClientID() {
        return clientID;
    }

    protected void setClientID(int clientID) {
        this.clientID = clientID;
    }

    protected String getClientName() {
        return clientName;
    }

    protected void setClientName(String clientName) {
        this.clientName = clientName;
    }

    private int clientID;
    private String clientName;

    protected Employee getEmp() {
        return emp;
    }

    protected void setEmp(Employee emp) {
        this.emp = emp;
    }

    private Employee emp;

    double totalSales(){
        return 0;
    }

    protected String getLabelString()
    {
        return clientName+" "+clientID;
    }

    public String toString(){
        String s = "Client: "+clientName+". Sales Employee: "+emp.getEmployeeName();
        return s;
    }

}
