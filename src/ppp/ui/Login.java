package ppp.ui;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
import com.sun.org.apache.xpath.internal.operations.Bool;
/*
 * Created by JFormDesigner on Sat Oct 18 11:48:11 NZDT 2014
 */



/**
 * @author unknown
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
    }
    String userInputName;
    String userInputPass;
    String dbUserName = "test";
    String dbPassword = "123";


    private void exampleFunctionActionPerformed() {
        textField2.setText("");
        passwordField2.setText("");
    }


    private void submitLoginButtonActionPerformed(ActionEvent e) {

       userInputName = textField2.getText();
       int userInputNameInt = 5;
       userInputNameInt = Integer.parseInt(userInputName);
       GUI.start(userInputNameInt);
       exampleFunctionActionPerformed();


//       userInputPass = String.valueOf(passwordField2.getPassword());

//        if (userInputName.equals(dbUserName) && userInputPass.equals(dbPassword)) {
//            JOptionPane.showMessageDialog(null,
//                    "Login successful.");
//
//        } else {
//            JOptionPane.showMessageDialog(null,
//                    "Incorrect username or password.",
//                    "Error",
//                    JOptionPane.ERROR_MESSAGE);
//            exampleFunctionActionPerformed();
//        }
    }

    public void userLoginSearch(Connection conn, String userInputName, String userInputPass) {
        Statement stmt = null;
        String userLoginQuery = "select USER_ID, EMAIL, PASSWORD from users where EMAIL = '" + userInputName + "' AND PASSWORD = '" + userInputPass + "' ";

        try{
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(userLoginQuery);

            while (rs.next()) {

                Integer activeUserID = (Integer) rs.getInt("USER_ID");
                String dbUserEmail = rs.getString("EMAIL");
                String dbPassword = rs.getString("PASSWORD");

                System.out.println(dbUserEmail + dbPassword);

            }
            rs.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - David Park
        panel1 = new JPanel();
        label1 = new JLabel();
        textField2 = new JTextField();
        label2 = new JLabel();
        passwordField2 = new JPasswordField();
        submitLoginButton = new JButton();
        panel4 = new JPanel();
        label3 = new JLabel();
        label4 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(new FormLayout(
                "267dlu",
                "5*(default, $lgap), default"));

            //---- label1 ----
            label1.setText("Email");
            panel1.add(label1, CC.xy(1, 1));
            panel1.add(textField2, CC.xy(1, 3));

            //---- label2 ----
            label2.setText("Password");
            panel1.add(label2, CC.xy(1, 5));
            panel1.add(passwordField2, CC.xy(1, 7));

            //---- submitLoginButton ----
            submitLoginButton.setText("Submit");
            submitLoginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    submitLoginButtonActionPerformed(e);
                }
            });
            panel1.add(submitLoginButton, CC.xy(1, 11));
        }
        contentPane.add(panel1);
        panel1.setBounds(80, 250, 530, 165);

        //======== panel4 ========
        {
            panel4.setLayout(new FormLayout(
                "223dlu",
                "default, $lgap, default"));

            //---- label3 ----
            label3.setText(" KIA ORA, WELCOME TO");
            label3.setFont(new Font("Myriad Arabic", Font.BOLD, 20));
            panel4.add(label3, CC.xy(1, 1));

            //---- label4 ----
            label4.setText("MAERO- LIBRARY SYSTEM");
            label4.setFont(new Font("Myriad Arabic", Font.BOLD, 20));
            panel4.add(label4, CC.xy(1, 3));
        }
        contentPane.add(panel4);
        panel4.setBounds(200, 115, 455, 110);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - David Park
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField2;
    private JLabel label2;
    private JPasswordField passwordField2;
    private JButton submitLoginButton;
    private JPanel panel4;
    private JLabel label3;
    private JLabel label4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
