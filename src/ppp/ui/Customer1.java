/*
 * Created by JFormDesigner on Tue Oct 21 10:29:34 NZDT 2014
 */

package ppp.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;
import ppp.ui.Login;

/**
 * @author David Park
 */
public class Customer1 extends JFrame {
    public Customer1() {
        initComponents();
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
    }

    private void searchUserButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void previousUserButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void currentUserIndexActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void nextUserbuttonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void modifyUserButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void deleteUserButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void addUserButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void searchTitleButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void searchAuthorButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void previousBookButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void currentBookIndexActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void nextBookButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void addBookButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
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

    private void thisWindowClosed(WindowEvent e) {
        // TODO add your code here
        Login newLogin = new Login();
        newLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newLogin.setSize(700,600);
        newLogin.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - David Park
        bannerPanel = new JPanel();
        logOutbutton = new JButton();
        bannerLabel = new JLabel();
        bannerTextField = new JFormattedTextField();
        mainPanel = new JTabbedPane();
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
        bookEntrySubject = new JLabel();
        bookEntryAuthoer = new JLabel();
        bookEntryISBN = new JLabel();
        bookEntryPublic = new JLabel();
        bookEntryGenre = new JLabel();
        bookEntryDetail = new JLabel();
        bookEntryStatus = new JLabel();
        textField1 = new JTextField();
        textField3 = new JTextField();
        textField2 = new JTextField();
        textField5 = new JTextField();
        textField4 = new JTextField();
        textField6 = new JTextField();
        textField7 = new JTextField();
        textField8 = new JTextField();
        navigationBookPane = new JPanel();
        previousBookButton = new JButton();
        currentBookIndex = new JTextField();
        bookOflabel = new JLabel();
        maxIndexBook = new JTextField();
        nextBookButton = new JButton();
        addBookButton = new JButton();
        modifyBookButton = new JButton();
        rePortPanel = new JPanel();
        reportPanel = new JPanel();
        generateFineButton = new JButton();

        //======== this ========
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                thisWindowClosed(e);
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
                        new TitledBorder("Search Result"),
                        Borders.DLU2));
                    bookEntryPanel.setLayout(new GridLayout(2, 8, 2, 3));

                    //---- bookEntryTitle ----
                    bookEntryTitle.setText("Title");
                    bookEntryTitle.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryTitle);

                    //---- bookEntrySubject ----
                    bookEntrySubject.setText("Subject");
                    bookEntrySubject.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntrySubject);

                    //---- bookEntryAuthoer ----
                    bookEntryAuthoer.setText("Author");
                    bookEntryAuthoer.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryAuthoer);

                    //---- bookEntryISBN ----
                    bookEntryISBN.setText("ISBN");
                    bookEntryISBN.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryISBN);

                    //---- bookEntryPublic ----
                    bookEntryPublic.setText("Publication");
                    bookEntryPublic.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryPublic);

                    //---- bookEntryGenre ----
                    bookEntryGenre.setText("Genre");
                    bookEntryGenre.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryGenre);

                    //---- bookEntryDetail ----
                    bookEntryDetail.setText("Detail");
                    bookEntryDetail.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryDetail);

                    //---- bookEntryStatus ----
                    bookEntryStatus.setText("Status");
                    bookEntryStatus.setHorizontalAlignment(SwingConstants.CENTER);
                    bookEntryPanel.add(bookEntryStatus);
                    bookEntryPanel.add(textField1);
                    bookEntryPanel.add(textField3);
                    bookEntryPanel.add(textField2);
                    bookEntryPanel.add(textField5);
                    bookEntryPanel.add(textField4);
                    bookEntryPanel.add(textField6);
                    bookEntryPanel.add(textField7);
                    bookEntryPanel.add(textField8);
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
                addBookButton.setText("Borrow Book");
                addBookButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        addBookButtonActionPerformed(e);
                    }
                });
                bookTapPane.add(addBookButton);
                addBookButton.setBounds(260, 480, 150, 30);

                //---- modifyBookButton ----
                modifyBookButton.setText("Request a Booking");
                modifyBookButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        modifyBookButtonActionPerformed(e);
                    }
                });
                bookTapPane.add(modifyBookButton);
                modifyBookButton.setBounds(455, 480, 150, 30);

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
            mainPanel.addTab("Search and Borrow Book", bookTapPane);

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
            mainPanel.addTab("Account Information", rePortPanel);
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
    private JLabel bookEntrySubject;
    private JLabel bookEntryAuthoer;
    private JLabel bookEntryISBN;
    private JLabel bookEntryPublic;
    private JLabel bookEntryGenre;
    private JLabel bookEntryDetail;
    private JLabel bookEntryStatus;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField2;
    private JTextField textField5;
    private JTextField textField4;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JPanel navigationBookPane;
    private JButton previousBookButton;
    private JTextField currentBookIndex;
    private JLabel bookOflabel;
    private JTextField maxIndexBook;
    private JButton nextBookButton;
    private JButton addBookButton;
    private JButton modifyBookButton;
    private JPanel rePortPanel;
    private JPanel reportPanel;
    private JButton generateFineButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
