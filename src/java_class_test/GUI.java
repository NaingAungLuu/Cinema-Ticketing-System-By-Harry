package java_class_test;

import java_class_test.Admin.Admin_Manage_Movies;
import java_class_test.Admin.Admin_Manage_Movies_Fragment;
import java_class_test.Admin.Admin_Menu_Fragment;
import java_class_test.Sales.Sales_Menu_Fragment;
import java_class_test.Sales.Sales_Tickets;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI{
    public static final int ADMIN_HOME = 1;
    public static final int ADMIN_MANAGE_MOVIES = 2;
    public static final int ADMIN_MANAGE_SEAT_PLAN = 3;
    public static final int ADMIN_MANAGE_USERS = 4;
    public static final int LOGIN = 5;
    public static final int SALES_MAIN = 6;
    public static final int SALES_TICKETS = 7;
    public static final int SALES_SEATS = 8;
    public static final int ADMIN_MANAGE_MOVIES_FRAGMENT = 9;

    static Dimension login_dim = new Dimension(500 , 400);
    static Dimension default_dim = new Dimension(1200 , 700);
    static JFrame window = new JFrame();
    static JButton btnLogOut = new JButton();
    static JPanel pnlFrag = new JPanel();
    static JPanel pnlframe = new JPanel();
    private static String UserName = "Default";
    private static String UserType = "DEFAULT";
    public static final String ADMIN = "ADMIN";
    public static final String STAFF = "STAFF";


    public static void setUser(String username ,String Usertype)
    {
        UserName = username;
        UserType = Usertype;
    }
    public static String getUserName()
    {
        return UserName;
    }
    public static String getUserType()
    {
        return UserType;
    }

    public static void show(int ID)
    {

        System.out.println(UserType);
        if(UserType.equals(STAFF))
        {
            pnlFrag.setLayout(null);
            pnlFrag.removeAll();
            pnlFrag.add(new Sales_Menu_Fragment());
            System.out.println("Staff panel attached");
            //pnlFrag.add(new Sales_Tickets());
        }

        switch(ID)
        {
            case LOGIN : pnlFrag

                    = new Login_Form();break;
            case SALES_TICKETS : pnlframe = new  Sales_Tickets();pnlFrag.add(pnlframe); break;
            case ADMIN_MANAGE_MOVIES_FRAGMENT : pnlframe = new Admin_Manage_Movies(); break;
            default: System.out.println("Error Occured");
        }
        //Make the JFrame visible
        prepareFrame(ID);
        window.setVisible(true);
    }

    private static void prepareFrame(int ID)
    {
        //Adds Log Out Button to the Frame
        btnLogOut.setText("Log Out");
        btnLogOut.setFont(new Font("Courier" , Font.PLAIN , 16));
        btnLogOut.setForeground(Color.WHITE);
        btnLogOut.setBorder(new LineBorder(Color.decode("#FF6767") , 2));
        btnLogOut.setBounds(1080 , 40 , 90, 40);
        btnLogOut.setHorizontalAlignment(SwingConstants.CENTER);
        btnLogOut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                btnLogOut.setBorder(null);
                btnLogOut.setContentAreaFilled(false);
                btnLogOut.setOpaque(true);
                btnLogOut.setBackground(Color.white);
                btnLogOut.setForeground(Color.decode("#FF6767"));
            }
        });
        btnLogOut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                btnLogOut.setContentAreaFilled(true);
                btnLogOut.setOpaque(false);
                btnLogOut.setBorder(new LineBorder(Color.decode("#FF6767") , 2));
                btnLogOut.setForeground(Color.decode("#FFFFFF"));
            }
        });


        btnLogOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainClass.Login();
            }
        });
//Add the Log Out Button to the JPanel
        pnlframe.add(btnLogOut);
        //Prepare JFrame for GUI presentation
        window.setSize(ID == LOGIN ? login_dim : default_dim);//JFrame size is set based on the View ID
        window.setLocation(450 , 300);
        window.setLocation(100, 100);
        window.setTitle("Cinema Ticket Booking System");
        window.setName("Cinema Ticket Booking System");
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setContentPane(pnlFrag);
    }

}
