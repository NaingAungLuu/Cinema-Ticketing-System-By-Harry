package java_class_test.Sales;

import java_class_test.Admin.Admin_Manage_Seat_Plan_Fragment;
import java_class_test.Admin.Admin_Menu_Fragment;
import java_class_test.GUI;

import javax.swing.*;
import java.awt.*;

public class Sales_Menu_Fragment extends JPanel{
    public static JFrame window = new JFrame("Admin");
    public static JButton btnLogOut = new JButton("Log Out");
    static JPanel SidePanel = new JPanel();
    static Admin_Menu_Fragment.ButtonHandler buttons = new Admin_Menu_Fragment.ButtonHandler();
    public static JButton btnTickets = new JButton("Tickets");
    public static JPanel content = new JPanel();

    public static void main(String[]args)
    {
        Sales_Menu_Fragment frmPlan = new Sales_Menu_Fragment();
        JPanel pnlmain = new JPanel();
        pnlmain.setLayout(null);
        pnlmain.setBackground(Color.black);
        //pnlmain.add(adHome.SidePanel);
        pnlmain.add(frmPlan);
        content.setLayout(null);
        window.setContentPane(pnlmain);
        content.setBackground(Color.decode("#242B40"));
        window.setSize(1200 , 700);
        window.setLocation(100, 100);
        window.setTitle("Cinema Ticket Booking System");
        window.setName("Cinema Ticket Booking System");
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public Sales_Menu_Fragment()
    {

        JLabel lblUser_name = new JLabel(GUI.getUserName());
        lblUser_name.setFont(new Font("Courier" ,Font.PLAIN , 20));
        lblUser_name.setForeground(Color.decode("#75CBE6"));
        lblUser_name.setHorizontalAlignment(JLabel.CENTER);
        JPanel pnlUserName = new JPanel();
        pnlUserName.setLayout(null);
        pnlUserName.setBounds(30 , 50 , 200, 50);
        pnlUserName.add(lblUser_name);
        pnlUserName.setBackground(Color.decode("#242B40"));
        lblUser_name.setBounds( 0, 0 , 250, 50);
        lblUser_name.setBounds( (lblUser_name.getWidth()/2)- (pnlUserName.getWidth()/2), 0 , 250, 50);

        //Cinema Name Label
        JLabel lblCinemaname = new JLabel("Galaxy");
        lblCinemaname.setForeground(Color.decode("#FF6767"));
        lblCinemaname.setBounds(1000 , 620 , 200 , 50);
        lblCinemaname.setFont(new Font("Rockwell" , Font.PLAIN , 18));
        JLabel lblCinemaname1 = new JLabel("Cinemas");
        lblCinemaname1.setForeground(Color.decode("#E3E3E3"));
        lblCinemaname1.setBounds(1080 , 620 , 200 , 50);
        lblCinemaname1.setFont(new Font("Rockwell" , Font.PLAIN , 18));

        //Constructor for "Manage movies" Button
        btnTickets.setFont(new Font("Courier" , Font.PLAIN , 16));
        btnTickets.setBackground(Color.decode("#242B40"));
        btnTickets.setForeground(Color.decode("#75CBE6"));
        btnTickets.setOpaque(false);
        btnTickets.setContentAreaFilled(false);
        btnTickets.setBorderPainted(false);
        btnTickets.setBounds(25 , 110 , 200 , 50);
        btnTickets.addActionListener(buttons);

        add(pnlUserName);
        add(lblCinemaname);
        add(lblCinemaname1);
        add(btnTickets);
        setLayout(null);
        setBackground(Color.decode("#242B40"));
        setBounds(0 , 0 , 250  , 1000);

    }
}
