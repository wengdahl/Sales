public class Employee {
    import java.util.ArrayList;

    public abstract class Employee {
        private ArrayList<Client> myClients;

        public Employee()
        {
            myClients = new ArrayList<Client>();
        }

        public boolean addClient(Client c)
        {
            //Temp, must sort
            return myClients.add(c);
        }
        private ArrayList<Client> getClients()
        {
            return myClients;
        }
    }

}
