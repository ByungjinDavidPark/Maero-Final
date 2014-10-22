package ppp.model;

/**
 * Created by davidpark on 12/10/14.
 */



import javax.swing.border.TitledBorder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


public class RegisteringUserClassToDB
{

    private static final String DATABASE_URL = "jdbc:mysql://localhost/maero";
    private static final String USER = "root";
    private static final String PASS = "password";

    private Connection connection = null;

    // preparedStatement for user management
    private PreparedStatement insertNewPerson = null;
    private PreparedStatement selectUserByLastName = null;
    private PreparedStatement selectUSerByEmail = null;
    private PreparedStatement selectAlluser = null;
    private PreparedStatement modifyUser = null;



    // preparedStatement for book management
    private PreparedStatement insertNewBook = null;
    private PreparedStatement selectBookByTitle = null;
    private PreparedStatement selectBookByAuthor = null;
    private PreparedStatement selectAllbook = null;
    private PreparedStatement modifyBook = null;


    public RegisteringUserClassToDB()

    {
            try
            {
                connection = DriverManager.getConnection(DATABASE_URL,USER,PASS);

                //Create qeury that selects all entries in DB
                selectAlluser = connection.prepareStatement("SELECT * FROM USERS");
                selectAllbook = connection.prepareStatement("SELECT * FROM BOOKS");

                // Create query that selects entries with a specific name
                selectUserByLastName = connection.prepareStatement("SELECT * FROM USERS WHERE LAST_NAME = ?" );
                selectUSerByEmail = connection.prepareStatement("SELECT * FROM USERS WHERE EMAIL = ?");

                selectBookByTitle = connection.prepareStatement("SELECT * FROM BOOKS WHERE TITLE = ?");
                selectBookByAuthor = connection.prepareStatement("SELECT * FROM BOOKS WHERE AUTHOR = ?");


                // Create insert that add a new entry

                insertNewPerson = connection.prepareStatement("INSERT INTO USERS" + "(FIRST_NAME, LAST_NAME, PASSWORD, EMAIL, ADDRESS,PHONE_NUMBER, USER_TYPE_NAME,TOTAL_FINE_AMOUNT)"
                        +"VALUES (?,?,?,?,?,?,?,0.0)");

                insertNewBook = connection.prepareStatement("INSERT INTO BOOKS" +"(TITLE,AUTHOR,ISBN,PUBLICAION,SUBJECT_ID,GENRE_ID,DATE_OF_PURCHASE,SHOP_NAME,PRICE,DETAILS,STATUS)"
                +"VALUES (?,?,?,?,?,?,?,?,?,?,?,)");


            }catch (SQLException sqlException)
            {
                sqlException.printStackTrace();
            System.exit(1);
        }
    }

    //fuctions for Users

    public List<User> getAlluser()
    {
        List<User> results = null;
        ResultSet resultSet = null;

        try
        {
            //executeQuery returns Resultset containig matching entries
            resultSet = selectAlluser.executeQuery();
            results = new ArrayList<User>();
            //"(FIRST_NAME, LAST_NAME, PASSWORD, EMAIL, ADDRESS,PHONE_NUMBER, USER_TYPE_NAME)"
            while (resultSet.next())
            {
                results.add(new User(
                        resultSet.getString("FIRST_NAME"),
                        resultSet.getString("LAST_NAME"),
                        resultSet.getString("PASSWORD"),
                        resultSet.getString("EMAIL"),
                        resultSet.getString("ADDRESS"),
                        resultSet.getString("PHONE_NUMBER"),
                        resultSet.getString("USER_TYPE_NAME")));
            }
        }
        catch ( SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        finally
        {
            try
            {
                resultSet.close();
            } catch (SQLException sqlException)
            {
                sqlException.printStackTrace();
                close();
            }
        }
        return  results;
    }

    public List<User> getPeopleByLastName(String LastName)
    {
        List<User> results = null;
        ResultSet resultSet = null;

        try
        {
            selectUserByLastName.setString(1, LastName);

            // executeQuery returns Resultset containig matching entries
            resultSet = selectUserByLastName.executeQuery();

            results = new ArrayList<User>();


            while (resultSet.next())
            {
                results.add(new User(
                        resultSet.getString("FIRST_NAME"),
                        resultSet.getString("LAST_NAME"),
                        resultSet.getString("PASSWORD"),
                        resultSet.getString("EMAIL"),
                        resultSet.getString("ADDRESS"),
                        resultSet.getString("PHONE_NUMBER"),
                        resultSet.getString("USER_TYPE_NAME")));
            }
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        finally
        {
            try
            {
                resultSet.close();
            }
            catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
                close();
            }
        }
        return results;
    }

    public List<User> getPeopleByEmail(String Email)
    {
        List<User> results = null;
        ResultSet resultSet = null;

        try
        {
            selectUSerByEmail.setString(1, Email);

            // executeQuery returns Resultset containig matching entries
            resultSet = selectUSerByEmail.executeQuery();

            results = new ArrayList<User>();

            while (resultSet.next())
            {
                results.add(new User(
                        resultSet.getString("FIRST_NAME"),
                        resultSet.getString("LAST_NAME"),
                        resultSet.getString("PASSWORD"),
                        resultSet.getString("EMAIL"),
                        resultSet.getString("ADDRESS"),
                        resultSet.getString("PHONE_NUMBER"),
                        resultSet.getString("USER_TYPE_NAME")));
            }
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        finally
        {
            try
            {
                resultSet.close();
            }
            catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
                close();
            }
        }
        return results;
    }

    public int addUser(String firstName, String lastName, String password, String eamil, String address, String phoneNum, String usertypeStr)

    {
        int results = 0;

        try
        {
            insertNewPerson.setString(1, firstName);
            insertNewPerson.setString(2, lastName);
            insertNewPerson.setString(3, password);
            insertNewPerson.setString(4, eamil);
            insertNewPerson.setString(5, address);
            insertNewPerson.setString(6, phoneNum);
            insertNewPerson.setString(7,usertypeStr);

            results = insertNewPerson.executeUpdate();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            close();
        }

        return results;
    }



    // methods for book

    public List<Book> getAllbook()
    {
        List<Book> results = null;
        ResultSet resultSet = null;

        try
        {
            //executeQuery returns Resultset containig matching entries
            resultSet = selectAllbook.executeQuery();
            results = new ArrayList<Book>();

            while (resultSet.next())
            {
                results.add(new Book(
                        resultSet.getString("TITLE"),
                        resultSet.getString("AUTHOR"),
                        resultSet.getString("ISBN"),
                        resultSet.getString("PUBLICATION"),
                        resultSet.getInt("SUBJECT_ID"),
                        resultSet.getInt("GENRE_ID"),
                        resultSet.getString("DATE_OF_PURCHASE"),
                        resultSet.getString("SHOP_NAME"),
                        resultSet.getDouble("PRICE"),
                        resultSet.getString("DETAILS"),
                        resultSet.getString("STATUS")));

            }
        } catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        } finally
        {
            try
            {
                resultSet.close();
            } catch (SQLException sqlException)
            {
                sqlException.printStackTrace();
                close();
            }
        }
        return results;
    }

