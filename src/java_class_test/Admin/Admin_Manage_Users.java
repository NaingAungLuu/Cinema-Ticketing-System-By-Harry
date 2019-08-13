package java_class_test.Admin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java_class_test.GUIHandler;
import java_class_test.Login_Form;

public class Admin_Manage_Users {
    public static JFrame window = new JFrame("Admin");
    public static JButton btnLogOut = new JButton("Log Out");
    public static JButton btnManagemovies = new JButton("Manage Movies");
    public static JButton btnReport = new JButton("Report");
    public static JButton btnManageSeatPlan = new JButton("Manage Seat Plan");
    public static JButton btnManageUsers = new JButton("Manage Users");
    public static JButton btnAdd = new JButton("Add");
    public ButtonHandler buttons = new ButtonHandler();
    public static JButton btnEdit = new JButton("Edit");
    public static JButton btnDelete = new JButton("Delete");
    JTable tblData;
    DefaultTableModel tableModel;

    JLabel lblUsername = new JLabel("Naing Aung Luu");
    JLabel lblID = new JLabel("26093");

     HintTextField txtUsername = new HintTextField("Username");
    HintTextField txtPassword = new HintTextField("Password");
     HintTextField txtID = new HintTextField("ID");

    public static void main(String[]args)
    {
        Admin_Manage_Users adManageUsers = new Admin_Manage_Users();
    }
    Admin_Manage_Users() {

        String[][] Data = {{"Naing Aung Luu", "26093"}, {"Thidar Oo", "31546"}};
        ArrayList<String[]> userData = new ArrayList<>();
        ArrayList<String> Columns = new ArrayList<>();
        Columns.add("User Name");
        Columns.add("ID");
        String[] ColumnNames = {"User Name", "ID"};
        try {
            Connection conn =  Login_Form.getConnection();
            Statement stm = conn.createStatement();
            String sql = "SELECT * FROM tblUsers";
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())
            {
                String temp[] = new String[2];
                temp[0] = rs.getString("userName");
                temp[1] = rs.getString("userID");
                userData.add(temp);
             }
            DefaultTableModel model = new DefaultTableModel();
            Vector row = new Vector(6);
            row.add(rs.getString(2));


        }catch (SQLException se){

        }


