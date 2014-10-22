package ppp.model;//Author: Luke Eskildsen
//Project: Maero
//Last Edited: 27/09/14
//Desc: ppp.model.BorrowBook class used to:
//get the os current Date and time, calculate difference between all borrowed book times and current date, 
//and alert users to fines according to user preference(all this on startup?).
//also called on checkout attempt by user? to validate user request and process checkout transaction

public class BorrowBook {
	
//initialize variables of class ppp.model.BorrowBook
private String userID;
private String bookID;
private String title;
private String email;
private String dateBorrowed;

//depending of method of set/get time implemented, this var type and value may change
private static final Double MAXDAYSBORROWED = 21.00;

//request name change to FINEAMOUNTPERDAY?
private static final Double FINEAMOUNT = 0.60;
	
	
	
//functions/methods of class ppp.model.BorrowBook
	//gets current date from os
	//getCurrentDate{
	//}//close getCurrentDate
	
	//compareDates{
	//}//close compareDates
	
	//calcFines{
	//}//close calcFines
	
	//notifyCustomer{
	//}//close notifyCustomer
	
	//checkoutBookRequest{
	//}//close checkoutBookRequest

}//close ppp.model.BorrowBook
