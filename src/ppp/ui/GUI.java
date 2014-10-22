package ppp.ui;

import javax.swing.*;

/**
 * Created by davidpark on 21/10/14.
 */
public class GUI
{
    private static final String[] userTypeList = {"Admin","Receptionist","Customer"};
    private static final int ADMIN = 0;
    private static final int RECEPTIONIST = 1;
    private static final int CUSTOMER = 2;
    private static int userTypeint;

    public GUI()
    {

    }

    public GUI(String userType)
    {

        userTypeConverter(userType);
    }


    public static void start(int userInputNameInt)
    {

        switch (userInputNameInt)
        {
            case ADMIN:
                adminWindow();
                break;

            case RECEPTIONIST:
                recepWindow();
                break;

            case CUSTOMER:
                cusWindow();
                break;

            default:
                break;
        }

    }



    public static void adminWindow()
    {
        Admin1 adminGui = new Admin1();
        adminGui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        adminGui.setSize(900,900);
        adminGui.setVisible(true);

    }


    public static void recepWindow()
    {
        Receptionist1 receptionGUI = new Receptionist1();
        receptionGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        receptionGUI.setSize(900,900);
        receptionGUI.setVisible(true);

    }


    public static void cusWindow()
    {
        Customer1 customurGUI = new Customer1();
        customurGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        customurGUI.setSize(900,900);
        customurGUI.setVisible(true);

    }


    public void userTypeConverter(String userType)
    {
        for(String o:userTypeList)
        {
            if (o == "Admin")
                userTypeint = 0;
            else if (o == "Receptionist")
                userTypeint = 1;
            else if (o == "Customer")
                userTypeint = 2;

        }

    }
}
