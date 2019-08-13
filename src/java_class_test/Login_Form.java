package java_class_test;
import java_class_test.Admin.Admin_Home;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

import javax.swing.border.LineBorder;
public class Login_Form extends JPanel{
	public static String str = "Hello World!";
	public static String button_text = "OK";
	public static boolean status = false;
	public static String password;
	public static JPasswordField txtPassword = new JPasswordField();
	public static JTextField txtUsername = new JTextField();
	public static JFrame window = new JFrame("Login Form");
	public static ButtonHandler buttons = new ButtonHandler();
	 static JButton btnLogin = new JButton("Log In");
	public JPanel content = new JPanel();

	public static final String ADMIN = "ADMIN";
	public static final String STAFF = "STAFF";

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/Cinema?useSSL=false";

    static final String USER = "root";
    static final String PASSWORD = "password";

    private static Connection conn = null;
    private static Statement stm = null;
	public static void main(String[]args)
	{	
		Login_Form login = new Login_Form();
	}
	private void Login()
	{

	}
    public static final Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

	public Login_Form()
	{
		//Constructor for Labels
				//Cinema name label
				JLabel lblCinemaname = new JLabel("Galaxy");
				lblCinemaname.setForeground(Color.decode("#FF6767"));
				lblCinemaname.setBounds(110 , 50 , 200 , 50);
				lblCinemaname.setFont(new Font("Rockwell" , Font.PLAIN , 36));
				JLabel lblCinemaname1 = new JLabel("Cinemas");
				lblCinemaname1.setForeground(Color.decode("#E3E3E3"));
				lblCinemaname1.setBounds(250 , 52 , 200 , 50);
				lblCinemaname1.setFont(new Font("Rockwell" , Font.PLAIN , 36));
				//Username label
				JLabel lblLogin = new JLabel("Username");
				lblLogin.setForeground(Color.WHITE);
				lblLogin.setBounds(100, 150, 200, 20);
				lblLogin.setFont(new Font("Arial" , Font.BOLD , 20));
				//Password label
				JLabel lblPassword = new JLabel("Password");
				lblPassword.setForeground(Color.WHITE);
				lblPassword.setBounds(100, 200, 200, 20);
				lblPassword.setFont(new Font("Arial" , Font.BOLD , 20));
				
				//Constructors for TextField
				//Username Textfield
				txtUsername.setBounds(210 , 149 , 200 , 30 );
				//txtUsername.setBorder(new LineBorder(Color.decode("#e91e63") , 1));
				
				//Password Textfield
				txtPassword.setBounds(210 , 199 , 200 , 30 );
				txtPassword.setEchoChar('*');
				password = txtPassword.getPassword().toString();
				txtPassword.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						super.keyPressed(e);
						if(e.getKeyCode() == KeyEvent.VK_ENTER)
						{
							buttons.Login();
						}
					}
				});

				//Constructor for Buttons
				//Login Button
				btnLogin.setBounds(150 , 270 , 180 , 45);
				btnLogin.addActionListener(buttons);
				btnLogin.setBackground(Color.decode("#FF6767"));
				btnLogin.setForeground(Color.white);
				btnLogin.setFont(new Font("Arial" , Font.BOLD , 20 ));
				btnLogin.setContentAreaFilled(false);
				btnLogin.setBorder(new LineBorder(Color.decode("#242B40") , 2));
				btnLogin.setOpaque(true);
				btnLogin.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e) {
						super.mousePressed(e);
						btnLogin.setForeground(Color.decode("#FF6767"));
						btnLogin.setBackground(Color.white);
					}
				});

						btnLogin.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseReleased(MouseEvent e) {
								super.mouseReleased(e);
								btnLogin.setBackground(Color.decode("#FF6767"));
								btnLogin.setForeground(Color.white);
							}
						});
		//btnLogin.setBounds((window.getWidth()/2)-(btnLogin.getWidth()/2) , 270 , 180 , 45);

				//Constructor for Panel("CONTENT")
				setLayout(null);
				setBackground(Color.decode("#242B40"));
				add(lblLogin);
				add(lblPassword);
				add(txtUsername);
				add(txtPassword);
				add(btnLogin);
				add(lblCinemaname);
				add(lblCinemaname1);
				
				//Constructor for JFrame

//				window.setContentPane(content);
//				window.setSize(500 , 400);
//				window.setLocation(450 , 300);
//				window.setVisible(true);
//				window.setLocationRelativeTo(null);
//				window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//				//window.setBackground(Color.decode("#303f9f"));


	}

	public static class HelloWorldDisplay extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawString(str, 16, 30);
		}
	}
	public static class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == btnLogin)
			{
				this.Login();
			}
			
			
		}
		public void Login()
		{

		    //get User's credentials
            String enteredusername = txtUsername.getText().trim();
            String enteredpassword = String.valueOf(txtPassword.getPassword());
            String username = "";
            String password = "";
            String userType = "";
            try{
                Class.forName(JDBC_DRIVER);
                System.out.println("Connecting to Database.....");
                conn = getConnection();
                System.out.println("Creating Statement.....");
                stm = conn.createStatement();
                String sql = "SELECT userName , password , userType FROM tblUsers WHERE"
                        + " userName = '" + enteredusername + "'" ;
                ResultSet rs = stm.executeQuery(sql);

                while(rs.next())
                {
                    password = rs.getString("password");
                    username = rs.getString("userName");
                    userType = rs.getString("userType");

                    System.out.println(password);
                    System.out.println(username);
                }
                if(!username.isEmpty())
                {
                   if(enteredpassword.equals(password))
                   {
					   GUI.setUser(username , userType);
                       if(userType.equals(ADMIN))
                       {
                           Admin_Home adHome = new Admin_Home();
                            Login_Form.window.dispose();
                       }
                       else if(userType.equals(STAFF))
                       {
                       		GUI.pnlFrag.removeAll();
                       		GUI.show(GUI.SALES_TICKETS);
						   System.out.println("Logged In as " + username);
                       }
                   }
                   else
                   {
                       JOptionPane.showMessageDialog( window , "Pleas enter the correct password" , "Incorrect Password" , JOptionPane.WARNING_MESSAGE);

                   }
                }
                else{
                    JOptionPane.showMessageDialog( window , "User is not found in the system" , "Error" , JOptionPane.ERROR_MESSAGE);
                }

            }catch (Exception e){

            }
		}
	}
}
