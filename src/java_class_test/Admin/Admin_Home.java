package java_class_test.Admin;
import java_class_test.Login_Form;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class Admin_Home {
		public static JFrame window = new JFrame("Admin");
		public static JButton btnLogOut = new JButton("Log Out");
		public static JButton btnManagemovies = new JButton("Manage Movies");
		public static JButton btnManageSeatPlan = new JButton("Manage Seat Plan");
		public static JButton btnManageUsers = new JButton("Manage Users");

		public static ButtonHandler buttons = new ButtonHandler();
			public static void main(String[]args)
			{
				/*Admin_Home adHome = new Admin_Home();
				JButton btnLogin = new JButton("OK");*/
				JFrame frame = new JFrame();
				frame.setContentPane(new Admin_Manage_Movies());
				frame.setTitle("This is the panel with fragment!!!!!");
				frame.setSize(1200 , 700);
				frame.setLocation(100, 100);
				frame.setVisible(true);
				frame.setResizable(false);
				frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			}
			public Admin_Home()
			{
				//Constructor for JLabels
				//Admin_main label
				JLabel Admin_main = new JLabel("Admin");
				Admin_main.setFont(new Font("Courier" ,Font.PLAIN , 26));
				Admin_main.setForeground(Color.decode("#75CBE6"));
				Admin_main.setBounds(85 , 50 , 100, 50);
				
				// "Welcome Admin!" Label
				JLabel lblWelcomeAdmin = new JLabel("Welcome");
				lblWelcomeAdmin.setFont(new Font("Courier" ,Font.PLAIN , 20));
				lblWelcomeAdmin.setForeground(Color.decode("#F7FDFF"));
				lblWelcomeAdmin.setBounds(505 , 50 , 180, 50);
				JLabel lblWelcomeAdminName = new JLabel("Admin!");
				lblWelcomeAdminName.setFont(new Font("Courier" ,Font.PLAIN , 20));
				lblWelcomeAdminName.setForeground(Color.decode("#75CBE6"));
				lblWelcomeAdminName.setBounds(605 , 50 , 100, 50);
				
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
				
				//Constructor for JPanel
				JPanel content = new JPanel();
			 	content.setLayout(null);
				content.setBackground(Color.decode("#242B40"));
				content.add(Admin_main);
				content.add(btnManagemovies);
				content.add(btnManageSeatPlan);
				content.add(btnManageUsers);
				content.add(btnReport);
				content.add(lblWelcomeAdmin);
				content.add(lblWelcomeAdminName);
				content.add(lblCinemaname1);
				content.add(lblCinemaname);
				content.add(btnLogOut);
				
				//Constructor for JFrame
				Admin_Menu_Fragment frag = new Admin_Menu_Fragment();
				window.setContentPane(frag.content);
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
					else if(e.getSource() == btnManagemovies)
					{
						Admin_Manage_Movies frmManageMovies = new Admin_Manage_Movies();
						Admin_Home.window.dispose();
						}
					else if(e.getSource() == btnManageSeatPlan)
					{
						Admin_Manage_Seat_Plan frmManageSeatPlane = new Admin_Manage_Seat_Plan();
						Admin_Home.window.dispose();
					}
					else if(e.getSource() == btnManageUsers)
					{
						Admin_Manage_Users frmManageUsers = new Admin_Manage_Users();
						Admin_Home.window.dispose();
					}
					}

				}
			

}