        tblData = new JTable(userData.toArray(Data) , ColumnNames);
        tblData.setBounds(330, 80, 800, 300);
        tblData.setFont(new Font("Courier", Font.PLAIN, 18));
        tblData.setSize(900, 400);
        tblData.setRowHeight(35);
        tblData.setAlignmentX(20f);
        tblData.setAlignmentY(20f);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tblData.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblData.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblData.getTableHeader().setFont(new Font("Nadeem" , Font.PLAIN , 15));
        tblData.getTableHeader().setAlignmentX(JLabel.CENTER);
        tblData.setSelectionBackground(Color.gray);
        tblData.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                lblUsername.setText(tblData.getValueAt(tblData.getSelectedRow() , 0).toString());
                lblID.setText(tblData.getValueAt(tblData.getSelectedRow() , 1).toString());
            }
        });

        JScrollPane scrollableTextArea = new JScrollPane(tblData);
        scrollableTextArea.setBounds(300 ,100 , 800 , 300);
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setForeground(Color.decode("#D5D3D3"));
        scrollableTextArea.setOpaque(false);

        //Constructor for TextAreas
        //Add_Username
        txtUsername.setBounds(300 , 420 , 350 , 30);
        txtUsername.setFont(new Font("Nadeem" , Font.PLAIN , 16));
        txtUsername.setMargin(new Insets(5 , 10 , 1 , 0));
        //Add_Password

        txtPassword.setBounds(300 , 460 , 350 , 30);
        txtPassword.setFont(new Font("Nadeem" , Font.PLAIN , 16));
        txtPassword.setMargin(new Insets(5 , 10 , 1 , 0));
        //Add_ID

        txtID.setBounds(300 , 500 , 220 , 30);
        txtID.setFont(new Font("Nadeem" , Font.PLAIN , 16));
        txtID.setMargin(new Insets(5 , 10 , 1 , 0));

        //Constructor for JLabels
        //Admin_main label
        JLabel Admin_main = new JLabel("Admin");
        Admin_main.setFont(new Font("Courier", Font.PLAIN, 26));
        Admin_main.setForeground(Color.decode("#75CBE6"));
        Admin_main.setBounds(85, 50, 100, 50);


        //Users In Database label
        JLabel Users_in_database = new JLabel("Users In Database");
        Users_in_database.setFont(new Font("Courier", Font.PLAIN, 20));
        Users_in_database.setForeground(Color.decode("#75CBE6"));
        Users_in_database.setBounds(300, 50, 250, 50);

        //Cinema Name Label
        JLabel lblCinemaname = new JLabel("Galaxy");
        lblCinemaname.setForeground(Color.decode("#FF6767"));
        lblCinemaname.setBounds(1000, 620, 200, 50);
        lblCinemaname.setFont(new Font("Rockwell", Font.PLAIN, 18));
        JLabel lblCinemaname1 = new JLabel("Cinemas");
        lblCinemaname1.setForeground(Color.decode("#E3E3E3"));
        lblCinemaname1.setBounds(1080, 620, 200, 50);
        lblCinemaname1.setFont(new Font("Rockwell", Font.PLAIN, 18));

        //Edit Username label
        lblUsername.setHorizontalAlignment(JLabel.CENTER);
        lblUsername.setBounds(800 , 420 , 350 , 30);
        lblUsername.setForeground(Color.white);
        lblUsername.setFont(new Font("Courier" , Font.PLAIN , 24));

        //Edit ID tag label
        JLabel lblIDtag = new JLabel("ID - ");
        lblIDtag.setBounds(850 , 460 , 100 , 30);
        lblIDtag.setFont(new Font("Courier" , Font.PLAIN , 22));
        lblIDtag.setForeground(Color.white);

        //Edit ID

        lblID.setBounds(900 , 460 , 200 , 30);
        lblID.setFont(new Font("Courier" , Font.PLAIN , 22));
        lblID.setForeground(Color.white);


        //Constructor for "Manage movies" Button
        btnManagemovies.setFont(new Font("Courier", Font.PLAIN, 16));
        btnManagemovies.setBackground(Color.decode("#242B40"));
        btnManagemovies.setForeground(Color.decode("#75CBE6"));
        btnManagemovies.setOpaque(false);
        btnManagemovies.setContentAreaFilled(false);
        btnManagemovies.setBorderPainted(false);
        btnManagemovies.setBounds(25, 110, 200, 50);
        btnManagemovies.addActionListener(buttons);

        //Constructor for "Manage Seat Plan" Button
        btnManageSeatPlan.setFont(new Font("Courier", Font.PLAIN, 16));
        btnManageSeatPlan.setBackground(Color.decode("#242B40"));
        btnManageSeatPlan.setForeground(Color.decode("#75CBE6"));
        btnManageSeatPlan.setOpaque(false);
        btnManageSeatPlan.setContentAreaFilled(false);
        btnManageSeatPlan.setBorderPainted(false);
        btnManageSeatPlan.setBounds(5, 145, 250, 50);
        btnManageSeatPlan.addActionListener(buttons);

        //Contructor for "Manage Users" Button

        btnManageUsers.setFont(new Font("Courier", Font.PLAIN, 16));
        btnManageUsers.setBackground(Color.decode("#242B40"));
        btnManageUsers.setForeground(Color.decode("#75CBE6"));
        btnManageUsers.setOpaque(false);
        btnManageUsers.setContentAreaFilled(false);
        btnManageUsers.setBorderPainted(false);
        btnManageUsers.setBounds(25, 180, 200, 50);
        btnManageUsers.addActionListener(buttons);

        //Constructor for "Report" Button

        btnReport.setFont(new Font("Courier", Font.PLAIN, 16));
        btnReport.setBackground(Color.decode("#242B40"));
        btnReport.setForeground(Color.decode("#75CBE6"));
        btnReport.setOpaque(false);
        btnReport.setContentAreaFilled(false);
        btnReport.setBorderPainted(false);
        btnReport.setBounds(25, 215, 200, 50);

        //Constructor for "LOG OUT" Button

        btnLogOut.setFont(new Font("Courier", Font.PLAIN, 16));
        btnLogOut.setForeground(Color.decode("#FFFFFF"));
        btnLogOut.setBorder(new LineBorder(Color.decode("#e91e63"), 2));
        btnLogOut.setBounds(1080, 40, 90, 40);
        btnLogOut.setHorizontalAlignment(SwingConstants.CENTER);
        btnLogOut.addActionListener(buttons);

        //Constructor for "Add" Button
        btnAdd.setBounds(530 , 500 , 120 , 30);
        btnAdd.setBackground(Color.decode("#FF6767"));
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setBorder(new LineBorder(Color.decode("#242B40") , 2));
        btnAdd.setOpaque(true);
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                btnAdd.setBackground(Color.white);
                btnAdd.setForeground(Color.decode("#FF6767"));
            }
        });
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                btnAdd.setBackground(Color.decode("#FF6767"));
                btnAdd.setForeground(Color.white);
            }
        });
        btnAdd.addActionListener(new GUIHandler());

        //Constructor for "Edit" Button
        btnEdit.setBounds(850 , 510 , 90 , 30);
        btnEdit.setBackground(Color.decode("#FF6767"));
        btnEdit.setForeground(Color.WHITE);
        btnEdit.setContentAreaFilled(false);
        btnEdit.setBorder(new LineBorder(Color.decode("#242B40") , 2));
        btnEdit.setOpaque(true);
        btnEdit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                btnEdit.setBackground(Color.white);
                btnEdit.setForeground(Color.decode("#FF6767"));
            }
        });
        btnEdit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                btnEdit.setBackground(Color.decode("#FF6767"));
                btnEdit.setForeground(Color.white);
            }
        });
        btnEdit.addActionListener(new GUIHandler());

        //Constructor for "Delete" Button
        btnDelete.setBounds(950 , 510 , 90 , 30);
        btnDelete.setBackground(Color.decode("#FFB031"));
        btnDelete.setForeground(Color.WHITE);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setBorder(new LineBorder(Color.decode("#242B40") , 2));
        btnDelete.setOpaque(true);
        btnDelete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                btnDelete.setBackground(Color.white);
                btnDelete.setForeground(Color.decode("#FFB031"));
            }
        });
        btnDelete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                btnDelete.setBackground(Color.decode("#FFB031"));
                btnDelete.setForeground(Color.white);
            }
        });
        btnDelete.addActionListener(new GUIHandler());

        //Constructor for JPanel
        JPanel content = new JPanel();
        content.setLayout(null);
        content.setBackground(Color.decode("#242B40"));
        content.setFocusable(true);
        content.add(Admin_main);
        content.add(btnManagemovies);
        content.add(btnManageSeatPlan);
        content.add(btnManageUsers);
        content.add(btnReport);
        content.add(lblCinemaname1);
        content.add(lblCinemaname);
        content.add(btnLogOut);
        content.add(Users_in_database);
        content.add(scrollableTextArea);
        content.add(txtUsername);
        content.add(txtPassword);
        content.add(txtID);
        content.add(btnAdd);
        content.add(lblUsername);
        content.add(lblIDtag);
        content.add(lblID);
        content.add(btnEdit);
        content.add(btnDelete);


        //Constructor for JFrame

        window.setContentPane(content);
        window.setSize(1200, 700);
        window.setLocation(100, 100);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public class HintTextField extends JTextField implements FocusListener
    {
        private String hint;
        private boolean showingHint;

        public HintTextField (String hint)
        {
            super(hint);
            this.hint = hint;
            this.showingHint = true;
            super.addFocusListener(this);
        }

        @Override
        public void focusGained(FocusEvent e) {
            if(this.getText().equals(hint))
            {
                super.setText("");
                showingHint = false;
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            if(this.getText().length() == 0)
            {
                super.setText(hint);
                showingHint = true;
            }
        }
        public String getTextData()
        {
            String text = this.getText();
            if(text.equals(hint))
            {
                text = "";
            }
           return text;
        }
    }

    public class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnLogOut)
            {
                Login_Form frmLogin = new Login_Form();
                Admin_Manage_Users.window.dispose();
            }
            else if(e.getSource() == btnManagemovies)
            {
                Admin_Manage_Movies frmManageMovies = new Admin_Manage_Movies();
                Admin_Manage_Users.window.dispose();
            }
            else if(e.getSource() == btnManageSeatPlan)
            {
                Admin_Manage_Seat_Plan frmManageSeatPlane = new Admin_Manage_Seat_Plan();
                Admin_Manage_Users.window.dispose();
            }
            else if(e.getSource() == btnAdd)
            {
                String username = txtUsername.getTextData();
                String password = txtPassword.getTextData();
                String id = txtID.getTextData();
                if(!username.isEmpty() && !password.isEmpty() && !id.isEmpty()) {
                    String sql = "INSERT INTO `Cinema`.`tblUsers` (`userID` , `userName` , `password` , `userType`) VALUES ('"
                            + id + "' , '" + username + "' , '" + password + "' , 'STAFF');";
                    try {
                        Connection conn = Login_Form.getConnection();
                        Statement stm = conn.createStatement();
                        stm.execute(sql);
                    } catch (Exception err){
                        System.out.println(err);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(window , "Please fill in every field" , "Incomplete Information" , JOptionPane.OK_OPTION);
                }

            }
            else if(e.getSource() == btnDelete)
            {
                String sql = "DELETE FROM `Cinema`.`tblUsers` WHERE (`userID` = '" + lblID.getText().trim() + "');";
                try {
                    Connection conn = Login_Form.getConnection();
                    Statement stm = conn.createStatement();
                    stm.execute(sql);
                } catch (Exception err){
                    System.out.println(err);
                }
            }
        }

    }


}
