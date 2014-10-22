/*
 * Created by JFormDesigner on Wed Oct 15 15:54:30 NZDT 2014
 */

package ppp.ui;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
import ppp.Tester;
import ppp.Tester2;
import ppp.model.Book;
import ppp.model.RegisteringUserClassToDB;
import ppp.model.User;
import ppp.ui.GUI;
import ppp.ui.Login;

/**
 * @author David Park
 */
public class Admin1 extends JFrame {

    private User currentEntry;
    private RegisteringUserClassToDB personQueries;
    private List<User> results;
    private int numberOfEntriesUser = 0;
    private int currentEntryIndexUser;

    private Book currentEntry1;
    private RegisteringUserClassToDB bookQueries;
    private List<Book> results1;
    private int numberOfEntriesBook = 0;
    private int currentEntryIndexBook;


    public Admin1() {
        initComponents();
        personQueries = new RegisteringUserClassToDB();
        bookQueries = new RegisteringUserClassToDB();





    }


    private void logOutbuttonActionPerformed(ActionEvent e) {
        // TODO add your code here

        Login newLogin = new Login();
        newLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newLogin.setSize(700,600);
        newLogin.setVisible(true);




    }

    private void searchUserButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        results =
                personQueries.getPeopleByLastName(searchUserTextField1.getText());
        numberOfEntriesUser = results.size();

