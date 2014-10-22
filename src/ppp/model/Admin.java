package ppp.model;



import javax.swing.*;

/**
 * Project:Maero
 * Class: ppp.model.Admin
 * Description: This class will be inherited from its superclass
 * and will have extra methods that can be used by admin.
 * Version: 1.0
 * Created by davidpark on 27/09/14.
 */
public class Admin extends User
{


    // default constructor


    public Admin(String firstName, String lastName, String password, String eamil, String address, String phoneNum, String usertypeStr)
    {
        super(firstName, lastName, password, eamil, address, phoneNum, usertypeStr);
    }




    // methods that belongs to ppp.model.Admin only.

    //method registerUser
    // -> registerAdmin, updateAdmin, deleteAdmin.... and for receptionist and customer

    public static void registerUser()
    {


    }


}
