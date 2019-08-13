package java_class_test.Admin;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java_class_test.Login_Form;

public class Admin_Manage_Seat_Plan {
		public static JFrame window = new JFrame("Admin");
		public static JButton btnLogOut = new JButton("Log Out");
		public static JButton btnManagemovies = new JButton("Manage Movies");
		static JButton btnManageSeatPlan = new JButton("Manage Seat Plan");
		static JButton btnManageUsers = new JButton("Manage Users");
		public static JTextArea txtClassA = new JTextArea("6500");
		public static JTextArea txtClassB = new JTextArea("5500");
		public static JTextArea txtClassC = new JTextArea("4500");
		public static JTextArea txtCoupleSeat = new JTextArea("12000");
		public static ButtonHandler buttons = new ButtonHandler();
			public static void main(String[]args)
			{
				Admin_Manage_Seat_Plan frmAdminManageSeatPlan = new Admin_Manage_Seat_Plan();
				JButton btnLogin = new JButton("OK");
			}
			Admin_Manage_Seat_Plan()
			{
				
				
				//Constructor for JRadioButtons
				JRadioButton rdo3D = new JRadioButton("3D" , true);
				JRadioButton rdo2D = new JRadioButton("2D" , false);
				ButtonGroup btnGp = new ButtonGroup();
				btnGp.add(rdo2D);
				btnGp.add(rdo3D);
				rdo3D.setBounds(495 , 50 , 100 , 30);
				rdo2D.setBounds(595 , 50 , 100 , 30);
				rdo3D.setForeground(Color.decode("#FFFFFF"));
				rdo2D.setForeground(Color.decode("#FFFFFF"));
				rdo3D.setFont(new Font("Nadeem" , Font.PLAIN , 26));
				rdo2D.setFont(new Font("Nadeem" , Font.PLAIN , 26));
				//lblWelcomeAdmin.setBounds(505 , 50 , 180, 50);
			
				//lblWelcomeAdminName.setBounds(605 , 50 , 100, 50);
				
				//Constructor for JTextAreas
				//Class A Seat

				txtClassA.setBounds(465 , 140 , 200 , 30);

				//Class B Seat

				txtClassB.setBounds( 465 , 230 , 200 , 30);

				//Class C Seat

				txtClassC.setBounds(465 , 320 , 200 , 30);

				//Couple Seat

				txtCoupleSeat.setBounds(465 , 410 , 200 , 30);

				//Constructor for JLabels
				//Admin_main label
				JLabel Admin_main = new JLabel("Admin");
				Admin_main.setFont(new Font("Courier" ,Font.PLAIN , 26));
				Admin_main.setForeground(Color.decode("#75CBE6"));
				Admin_main.setBounds(85 , 50 , 100, 50);
				
				//Constructor for Class Seat Price
				JLabel lblClassA = new JLabel("Class A Seat Price");
				lblClassA.setFont(new Font("Nadeem" , Font.PLAIN ,16));
				lblClassA.setBounds(465 , 90 , 200 , 50);
				lblClassA.setForeground(Color.white);
				
				JLabel lblClassB = new JLabel("Class B Seat Price");
				lblClassB.setFont(new Font("Nadeem" , Font.PLAIN , 16));
				lblClassB.setBounds(465 , 180 , 200 , 50);
				lblClassB.setForeground(Color.white);

				JLabel lblClassC = new JLabel("Class C Seat Price");
				lblClassC.setFont(new Font("Nadeem" , Font.PLAIN , 16));
				lblClassC.setBounds(465 , 270 , 200 , 50);
				lblClassC.setForeground(Color.white);

				JLabel lblCoupleSeat = new JLabel("Couple Seat Price");
				lblCoupleSeat.setFont(new Font("Nadeem" , Font.PLAIN , 16));
				lblCoupleSeat.setBounds(465 , 360 , 200 , 50);
				lblCoupleSeat.setForeground(Color.white);

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
				btnManagemovies.setFont(new Font("Courier" , Font.PLAIN , 16));
				btnManagemovies.setBackground(Color.decode("#242B40"));
				btnManagemovies.setForeground(Color.decode("#75CBE6"));
				btnManagemovies.setOpaque(false);
				btnManagemovies.setContentAreaFilled(false);
				btnManagemovies.setBorderPainted(false);
				btnManagemovies.setBounds(25 , 110 , 200 , 50);
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
				
				//Constructor for "LOG OUT" Button
				
				btnLogOut.setFont(new Font("Courier" , Font.PLAIN , 16));
				btnLogOut.setForeground(Color.decode("#FFFFFF"));
				btnLogOut.setBorder(new LineBorder(Color.decode("#e91e63") , 2));
				btnLogOut.setBounds(1080 , 40 , 90, 40);
				btnLogOut.setHorizontalAlignment(SwingConstants.CENTER);
				btnLogOut.addActionListener(buttons);

				//Constructor for Save Button
				JButton btnSave = new JButton("Save");
				btnSave.setBounds(550 , 490 , 100 , 40);
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
				JPanel content = new JPanel();
				content.setLayout(null);
				content.setBackground(Color.decode("#242B40"));
				content.add(Admin_main);
				content.add(btnManagemovies);
				content.add(btnManageSeatPlan);
				content.add(btnManageUsers);
				content.add(btnReport);
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
				content.add(new Admin_Menu_Fragment().SidePanel);
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
				Admin_Manage_Seat_Plan.window.dispose();
			}
			else if(e.getSource() == btnManagemovies)
			{
				Admin_Manage_Movies frmManageMovies = new Admin_Manage_Movies();
				Admin_Manage_Seat_Plan.window.dispose();
			}
			else if(e.getSource() == btnManageUsers)
			{
				Admin_Manage_Users frmManageUsers = new Admin_Manage_Users();
				Admin_Manage_Seat_Plan.window.dispose();
			}
		}

	}
}
