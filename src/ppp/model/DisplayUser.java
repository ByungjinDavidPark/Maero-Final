package ppp.model;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * Created by davidpark on 10/10/14.
 */
public class DisplayUser
{
    static final String DATABASE_URL = "jdbc:mysql://localhost/maero";
    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String args[])
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            // establish connection
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);

            // create Statement for querying database
            statement = connection.createStatement();

            // query database
            resultSet = statement.executeQuery("SELECT * FROM USERS");

            //process query results
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.println("All data of Users table Database: \n");

            for (int i = 1; i <= numberOfColumns; i++)
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            System.out.println();

            while (resultSet.next())
            {
                for (int i = 1; i <= numberOfColumns; i++)
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                System.out.println();
            }
        } catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                resultSet.close();
                statement.close();
                connection.close();
            }catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
    }

}