        if (numberOfEntriesUser != 0)
        {
            currentEntryIndexUser = 0;
            currentEntry = results.get(currentEntryIndexUser);
            userEntryfNameText.setText(currentEntry.getFirstName());
            userEntrylNameText.setText(currentEntry.getLastName());
            passwordField1.setText(currentEntry.getPassword());
            userEntryPhoneText.setText(currentEntry.getPhoneNum());
            userEntryPhone.setText(currentEntry.getPhoneNum());
            userEntryAdressText.setText(currentEntry.getAddress());
            userEntryUserTypeCom.setSelectedItem(currentEntry.getUsertypeStr());
            currentUserIndex.setText("" + (currentEntryIndexUser + 1));
            nextUserbutton.setEnabled(true);
            previousUserButton.setEnabled(true);
        } else
        {
            JOptionPane.showMessageDialog(this, "Sorry, No User has been searched by using keyword",
                    "No user", JOptionPane.PLAIN_MESSAGE);
        }

    }

    private void searchUserButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        results =
                personQueries.getPeopleByEmail(searchUserTextField2.getText());
        numberOfEntriesUser = results.size();

        if (numberOfEntriesUser != 0)
        {
            currentEntryIndexUser = 0;
            currentEntry = results.get(currentEntryIndexUser);
            userEntryfNameText.setText(currentEntry.getFirstName());
            userEntrylNameText.setText(currentEntry.getLastName());
            passwordField1.setText(currentEntry.getPassword());
            userEntryPhoneText.setText(currentEntry.getPhoneNum());
            userEntryAdressText.setText(currentEntry.getAddress());
            userEntryUserTypeCom.setSelectedItem(currentEntry.getUsertypeStr());
            currentUserIndex.setText("" + (currentEntryIndexUser + 1));
            nextUserbutton.setEnabled(true);
            previousUserButton.setEnabled(true);
        } else
        {
            JOptionPane.showMessageDialog(this, "Sorry, No User has been searched by using keyword",
                    "No user", JOptionPane.PLAIN_MESSAGE);
        }


    }



    private void previousUserButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        currentEntryIndexUser--;

        if (currentEntryIndexUser < 0)
            currentEntryIndexUser = numberOfEntriesUser - 1;

        currentUserIndex.setText("" + (currentEntryIndexUser + 1));
        currentUserIndexActionPerformed(e);



    }

    private void nextUserbuttonActionPerformed(ActionEvent e) {
        // TODO add your code here
        {
            currentEntryIndexUser++;

            if (currentEntryIndexUser >= numberOfEntriesUser)
                currentEntryIndexUser = 0;

            currentUserIndex.setText("" + (currentEntryIndexUser + 1));
            currentUserIndexActionPerformed(e);
        }

    }

    private void addUserButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        int results = personQueries.addUser(userEntryfNameText.getText(),
                userEntrylNameText.getText(),
                String.valueOf(passwordField1.getPassword()),
                userEntryPhoneText.getText(),
                userEntryEmailText.getText(),
                userEntryAdressText.getText(),
                String.valueOf(userEntryUserTypeCom.getSelectedItem())


        );


        if (results == 1)
            JOptionPane.showMessageDialog(this, "Person added!",
                    "Person added", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Person not added!",
                    "Error", JOptionPane.PLAIN_MESSAGE);

        browseButtonActionPerformed( e );



    }



    private void modifyUserButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        System.out.printf("%s,%s,%s,%s,%s,%s,%s",
                userEntryfNameText.getText(),
                userEntrylNameText.getText(),
                String.valueOf(passwordField1.getPassword()),
                userEntryPhoneText.getText(),
                userEntryEmailText.getText(),
                userEntryAdressText.getText(),
                String.valueOf(userEntryUserTypeCom.getSelectedItem()));
    }

    private void deleteUserButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }private void browseButtonActionPerformed(ActionEvent e)
    {
    }

    private void searchTitleButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        results1 =
                bookQueries.getBookByTitle(searchTitleField.getText());
        numberOfEntriesBook = results1.size();

        if (numberOfEntriesBook != 0)
        {
            currentEntryIndexBook = 0;
            currentEntry1 = results1.get(currentEntryIndexBook);
            bookEntryTitleText.setText(currentEntry1.getTitle());
            bookEntryAuthorText.setText(currentEntry1.getAuthor());
            bookEntryISBNText.setText(currentEntry1.getIsbn());
            bookEntryPublicText.setText(currentEntry1.getPublication());
            bookEntrySubjectCom.setSelectedIndex(currentEntry1.getSubjectId());
            bookEntryGenreCom.setSelectedIndex(currentEntry1.getGenreID());
            bookEntryPdateText.setText(currentEntry1.getPurchaseDate());
            bookEntryShopnameText.setText(currentEntry1.getShopName());
            bookEntryPriceText.setText(String.valueOf(currentEntry1.getPrice()));
            bookEntryDetailText.setText(currentEntry1.getDetail());
            bookEntryStatusCom.setSelectedItem(currentEntry1.getStatus());
            currentBookIndex.setText("" + (currentEntryIndexBook + 1));
            nextBookButton.setEnabled(true);
            previousBookButton.setEnabled(true);
        } else
        {
            JOptionPane.showMessageDialog(this, "Sorry, No Book has been searched by using keyword",
                    "No Book", JOptionPane.PLAIN_MESSAGE);
        }


    }

    private void searchAuthorButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        results1 =
                bookQueries.getBookByAuthor(searchAuthorField.getText());
        numberOfEntriesBook = results1.size();

        if (numberOfEntriesBook != 0)
        {
            currentEntryIndexBook = 0;
            currentEntry1 = results1.get(currentEntryIndexBook);
            bookEntryTitleText.setText(currentEntry1.getTitle());
            bookEntryAuthorText.setText(currentEntry1.getAuthor());
            bookEntryISBNText.setText(currentEntry1.getIsbn());
            bookEntryPublicText.setText(currentEntry1.getPublication());
            bookEntrySubjectCom.setSelectedIndex(currentEntry1.getSubjectId());
            bookEntryGenreCom.setSelectedIndex(currentEntry1.getGenreID());
            bookEntryPdateText.setText(currentEntry1.getPurchaseDate());
            bookEntryShopnameText.setText(currentEntry1.getShopName());
            bookEntryPriceText.setText(String.valueOf(currentEntry1.getPrice()));
            bookEntryDetailText.setText(currentEntry1.getDetail());
            bookEntryStatusCom.setSelectedItem(currentEntry1.getStatus());
            currentBookIndex.setText("" + (currentEntryIndexBook + 1));
            nextBookButton.setEnabled(true);
            previousBookButton.setEnabled(true);
        } else
        {
            JOptionPane.showMessageDialog(this, "Sorry, No Book has been searched by using keyword",
                    "No Book", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private void previousBookButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        currentEntryIndexBook--;

        if (currentEntryIndexBook < 0)
            currentEntryIndexBook = numberOfEntriesBook - 1;

        currentBookIndex.setText("" + (currentEntryIndexBook + 1));
        currentBookIndexActionPerformed(e);
    }

    private void nextBookButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        currentEntryIndexBook++;

        if (currentEntryIndexBook >= numberOfEntriesBook)
            currentEntryIndexBook = 0;

        currentBookIndex.setText("" + (currentEntryIndexBook + 1));
        currentUserIndexActionPerformed(e);



    }

    private void addBookButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        int result1 = bookQueries.addBook(bookEntryTitleText.getText(),
                bookEntryAuthorText.getText(),
                bookEntryISBNText.getText(),
                bookEntryPublicText.getText(),
                bookEntrySubjectCom.getSelectedIndex(),
                bookEntryGenreCom.getSelectedIndex(),
                bookEntryPdateText.getText(),
                bookEntryShopnameText.getText().toLowerCase(),
                Double.parseDouble(bookEntryPriceText.getText()),
                bookEntryDetailText.getText(),
                String.valueOf(bookEntryStatusCom.getSelectedItem())
        );

        if (result1 == 1)
        {
            JOptionPane.showMessageDialog(this, "Book added!",
                    "Person added", JOptionPane.PLAIN_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(this, "Book is not added!",
                    "Error", JOptionPane.PLAIN_MESSAGE);
        }

    }

    private void modifyBookButtonActionPerformed(ActionEvent e) {
        // TODO add your code here

    }

    private void deleteBookButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        
    }

    private void generateLendingButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void generateFineButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void generatePurchaseButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void currentUserIndexActionPerformed(ActionEvent e) {
        // TODO add your code here
        currentEntryIndexUser = (Integer.parseInt(currentUserIndex.getText()) - 1);

        if (numberOfEntriesUser != 0 && currentEntryIndexUser < numberOfEntriesUser)
        {
            currentEntry = results.get(currentEntryIndexUser);
            userEntryfNameText.setText(currentEntry.getFirstName());
            userEntrylNameText.setText(currentEntry.getLastName());
            passwordField1.setText(currentEntry.getPassword());
            userEntryPhoneText.setText(currentEntry.getPhoneNum());
            userEntryPhone.setText(currentEntry.getPhoneNum());
            userEntryAdressText.setText(currentEntry.getAddress());
            userEntryUserTypeCom.setSelectedItem(currentEntry.getUsertypeStr());
            maxIndexUser.setText("" + numberOfEntriesUser);
            currentUserIndex.setText("" + (currentEntryIndexUser + 1));
        }

    }

    private void currentBookIndexActionPerformed(ActionEvent e) {
        // TODO add your code here
        currentEntryIndexBook = (Integer.parseInt(currentBookIndex.getText()) - 1);

        if (numberOfEntriesBook != 0 && currentEntryIndexBook < numberOfEntriesBook)
        {
            currentEntry1 = results1.get(currentEntryIndexBook);
            bookEntryTitleText.setText(currentEntry1.getTitle());
            bookEntryAuthorText.setText(currentEntry1.getAuthor());
            bookEntryISBNText.setText(currentEntry1.getIsbn());
            bookEntryPublicText.setText(currentEntry1.getPublication());
            bookEntrySubjectCom.setSelectedIndex(currentEntry1.getSubjectId());
            bookEntryGenreCom.setSelectedIndex(currentEntry1.getGenreID());
            bookEntryPdateText.setText(currentEntry1.getPurchaseDate());
            bookEntryShopnameText.setText(currentEntry1.getShopName());
            bookEntryPriceText.setText(String.valueOf(currentEntry1.getPrice()));
            bookEntryDetailText.setText(currentEntry1.getDetail());
            bookEntryStatusCom.setSelectedItem(currentEntry1.getStatus());
            maxIndexBook.setText("" + numberOfEntriesBook);
            currentBookIndex.setText("" + (currentEntryIndexBook + 1));
        }

    }

    private void thisWindowClosed(WindowEvent e) {
        // TODO add your code here

        Login newLogin = new Login();
        newLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newLogin.setSize(700,600);
        newLogin.setVisible(true);


    }

    private void thisWindowClosing(WindowEvent e) {









    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - David Park
        bannerPanel = new JPanel();
        logOutbutton = new JButton();
        bannerLabel = new JLabel();
        bannerTextField = new JFormattedTextField();
        mainPanel = new JTabbedPane();
        userTapPanel = new JPanel();
        searchUserPanel = new JPanel();
        searchUserLabel1 = new JLabel();
        searchUserTextField1 = new JTextField();
        searchUserButton1 = new JButton();
        searchUserLabel2 = new JLabel();
        searchUserTextField2 = new JTextField();
        searchUserButton2 = new JButton();
        userEntryPanel = new JPanel();
        userEntryfName = new JLabel();
        userEntryfNameText = new JTextField();
        userEntrylname = new JLabel();
        userEntrylNameText = new JTextField();
        userEntryPwd = new JLabel();
        passwordField1 = new JPasswordField();
        userEntryPhone = new JLabel();
        userEntryPhoneText = new JTextField();
        userEntryEmai = new JLabel();
        userEntryEmailText = new JTextField();
        userEntryAdress = new JLabel();
        userEntryAdressText = new JTextField();
        userEntryUserType = new JLabel();
        userEntryUserTypeCom = new JComboBox();
        navigationUserPanel = new JPanel();
        previousUserButton = new JButton();
        currentUserIndex = new JTextField();
        ofLabelUser = new JLabel();
        maxIndexUser = new JTextField();
        nextUserbutton = new JButton();
        modifyUserButton = new JButton();
        deleteUserButton = new JButton();
        addUserButton = new JButton();
        bookTapPane = new JPanel();
        searchBookPanel = new JPanel();
        searchTitle = new JLabel();
        searchTitleField = new JTextField();
        searchTitleButton = new JButton();
        searchAuthor = new JLabel();
        searchAuthorField = new JTextField();
        searchAuthorButton = new JButton();
        bookEntryPanel = new JPanel();
        bookEntryTitle = new JLabel();
        bookEntryTitleText = new JTextField();
        bookEntryAuthoer = new JLabel();
        bookEntryAuthorText = new JTextField();
        bookEntryISBN = new JLabel();
        bookEntryISBNText = new JTextField();
        bookEntryPublic = new JLabel();
        bookEntryPublicText = new JTextField();
        bookEntrySubject = new JLabel();
        bookEntrySubjectCom = new JComboBox();
        bookEntryGenre = new JLabel();
        bookEntryGenreCom = new JComboBox();
        bookEntryPdate = new JLabel();
        bookEntryPdateText = new JTextField();
        bookEntryShopname = new JLabel();
        bookEntryShopnameText = new JTextField();
        bookEntryPrice = new JLabel();
        bookEntryPriceText = new JTextField();
        bookEntryDetail = new JLabel();
        bookEntryDetailText = new JTextField();
        bookEntryStatus = new JLabel();
        bookEntryStatusCom = new JComboBox();
        navigationBookPane = new JPanel();
        previousBookButton = new JButton();
        currentBookIndex = new JTextField();
        bookOflabel = new JLabel();
        maxIndexBook = new JTextField();
        nextBookButton = new JButton();
        addBookButton = new JButton();
        modifyBookButton = new JButton();
        deleteBookButton = new JButton();
        rePortPanel = new JPanel();
        reportPanel = new JPanel();
        bookLendingLabel = new JLabel();
        fineReportLabel = new JLabel();
        lendingCombo = new JComboBox();
        findCombo = new JComboBox();
        generateLendingButton = new JButton();
        generateFineButton = new JButton();
        bookPurchasedLabel = new JLabel();
        bookPurchasedCom = new JComboBox();
        generatePurchaseButton = new JButton();

        //======== this ========
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                thisWindowClosed(e);
            }
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== bannerPanel ========
        {
            bannerPanel.setBorder(new EmptyBorder(12, 12, 12, 12));

            // JFormDesigner evaluation mark
            bannerPanel.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), bannerPanel.getBorder())); bannerPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            bannerPanel.setLayout(null);

            //---- logOutbutton ----
            logOutbutton.setText("LogOut");
            logOutbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    logOutbuttonActionPerformed(e);
                }
            });
            bannerPanel.add(logOutbutton);
            logOutbutton.setBounds(new Rectangle(new Point(95, 20), logOutbutton.getPreferredSize()));

            //---- bannerLabel ----
            bannerLabel.setText("text");
            bannerPanel.add(bannerLabel);
            bannerLabel.setBounds(215, 5, 470, 65);
            bannerPanel.add(bannerTextField);
            bannerTextField.setBounds(-5, 0, 95, 70);

            { // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < bannerPanel.getComponentCount(); i++) {
                    Rectangle bounds = bannerPanel.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = bannerPanel.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                bannerPanel.setMinimumSize(preferredSize);
                bannerPanel.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(bannerPanel);
        bannerPanel.setBounds(80, 10, 713, 75);

        //======== mainPanel ========
        {

            //======== userTapPanel ========
            {
                userTapPanel.setLayout(null);

                //======== searchUserPanel ========
                {
                    searchUserPanel.setBorder(new TitledBorder("Search User by Keyword"));
                    searchUserPanel.setLayout(new GridLayout(2, 3, 1, 3));

                    //---- searchUserLabel1 ----
                    searchUserLabel1.setText("LastName");
                    searchUserLabel1.setHorizontalAlignment(SwingConstants.CENTER);
                    searchUserPanel.add(searchUserLabel1);

                    //---- searchUserTextField1 ----
                    searchUserTextField1.setHorizontalAlignment(SwingConstants.LEFT);
                    searchUserPanel.add(searchUserTextField1);

                    //---- searchUserButton1 ----
                    searchUserButton1.setText("Search");
                    searchUserButton1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            searchUserButton1ActionPerformed(e);
                        }
                    });
                    searchUserPanel.add(searchUserButton1);

                    //---- searchUserLabel2 ----
                    searchUserLabel2.setText("Email");
                    searchUserLabel2.setHorizontalAlignment(SwingConstants.CENTER);
                    searchUserPanel.add(searchUserLabel2);

                    //---- searchUserTextField2 ----
                    searchUserTextField2.setHorizontalAlignment(SwingConstants.LEFT);
                    searchUserPanel.add(searchUserTextField2);

                    //---- searchUserButton2 ----
                    searchUserButton2.setText("Search");
                    searchUserButton2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            searchUserButton2ActionPerformed(e);
                        }
                    });
                    searchUserPanel.add(searchUserButton2);
                }
                userTapPanel.add(searchUserPanel);
                searchUserPanel.setBounds(30, 15, 780, 130);

                //======== userEntryPanel ========
                {
                    userEntryPanel.setBorder(new TitledBorder("Entry"));
                    userEntryPanel.setLayout(new GridLayout(7, 4));

                    //---- userEntryfName ----
                    userEntryfName.setText("FirstName");
                    userEntryfName.setHorizontalAlignment(SwingConstants.CENTER);
                    userEntryPanel.add(userEntryfName);
                    userEntryPanel.add(userEntryfNameText);

                    //---- userEntrylname ----
                    userEntrylname.setText("LasrName");
                    userEntrylname.setHorizontalAlignment(SwingConstants.CENTER);
                    userEntryPanel.add(userEntrylname);
                    userEntryPanel.add(userEntrylNameText);

                    //---- userEntryPwd ----
                    userEntryPwd.setText("Password");
                    userEntryPwd.setHorizontalAlignment(SwingConstants.CENTER);
                    userEntryPanel.add(userEntryPwd);
                    userEntryPanel.add(passwordField1);

                    //---- userEntryPhone ----
                    userEntryPhone.setText("PhoneNumber");
                    userEntryPhone.setHorizontalAlignment(SwingConstants.CENTER);
                    userEntryPanel.add(userEntryPhone);
                    userEntryPanel.add(userEntryPhoneText);

                    //---- userEntryEmai ----
                    userEntryEmai.setText("Email");
                    userEntryEmai.setHorizontalAlignment(SwingConstants.CENTER);
                    userEntryPanel.add(userEntryEmai);
                    userEntryPanel.add(userEntryEmailText);

                    //---- userEntryAdress ----
                    userEntryAdress.setText("Adress");
                    userEntryAdress.setHorizontalAlignment(SwingConstants.CENTER);
                    userEntryPanel.add(userEntryAdress);
                    userEntryPanel.add(userEntryAdressText);

                    //---- userEntryUserType ----
                    userEntryUserType.setText("User Type");
                    userEntryUserType.setHorizontalAlignment(SwingConstants.CENTER);
                    userEntryPanel.add(userEntryUserType);

                    //---- userEntryUserTypeCom ----
                    userEntryUserTypeCom.setModel(new DefaultComboBoxModel(new String[] {
                        "Admin",
                        "Receptionist",
                        "Customer"
                    }));
                    userEntryPanel.add(userEntryUserTypeCom);
                }
                userTapPanel.add(userEntryPanel);
                userEntryPanel.setBounds(30, 160, 785, 265);

                //======== navigationUserPanel ========
                {
                    navigationUserPanel.setLayout(new FlowLayout());

                    //---- previousUserButton ----
                    previousUserButton.setText("Previous");
                    previousUserButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            previousUserButtonActionPerformed(e);
                        }
                    });
                    navigationUserPanel.add(previousUserButton);

                    //---- currentUserIndex ----
                    currentUserIndex.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            currentUserIndexActionPerformed(e);
                        }
                    });
                    navigationUserPanel.add(currentUserIndex);

                    //---- ofLabelUser ----
                    ofLabelUser.setText("of");
                    navigationUserPanel.add(ofLabelUser);
                    navigationUserPanel.add(maxIndexUser);

                    //---- nextUserbutton ----
                    nextUserbutton.setText("Next");
                    nextUserbutton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            nextUserbuttonActionPerformed(e);
                        }
                    });
                    navigationUserPanel.add(nextUserbutton);
                }
                userTapPanel.add(navigationUserPanel);
                navigationUserPanel.setBounds(205, 425, 415, 50);

                //---- modifyUserButton ----
                modifyUserButton.setText("Modify User");
                modifyUserButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        modifyUserButtonActionPerformed(e);
                    }
                });
                userTapPanel.add(modifyUserButton);
                modifyUserButton.setBounds(355, 475, 140, 30);

                //---- deleteUserButton ----
                deleteUserButton.setText("Delete User");
                deleteUserButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        deleteUserButtonActionPerformed(e);
                    }
                });
                userTapPanel.add(deleteUserButton);
                deleteUserButton.setBounds(560, 475, 140, 30);

                //---- addUserButton ----
                addUserButton.setText("Add User");
                addUserButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        addUserButtonActionPerformed(e);
                    }
                });
                userTapPanel.add(addUserButton);
                addUserButton.setBounds(130, 475, 140, 30);
            }
            mainPanel.addTab("User Management", userTapPanel);

            //======== bookTapPane ========
            {
                bookTapPane.setLayout(null);

                //======== searchBookPanel ========
                {
                    searchBookPanel.setBorder(new CompoundBorder(
                        new TitledBorder("Search Book by Keyword"),
                        Borders.DLU2));
                    searchBookPanel.setLayout(new GridLayout(2, 3));

                    //---- searchTitle ----
                    searchTitle.setText("Title");
                    searchTitle.setHorizontalAlignment(SwingConstants.CENTER);
                    searchBookPanel.add(searchTitle);

                    //---- searchTitleField ----
                    searchTitleField.setMaximumSize(new Dimension(120, 50));
                    searchBookPanel.add(searchTitleField);

                    //---- searchTitleButton ----
                    searchTitleButton.setText("Search");
                    searchTitleButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            searchTitleButtonActionPerformed(e);
                        }
                    });
                    searchBookPanel.add(searchTitleButton);

                    //---- searchAuthor ----
                    searchAuthor.setText("Author");
                    searchAuthor.setHorizontalAlignment(SwingConstants.CENTER);
                    searchBookPanel.add(searchAuthor);
                    searchBookPanel.add(searchAuthorField);

                    //---- searchAuthorButton ----
                    searchAuthorButton.setText("Search");
                    searchAuthorButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            searchAuthorButtonActionPerformed(e);
                        }
                    });
                    searchBookPanel.add(searchAuthorButton);
                }
                bookTapPane.add(searchBookPanel);
                searchBookPanel.setBounds(40, 15, 765, 140);

                //======== bookEntryPanel ========
                {
                    bookEntryPanel.setBorder(new CompoundBorder(
                        new TitledBorder("Entry"),
                        Borders.DLU2));
                    bookEntryPanel.setLayout(new GridLayout(6, 4, 2, 3));

                    //---- bookEntryTitle ----
                    bookEntryTitle.setText("Title");
                    bookEntryTitle.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryTitle);
                    bookEntryPanel.add(bookEntryTitleText);

                    //---- bookEntryAuthoer ----
                    bookEntryAuthoer.setText("Author");
                    bookEntryAuthoer.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryAuthoer);
                    bookEntryPanel.add(bookEntryAuthorText);

                    //---- bookEntryISBN ----
                    bookEntryISBN.setText("ISBN");
                    bookEntryISBN.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryISBN);
                    bookEntryPanel.add(bookEntryISBNText);

                    //---- bookEntryPublic ----
                    bookEntryPublic.setText("Publication");
                    bookEntryPublic.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryPublic);
                    bookEntryPanel.add(bookEntryPublicText);

                    //---- bookEntrySubject ----
                    bookEntrySubject.setText("Subject");
                    bookEntrySubject.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntrySubject);
                    bookEntryPanel.add(bookEntrySubjectCom);

                    //---- bookEntryGenre ----
                    bookEntryGenre.setText("Genre");
                    bookEntryGenre.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryGenre);

                    //---- bookEntryGenreCom ----
                    bookEntryGenreCom.setModel(new DefaultComboBoxModel(new String[] {
                        "Fiction",
                        "Non-Fiction"
                    }));
                    bookEntryPanel.add(bookEntryGenreCom);

                    //---- bookEntryPdate ----
                    bookEntryPdate.setText("Purchase Date");
                    bookEntryPdate.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryPdate);
                    bookEntryPanel.add(bookEntryPdateText);

                    //---- bookEntryShopname ----
                    bookEntryShopname.setText("Shop Name");
                    bookEntryShopname.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryShopname);
                    bookEntryPanel.add(bookEntryShopnameText);

                    //---- bookEntryPrice ----
                    bookEntryPrice.setText("Price");
                    bookEntryPrice.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryPrice);
                    bookEntryPanel.add(bookEntryPriceText);

                    //---- bookEntryDetail ----
                    bookEntryDetail.setText("Detail");
                    bookEntryDetail.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryDetail);
                    bookEntryPanel.add(bookEntryDetailText);

                    //---- bookEntryStatus ----
                    bookEntryStatus.setText("Status");
                    bookEntryStatus.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryStatus);

                    //---- bookEntryStatusCom ----
                    bookEntryStatusCom.setModel(new DefaultComboBoxModel(new String[] {
                        "Available",
                        "Borrowed",
                        "Lost",
                        "Damaged"
                    }));
                    bookEntryPanel.add(bookEntryStatusCom);
                }
                bookTapPane.add(bookEntryPanel);
                bookEntryPanel.setBounds(40, 165, 770, 270);

                //======== navigationBookPane ========
                {
                    navigationBookPane.setLayout(new FlowLayout());

                    //---- previousBookButton ----
                    previousBookButton.setText("Previous");
                    previousBookButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            previousBookButtonActionPerformed(e);
                        }
                    });
                    navigationBookPane.add(previousBookButton);

                    //---- currentBookIndex ----
                    currentBookIndex.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            currentBookIndexActionPerformed(e);
                        }
                    });
                    navigationBookPane.add(currentBookIndex);

                    //---- bookOflabel ----
                    bookOflabel.setText("of");
                    navigationBookPane.add(bookOflabel);
                    navigationBookPane.add(maxIndexBook);

                    //---- nextBookButton ----
                    nextBookButton.setText("Next");
                    nextBookButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            nextBookButtonActionPerformed(e);
                        }
                    });
                    navigationBookPane.add(nextBookButton);
                }
                bookTapPane.add(navigationBookPane);
                navigationBookPane.setBounds(270, 435, 325, 40);

                //---- addBookButton ----
                addBookButton.setText("Add Book");
                addBookButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        addBookButtonActionPerformed(e);
                    }
                });
                bookTapPane.add(addBookButton);
                addBookButton.setBounds(135, 480, 150, 30);

                //---- modifyBookButton ----
                modifyBookButton.setText("Modify Book");
                modifyBookButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        modifyBookButtonActionPerformed(e);
                    }
                });
                bookTapPane.add(modifyBookButton);
                modifyBookButton.setBounds(360, 480, 150, 30);

                //---- deleteBookButton ----
                deleteBookButton.setText("Delete Book");
                deleteBookButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        deleteBookButtonActionPerformed(e);
                    }
                });
                bookTapPane.add(deleteBookButton);
                deleteBookButton.setBounds(585, 480, 150, 30);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < bookTapPane.getComponentCount(); i++) {
                        Rectangle bounds = bookTapPane.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = bookTapPane.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    bookTapPane.setMinimumSize(preferredSize);
                    bookTapPane.setPreferredSize(preferredSize);
                }
            }
            mainPanel.addTab("Book Management", bookTapPane);

            //======== rePortPanel ========
            {
                rePortPanel.setLayout(new GridBagLayout());
                ((GridBagLayout)rePortPanel.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)rePortPanel.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)rePortPanel.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                ((GridBagLayout)rePortPanel.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //======== reportPanel ========
                {
                    reportPanel.setLayout(null);

                    //---- bookLendingLabel ----
                    bookLendingLabel.setText("Book Lending Report");
                    reportPanel.add(bookLendingLabel);
                    bookLendingLabel.setBounds(new Rectangle(new Point(170, 190), bookLendingLabel.getPreferredSize()));

                    //---- fineReportLabel ----
                    fineReportLabel.setText("Fine Report");
                    reportPanel.add(fineReportLabel);
                    fineReportLabel.setBounds(170, 240, 150, fineReportLabel.getPreferredSize().height);

                    //---- lendingCombo ----
                    lendingCombo.setModel(new DefaultComboBoxModel(new String[] {
                        "Daily",
                        "Monthly",
                        "Annually"
                    }));
                    reportPanel.add(lendingCombo);
                    lendingCombo.setBounds(330, 185, 125, lendingCombo.getPreferredSize().height);

                    //---- findCombo ----
                    findCombo.setModel(new DefaultComboBoxModel(new String[] {
                        "Book lost",
                        "Late return",
                        "User Fine"
                    }));
                    reportPanel.add(findCombo);
                    findCombo.setBounds(330, 235, 125, findCombo.getPreferredSize().height);

                    //---- generateLendingButton ----
                    generateLendingButton.setText("Generate Report");
                    generateLendingButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            generateLendingButtonActionPerformed(e);
                        }
                    });
                    reportPanel.add(generateLendingButton);
                    generateLendingButton.setBounds(new Rectangle(new Point(480, 180), generateLendingButton.getPreferredSize()));

                    //---- generateFineButton ----
                    generateFineButton.setText("Generate Report");
                    generateFineButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            generateFineButtonActionPerformed(e);
                        }
                    });
                    reportPanel.add(generateFineButton);
                    generateFineButton.setBounds(new Rectangle(new Point(480, 230), generateFineButton.getPreferredSize()));

                    //---- bookPurchasedLabel ----
                    bookPurchasedLabel.setText("Book Purchased Report");
                    reportPanel.add(bookPurchasedLabel);
                    bookPurchasedLabel.setBounds(new Rectangle(new Point(170, 290), bookPurchasedLabel.getPreferredSize()));

                    //---- bookPurchasedCom ----
                    bookPurchasedCom.setModel(new DefaultComboBoxModel(new String[] {
                        "By Shop",
                        "By Price",
                        "By Year(2014)",
                        "By Year(2013)"
                    }));
                    reportPanel.add(bookPurchasedCom);
                    bookPurchasedCom.setBounds(330, 285, 125, bookPurchasedCom.getPreferredSize().height);

                    //---- generatePurchaseButton ----
                    generatePurchaseButton.setText("Generate Report");
                    generatePurchaseButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            generatePurchaseButtonActionPerformed(e);
                        }
                    });
                    reportPanel.add(generatePurchaseButton);
                    generatePurchaseButton.setBounds(new Rectangle(new Point(480, 280), generatePurchaseButton.getPreferredSize()));

                    { // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < reportPanel.getComponentCount(); i++) {
                            Rectangle bounds = reportPanel.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = reportPanel.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        reportPanel.setMinimumSize(preferredSize);
                        reportPanel.setPreferredSize(preferredSize);
                    }
                }
                rePortPanel.add(reportPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            mainPanel.addTab("Report Generation", rePortPanel);
        }
        contentPane.add(mainPanel);
        mainPanel.setBounds(35, 95, 850, 550);

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
    private JPanel bannerPanel;
    private JButton logOutbutton;
    private JLabel bannerLabel;
    private JFormattedTextField bannerTextField;
    private JTabbedPane mainPanel;
    private JPanel userTapPanel;
    private JPanel searchUserPanel;
    private JLabel searchUserLabel1;
    private JTextField searchUserTextField1;
    private JButton searchUserButton1;
    private JLabel searchUserLabel2;
    private JTextField searchUserTextField2;
    private JButton searchUserButton2;
    private JPanel userEntryPanel;
    private JLabel userEntryfName;
    private JTextField userEntryfNameText;
    private JLabel userEntrylname;
    private JTextField userEntrylNameText;
    private JLabel userEntryPwd;
    private JPasswordField passwordField1;
    private JLabel userEntryPhone;
    private JTextField userEntryPhoneText;
    private JLabel userEntryEmai;
    private JTextField userEntryEmailText;
    private JLabel userEntryAdress;
    private JTextField userEntryAdressText;
    private JLabel userEntryUserType;
    private JComboBox userEntryUserTypeCom;
    private JPanel navigationUserPanel;
    private JButton previousUserButton;
    private JTextField currentUserIndex;
    private JLabel ofLabelUser;
    private JTextField maxIndexUser;
    private JButton nextUserbutton;
    private JButton modifyUserButton;
    private JButton deleteUserButton;
    private JButton addUserButton;
    private JPanel bookTapPane;
    private JPanel searchBookPanel;
    private JLabel searchTitle;
    private JTextField searchTitleField;
    private JButton searchTitleButton;
    private JLabel searchAuthor;
    private JTextField searchAuthorField;
    private JButton searchAuthorButton;
    private JPanel bookEntryPanel;
    private JLabel bookEntryTitle;
    private JTextField bookEntryTitleText;
    private JLabel bookEntryAuthoer;
    private JTextField bookEntryAuthorText;
    private JLabel bookEntryISBN;
    private JTextField bookEntryISBNText;
    private JLabel bookEntryPublic;
    private JTextField bookEntryPublicText;
    private JLabel bookEntrySubject;
    private JComboBox bookEntrySubjectCom;
    private JLabel bookEntryGenre;
    private JComboBox bookEntryGenreCom;
    private JLabel bookEntryPdate;
    private JTextField bookEntryPdateText;
    private JLabel bookEntryShopname;
    private JTextField bookEntryShopnameText;
    private JLabel bookEntryPrice;
    private JTextField bookEntryPriceText;
    private JLabel bookEntryDetail;
    private JTextField bookEntryDetailText;
    private JLabel bookEntryStatus;
    private JComboBox bookEntryStatusCom;
    private JPanel navigationBookPane;
    private JButton previousBookButton;
    private JTextField currentBookIndex;
    private JLabel bookOflabel;
    private JTextField maxIndexBook;
    private JButton nextBookButton;
    private JButton addBookButton;
    private JButton modifyBookButton;
    private JButton deleteBookButton;
    private JPanel rePortPanel;
    private JPanel reportPanel;
    private JLabel bookLendingLabel;
    private JLabel fineReportLabel;
    private JComboBox lendingCombo;
    private JComboBox findCombo;
    private JButton generateLendingButton;
    private JButton generateFineButton;
    private JLabel bookPurchasedLabel;
    private JComboBox bookPurchasedCom;
    private JButton generatePurchaseButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
