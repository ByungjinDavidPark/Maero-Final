package ppp.model;

/**
 * Project: Maero
 * Title: ppp.model.Customer
 * Description: This class will be inherited from its superclass and will have extra methods and properties.
 * Version 1.0
 * Created by Dylan on 27/09/2014.
 */
public class Customer extends User {

    private double totalFineAmount;
    //changed from time until we have a better data type
    private double entry;
    private double exit;
    private int numberOfBooksBorrowed;
    private int maxNumBorrowed = 5;

    public Customer(String firstName, String lastName, String password, String eamil, String address, String phoneNum, String usertypeStr, double totalFineAmount, double entry, double exit, int numberOfBooksBorrowed, int maxNumBorrowed)
    {
        super(firstName, lastName, password, eamil, address, phoneNum, usertypeStr);
        this.totalFineAmount = totalFineAmount;
        this.entry = entry;
        this.exit = exit;
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
        this.maxNumBorrowed = maxNumBorrowed;
    }

    public void totalLoginTime(){
        
    }

    public void validateCustomer(){

    }

    public void displayAccount(){


    }


}
