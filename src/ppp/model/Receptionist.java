package ppp.model;

/**
 * Project:Maero
 * Class: ppp.model.Receptionist
 * This class will be inherited from its superclass and
 * will have extra methods that can be used by receptionist and admin.
 * Version: 1.0
 * Created by davidpark on 27/09/14.
 */
public class Receptionist extends User
{

    public Receptionist(String firstName, String lastName, String password, String eamil, String address, String phoneNum, String usertypeStr)
    {
        super(firstName, lastName, password, eamil, address, phoneNum, usertypeStr);
    }

    public void registerCustomer()
    {

    }

    public void generateReport()
    {

    }
}
