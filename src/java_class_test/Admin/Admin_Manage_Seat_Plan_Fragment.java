package java_class_test.Admin;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java_class_test.Login_Form.ButtonHandler;

public class Admin_Manage_Seat_Plan_Fragment extends JPanel {
    public JPanel content = new JPanel();
    public static void main(String[]args)
    {
        Admin_Manage_Seat_Plan_Fragment frmAdminManageSeatPlan = new Admin_Manage_Seat_Plan_Fragment();
        JFrame window = new JFrame();
        JPanel pnlMain = new JPanel();
        pnlMain.setBackground(Color.white);
        pnlMain.setLayout(null);
        pnlMain.add(frmAdminManageSeatPlan.content);
        window.setContentPane(pnlMain);
        window.setSize(1200 , 700);
        window.setLocation(100, 100);
        window.setTitle("Cinema Ticket Booking System");
        window.setName("Cinema Ticket Booking System");
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton btnLogin = new JButton("OK");
    }
    Admin_Manage_Seat_Plan_Fragment()
    {
          JButton btnLogOut = new JButton("Log Out");
        JTextArea txtClassA = new JTextArea("6500");
        JTextArea txtClassB = new JTextArea("5500");
        JTextArea txtClassC = new JTextArea("4500");
        JTextArea txtCoupleSeat = new JTextArea("12000");
        ButtonHandler buttons = new ButtonHandler();

        //Constructor for JRadioButtons
        JRadioButton rdo3D = new JRadioButton("3D" , true);
        JRadioButton rdo2D = new JRadioButton("2D" , false);
        ButtonGroup btnGp = new ButtonGroup();
        btnGp.add(rdo2D);
        btnGp.add(rdo3D);
        rdo3D.setBounds(245 , 50 , 100 , 30);
        rdo2D.setBounds(345 , 50 , 100 , 30);
        rdo3D.setForeground(Color.decode("#FFFFFF"));
        rdo2D.setForeground(Color.decode("#FFFFFF"));
        rdo3D.setFont(new Font("Nadeem" , Font.PLAIN , 26));
        rdo2D.setFont(new Font("Nadeem" , Font.PLAIN , 26));
        //lblWelcomeAdmin.setBounds(505 , 50 , 180, 50);

        //lblWelcomeAdminName.setBounds(605 , 50 , 100, 50);

        //Constructor for JTextAreas
        //Class A Seat

        txtClassA.setBounds(215 , 140 , 200 , 30);

        //Class B Seat

        txtClassB.setBounds( 215 , 230 , 200 , 30);

        //Class C Seat

        txtClassC.setBounds(215 , 320 , 200 , 30);

        //Couple Seat

        txtCoupleSeat.setBounds(215 , 410 , 200 , 30);

        //Constructor for JLabels
        //Admin_main label

        //Constructor for Class Seat Price
        JLabel lblClassA = new JLabel("Class A Seat Price");
        lblClassA.setFont(new Font("Nadeem" , Font.PLAIN ,16));
        lblClassA.setBounds(215 , 90 , 200 , 50);
        lblClassA.setForeground(Color.white);

        JLabel lblClassB = new JLabel("Class B Seat Price");
        lblClassB.setFont(new Font("Nadeem" , Font.PLAIN , 16));
        lblClassB.setBounds(215 , 180 , 200 , 50);
        lblClassB.setForeground(Color.white);

        JLabel lblClassC = new JLabel("Class C Seat Price");
        lblClassC.setFont(new Font("Nadeem" , Font.PLAIN , 16));
        lblClassC.setBounds(215 , 270 , 200 , 50);
        lblClassC.setForeground(Color.white);

        JLabel lblCoupleSeat = new JLabel("Couple Seat Price");
        lblCoupleSeat.setFont(new Font("Nadeem" , Font.PLAIN , 16));
        lblCoupleSeat.setBounds(215 , 360 , 200 , 50);
        lblCoupleSeat.setForeground(Color.white);

        //Cinema Name Label
        JLabel lblCinemaname = new JLabel("Galaxy");
        lblCinemaname.setForeground(Color.decode("#FF6767"));
        lblCinemaname.setBounds(750 , 620 , 200 , 50);
        lblCinemaname.setFont(new Font("Rockwell" , Font.PLAIN , 18));
        JLabel lblCinemaname1 = new JLabel("Cinemas");
        lblCinemaname1.setForeground(Color.decode("#E3E3E3"));
        lblCinemaname1.setBounds(830 , 620 , 200 , 50);
        lblCinemaname1.setFont(new Font("Rockwell" , Font.PLAIN , 18));

        //Constructor for "LOG OUT" Button

        btnLogOut.setFont(new Font("Courier" , Font.PLAIN , 16));
        btnLogOut.setForeground(Color.decode("#FFFFFF"));
        btnLogOut.setBorder(new LineBorder(Color.decode("#e91e63") , 2));
        btnLogOut.setBounds(830 , 40 , 90, 40);
        btnLogOut.setHorizontalAlignment(SwingConstants.CENTER);
        btnLogOut.addActionListener(buttons);

        //Constructor for Save Button
        JButton btnSave = new JButton("Save");
        btnSave.setBounds(300 , 490 , 100 , 40);
        btnSave.setBackground(Color.decode("#FF6767"));
        btnSave.setForeground(Color.WHITE);
        btnSave.setContentAreaFilled(false);
        btnSave.setBorder(new LineBorder(Color.decode("#242B40") , 2));
        btnSave.setOpaque(true);
        btnSave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                btnSave.setBackground(Color.white);
                btnSave.setForeground(Color.decode("#FF6767"));
            }
        });
        btnSave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                btnSave.setBackground(Color.decode("#FF6767"));
                btnSave.setForeground(Color.white);
            }
        });

        //Constructor for JPanel

        content.setLayout(null);
        content.setBackground(Color.decode("#242B40"));
        content.setBounds(250 , 0 , 950 , 700);
        content.add(rdo3D);
        content.add(rdo2D);
        content.add(lblCinemaname1);
        content.add(lblCinemaname);
        content.add(btnLogOut);
        content.add(lblClassA);
        content.add(lblClassB);
        content.add(txtClassA);
        content.add(txtClassB);
        content.add(lblClassC);
        content.add(txtClassC);
        content.add(txtCoupleSeat);
        content.add(lblCoupleSeat);
        content.add(btnSave);
    }
}
