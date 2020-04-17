public class Main {

    public static void main(String[] args){

        SalesManager sMS = new SalesManager("Sam", 3);
        SalesManager cMS = new SalesManager("Charlie", 4);
        SalesAssociate sAS = new SalesAssociate("Sven", 7);
        SalesAssociate sAA = new SalesAssociate("Alex", 20);

        Client cJ = new Client("Jo", 32);
        Client cR = new Client("Riley", 473);
        Client cP = new Client("Peyton", 555);
        Client cA = new Client("Avery", 654);
        Client cT = new Client("Taylor", 840);
        Client cRe = new Client("Remi", 912);

        sAS.setSalesManager(cMS);
        cMS.addEmployee(sAS);
        sAA.setSalesManager(sMS);
        sMS.addEmployee(sAA);

        sMS.addClient(cJ);
        sMS.addClient(cR);
        cMS.addClient(cA);
        sAS.addClient(cP);
        sAA.addClient(cT);
        sAA.addClient(cRe);

        cJ.setEmp(sMS);
        cR.setEmp(sMS);
        cA.setEmp(cMS);
        cP.setEmp(sAS);
        cT.setEmp(sAA);
        cRe.setEmp(sAA);




        System.out.println(sMS);
        System.out.println(cMS);
        System.out.println(sAS);
        System.out.println(sAA);
        System.out.println(cJ);
        System.out.println(cR);
        System.out.println(cP);
        System.out.println(cA);
        System.out.println(cT);
        System.out.println(cRe);
    }

}
