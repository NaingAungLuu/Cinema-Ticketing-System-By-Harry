package java_class_test.Admin;
import java_class_test.Login_Form;
import java_class_test.Sales.Sales_Tickets;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Admin_Menu_Fragment extends JPanel {
    public static JFrame window = new JFrame("Admin");
    public static JButton btnLogOut = new JButton("Log Out");
    static JPanel SidePanel = new JPanel();
    static ButtonHandler buttons = new ButtonHandler();
    static JButton btnAddMovieArt = new JButton("+");
    static JButton btnManageUsers = new JButton("Manage Users");
    static JButton btnManageSeatPlan = new JButton("Manage Seat Plan");
    static JButton btnManagemovies = new JButton("Manage Movies");
    static JButton btnAddMovie = new JButton("Add");
    static JButton btnEdit = new JButton("Edit");
    String strMovieName = "Aquaman";
    String strMovieType = "2D";
    String strTheatreNo = "1 , 2";
    String strMovieTime = "9:00am , 11:30am , 1.30pm , 3:00pm \n , 5:00pm , 7:00pm";
    JLabel lblMovieName = new JLabel(strMovieName);
    JLabel lblMovieType = new JLabel(strMovieType);
    JLabel lblTheatreNo  = new JLabel(strTheatreNo);
    JLabel lblMovieTimes = new JLabel(strMovieTime);
    public static JPanel content = new JPanel();
    static String showtimes = "9:00am , 11:30am , 1.30pm , 3:00pm \n , 5:00pm , 7:00pm";
    static String data[][] = {{"Aquaman" , "1 , 2" , showtimes , "3D"} ,
            {"How To Train Your Dragon \n (The Hidden World)" , "3" , showtimes , "2D"} ,
            {"Oh My Ghost 6" , "4" , showtimes , "2D"} };
    static String numbers[] = {"Movie Name" , "Theatre No." , "Show Times" , "Type"};
    static JTable Jt = new JTable(data , numbers);

    public static void main(String[]args)
    {
        Admin_Menu_Fragment adHome = new Admin_Menu_Fragment();
        Admin_Manage_Seat_Plan_Fragment frmPlan = new Admin_Manage_Seat_Plan_Fragment();
        JPanel pnlmain = new JPanel();
        pnlmain.setLayout(null);
        pnlmain.setBackground(Color.black);
        pnlmain.add(adHome.SidePanel);
        pnlmain.add(frmPlan.content);
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
    public Admin_Menu_Fragment()
    {

        //Constructor for JLabels
        //Admin_main label
        JLabel Admin_main = new JLabel("Admin");
        Admin_main.setFont(new Font("Courier" ,Font.PLAIN , 26));
        Admin_main.setForeground(Color.decode("#75CBE6"));
        Admin_main.setBounds(85 , 50 , 100, 50);

        //Constructor for "Manage movies" Button
        btnManagemovies.setFont(new Font("Courier" , Font.PLAIN , 16));
        btnManagemovies.setBackground(Color.decode("#242B40"));
        btnManagemovies.setForeground(Color.decode("#75CBE6"));
        btnManagemovies.setOpaque(false);
        btnManagemovies.setContentAreaFilled(false);
        btnManagemovies.setBorderPainted(false);
        btnManagemovies.setBounds(25 , 110 , 200 , 30);
        btnManagemovies.addActionListener(buttons);

        //Constructor for "Manage Seat Plan" Button
        btnManageSeatPlan.setFont(new Font("Courier" , Font.PLAIN , 16));
        btnManageSeatPlan.setBackground(Color.decode("#242B40"));
        btnManageSeatPlan.setForeground(Color.decode("#75CBE6"));
        btnManageSeatPlan.setOpaque(false);
        btnManageSeatPlan.setContentAreaFilled(false);
        btnManageSeatPlan.setBorderPainted(false);
        btnManageSeatPlan.setBounds(5 , 145 , 250 , 50);
        btnManageSeatPlan.addActionListener(buttons);

        //Contructor for "Manage Users" Button
        btnManageUsers.setFont(new Font("Courier" , Font.PLAIN , 16));
        btnManageUsers.setBackground(Color.decode("#242B40"));
        btnManageUsers.setForeground(Color.decode("#75CBE6"));
        btnManageUsers.setOpaque(false);
        btnManageUsers.setContentAreaFilled(false);
        btnManageUsers.setBorderPainted(false);
        btnManageUsers.setBounds(25 , 180 , 200 , 50);
        btnManageUsers.addActionListener(buttons);

        //Constructor for "Report" Button
        JButton btnReport = new JButton("Report");
        btnReport.setFont(new Font("Courier" , Font.PLAIN , 16));
        btnReport.setBackground(Color.decode("#242B40"));
        btnReport.setForeground(Color.decode("#75CBE6"));
        btnReport.setOpaque(false);
        btnReport.setContentAreaFilled(false);
        btnReport.setBorderPainted(false);
        btnReport.setBounds(25 , 215 , 200 , 50);
        btnReport.addActionListener(buttons);


        SidePanel.setLayout(null);
        SidePanel.setBackground(Color.decode("#242B40"));
        SidePanel.setBounds(0 , 0 , 250  , 1000);
        SidePanel.add(Admin_main);
        SidePanel.add(btnManagemovies);
        SidePanel.add(btnManageSeatPlan);
        SidePanel.add(btnManageUsers);
        SidePanel.add(btnReport);


        //Constructor for JPanel
        /*Admin_Manage_Seat_Plan_Fragment frag = new Admin_Manage_Seat_Plan_Fragment();
        content.setLayout(null);
        content.setBackground(Color.decode("#FFFFFF"));
        content.add(SidePanel);
        content.add(frag.content);*/

        //Constructor for JFrame

        /*window.setContentPane(content);
        window.setSize(1200 , 700);
        window.setLocation(100, 100);
        window.setTitle("Cinema Ticket Booking System");
        window.setName("Cinema Ticket Booking System");
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);*/

    }

    public boolean isCellEditable(int row , int column)
    {
        return false;
    }
    public static class Admin_Manage_Movies_page extends JPanel
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
                Admin_Manage_Movies.window.dispose();
            }
            else if(e.getSource() == btnManageSeatPlan)
            {
                Admin_Manage_Seat_Plan frmManageSeatPlane = new Admin_Manage_Seat_Plan();
                Admin_Manage_Movies.window.dispose();
            }
            else if(e.getSource() == btnManageUsers)
            {
                Admin_Manage_Users frmManageUsers = new Admin_Manage_Users();
                Admin_Manage_Movies.window.dispose();
            }
            else if(e.getSource() == btnAddMovieArt)
            {
                JFileChooser choosefile = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Images" , "jpg" , "jpeg" , "png");
                choosefile.setFileFilter(filter);
                int result = choosefile.showOpenDialog(null);
                if(result == JFileChooser.APPROVE_OPTION) {
                    File file = choosefile.getSelectedFile();
                    try {
                        btnAddMovieArt.setText("");
                        btnAddMovieArt.setIcon(Sales_Tickets.scaleImage(new ImageIcon(ImageIO.read(file)) , 205 , 205) );

                    }catch(IOException err)
                    {
                        String msg = "Error while fetching file\nPlease make sure you have selected an image file";
                        JOptionPane.showMessageDialog(window , msg , "Error" , JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            else if(e.getSource() == btnEdit)
            {
                Admin_Manage_Movies_Edit frmEdit = new Admin_Manage_Movies_Edit();

            }

        }

    }
}
