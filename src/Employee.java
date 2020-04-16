
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Employee {
        private ArrayList<Client> myClients;

        public Employee()
        {
            myClients = new ArrayList<Client>();
        }

        public boolean addClient(Client c)
        {
            for(int i = 0; i<myClients.size();i++)
            {
                Client curr = myClients.get(i);
                if(c.getClientID()>curr.getClientID())
                {
                    myClients.add(i,c);
                    return true;
                }else if(c.getClientID()==curr.getClientID()){
                    return false;//ID duplicated, not possible
                }
            }
            return myClients.add(c);//If not found, place at the end
        }
        private ArrayList<Client> getClients()
        {
            return myClients;
        }
}