    public List<Book> getBookByTitle(String title)
    {
        List<Book> results = null;
        ResultSet resultSet = null;

        try
        {
            selectBookByTitle.setString(1, title);

            // executeQuery returns Resultset containig matching entries
            resultSet = selectBookByTitle.executeQuery();

            results = new ArrayList<Book>();


            while (resultSet.next())
            {
                results.add(new Book(
                        resultSet.getString("TITLE"),
                        resultSet.getString("AUTHOR"),
                        resultSet.getString("ISBN"),
                        resultSet.getString("PUBLICATION"),
                        resultSet.getInt("SUBJECT_ID"),
                        resultSet.getInt("GENRE_ID"),
                        resultSet.getString("DATE_OF_PURCHASE"),
                        resultSet.getString("SHOP_NAME"),
                        resultSet.getDouble("PRICE"),
                        resultSet.getString("DETAILS"),
                        resultSet.getString("STATUS")));
            }
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        finally
        {
            try
            {
                resultSet.close();
            }
            catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
                close();
            }
        }
        return results;
    }

    public List<Book> getBookByAuthor(String author)
    {
        List<Book> results = null;
        ResultSet resultSet = null;

        try
        {
            selectBookByAuthor.setString(1, author);

            // executeQuery returns Resultset containig matching entries
            resultSet = selectBookByAuthor.executeQuery();

            results = new ArrayList<Book>();


            while (resultSet.next())
            {
                results.add(new Book(
                        resultSet.getString("TITLE"),
                        resultSet.getString("AUTHOR"),
                        resultSet.getString("ISBN"),
                        resultSet.getString("PUBLICATION"),
                        resultSet.getInt("SUBJECT_ID"),
                        resultSet.getInt("GENRE_ID"),
                        resultSet.getString("DATE_OF_PURCHASE"),
                        resultSet.getString("SHOP_NAME"),
                        resultSet.getDouble("PRICE"),
                        resultSet.getString("DETAILS"),
                        resultSet.getString("STATUS")));
            }
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        finally
        {
            try
            {
                resultSet.close();
            }
            catch(SQLException sqlException)
            {
                sqlException.printStackTrace();
                close();
            }
        }
        return results;
    }

    public int addBook(String title, String author, String isbn, String publication, int subjectId, int genreID, String purchaseDate, String shopName, Double price, String detail, String status)

    {
        int result1 = 0;

        try
        {
            insertNewBook.setString(1, title);
            insertNewBook.setString(2, author);
            insertNewBook.setString(3, isbn);
            insertNewBook.setString(4, publication);
            insertNewBook.setInt(5, subjectId);
            insertNewBook.setInt(6, genreID);
            insertNewBook.setString(7, purchaseDate);
            insertNewBook.setString(8, shopName);
            insertNewBook.setDouble(9, price);
            insertNewBook.setString(10, detail);
            insertNewBook.setString(11, status);



            result1 = insertNewBook.executeUpdate();


        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            close();
        }

        return result1;
    }

    public void close()
    {
        try
        {
            connection.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }


}
