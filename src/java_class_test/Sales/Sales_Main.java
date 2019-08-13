package java_class_test.Sales;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java_class_test.Admin.Admin_Home;
import java_class_test.GUIHandler;
import java_class_test.Login_Form;

public class Sales_Main {
    public static JFrame window = new JFrame("Sales");
    public static JButton btnLogOut = new JButton("Log Out");
    public static JButton btnTickets = new JButton("Tickets");

    public static ButtonHandler buttons = new ButtonHandler();
    public static void main(String[]args)
    {
        Sales_Main frmSalesMain = new Sales_Main("Default");
        JButton btnLogin = new JButton("OK");
    }
    Sales_Main(String username)
    {



        //Constructor for JLabels
        //Admin_main label
        JLabel lblUser_name = new JLabel(username);
        lblUser_name.setFont(new Font("Courier" ,Font.PLAIN , 20));
        lblUser_name.setForeground(Color.decode("#75CBE6"));
        lblUser_name.setHorizontalAlignment(btnTickets.LEFT);
        JPanel pnlUserName = new JPanel();
        pnlUserName.setLayout(null);
        pnlUserName.setBounds(30 , 50 , 200, 50);
        pnlUserName.add(lblUser_name);
        pnlUserName.setBackground(Color.decode("#242B40"));
        lblUser_name.setBounds( 0, 0 , 250, 50);
        lblUser_name.setBounds( (lblUser_name.getWidth()/2)- (pnlUserName.getWidth()/2), 0 , 250, 50);
        // "Welcome Admin!" Label
        JLabel lblWelcomeAdmin = new JLabel("Welcome");
        lblWelcomeAdmin.setFont(new Font("Courier" ,Font.PLAIN , 20));
        lblWelcomeAdmin.setForeground(Color.decode("#F7FDFF"));
        lblWelcomeAdmin.setBounds(505 , 50 , 180, 50);
        JLabel lblWelcomeAdminName = new JLabel("Naing Aung Luu!");
        lblWelcomeAdminName.setFont(new Font("Courier" ,Font.PLAIN , 17));
        lblWelcomeAdminName.setForeground(Color.decode("#75CBE6"));
        lblWelcomeAdminName.setBounds(605 , 50 , 250, 50);

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

        //Constructor for "LOG OUT" Button

        btnLogOut.setFont(new Font("Courier" , Font.PLAIN , 16));
        btnLogOut.setForeground(Color.decode("#FFFFFF"));
        btnLogOut.setBorder(new LineBorder(Color.decode("#e91e63") , 2));
        btnLogOut.setBounds(1080 , 40 , 90, 40);
        btnLogOut.setHorizontalAlignment(SwingConstants.CENTER);
        btnLogOut.addActionListener(buttons);

        //Constructor for JPanel
        JPanel content = new JPanel();
        content.setLayout(null);
        content.setBackground(Color.decode("#242B40"));
        content.add(pnlUserName);
        content.add(btnTickets);
        content.add(lblWelcomeAdmin);
        content.add(lblWelcomeAdminName);
        content.add(lblCinemaname1);
        content.add(lblCinemaname);
        content.add(btnLogOut);

        //Constructor for JFrame

        window.setContentPane(content);
        window.setSize(1200 , 700);
        window.setLocation(100, 100);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static class Admin_Home_page extends JPanel
    {
        public void paintComponent (Graphics g)
        {
            super.paintComponent(g);
            g.drawString("Admin Home", 16, 30);
        }
    }
    public static class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnLogOut)
            {
                Login_Form frmLogin = new Login_Form();
                Admin_Home.window.dispose();
            }
            else if(e.getSource() == btnTickets)
            {
                Sales_Tickets frmSalesTickets = new Sales_Tickets();
                Sales_Main.window.dispose();
            }
            //else if(e.getSource() == btnManageSeatPlan)
        }
    }


}
