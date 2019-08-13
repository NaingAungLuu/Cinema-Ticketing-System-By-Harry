package java_class_test.Sales;
import java_class_test.Admin.Admin_Manage_Seat_Plan;
import java_class_test.GUIHandler;
import java_class_test.Login_Form;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Sales_Seats extends JPanel{

    public static JFrame window = new JFrame("Seats");
    public static JButton btnLogOut = new JButton("Log Out");
    public static JButton btnTickets = new JButton("Tickets");
    public static ArrayList<JButton> Seats = new ArrayList<>();
    public static ButtonHandler buttons = new ButtonHandler();
    public static JPanel content = new JPanel();
    public static void main(String[]args)
    {
        Sales_Seats adHome = new Sales_Seats(1 , true);
    }
    public Sales_Seats(int MovieNo , boolean is3D)
    {
        //Constructor for JComboBoxes
        JComboBox<String> cboMovieTime = new JComboBox<>();
        String[] MovieTimes = {"9:00am" , "11:30am" , "1.30pm" , "3:00pm", "5:00pm" , "7:00pm"};
        for(int i = 0 ; i < MovieTimes.length ; i++)
        {
            cboMovieTime.addItem(MovieTimes[i]);
        }
        cboMovieTime.setSelectedIndex(0);
        cboMovieTime.setBounds(950 , 85 , 100 , 30);


        //Constructor for JLabels
        //Admin_main label
        JLabel lblUser_name = new JLabel("Naing Aung Luu");
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

        //Movie Name Label
        JLabel lblMovieName = new JLabel();
        lblMovieName.setFont(new Font("DIN Alternate" , Font.PLAIN , 24));
        switch(MovieNo)
        {
            case 1 : lblMovieName.setText("Aquaman");break;
            case 2 : lblMovieName.setText("Oh My Ghost");break;
            case 3 : lblMovieName.setText("How To Train Your Dragon");break;
            default: lblMovieName.setText("Unknown Movie Name");
        }lblMovieName.setBounds( 300 , 30 , 500 , 30);

        lblMovieName.setForeground(Color.white);

        //Theatre No Label
        JLabel lblTheatreNo = new JLabel("Theatre " + MovieNo);
        lblTheatreNo.setBounds(580 , 60 , 250 , 30);
        lblTheatreNo.setFont(new Font("DIN Alternate" , Font.PLAIN , 24));
        lblTheatreNo.setForeground(Color.decode("#4FF0EA"));

        //Movie Type Label
        JLabel lblMovieType = new JLabel();
        if(is3D)
        {
            lblMovieType.setText("3D");
        }
        else
        {
            lblMovieType.setText("2D");
        }
        lblMovieType.setBounds(980 , 60 , 100 , 30);
        lblMovieType.setFont(new Font("DIN Alternate" , Font.PLAIN , 24));
        lblMovieType.setForeground(Color.decode("#4FF0EA"));
        //Constructor for Screen Label
        JPanel pnlScreen = new JPanel();
        pnlScreen.setBounds(360 , 120 , 612 , 25);
        pnlScreen.setBackground(Color.decode("#242B40"));
        pnlScreen.setBorder(new LineBorder(Color.decode("#8CF8F4") , 2));
        JLabel lblScreen = new JLabel("Screen");
        lblScreen.setFont(new Font("DIN Alternate" ,Font.PLAIN , 15));
        lblScreen.setForeground(Color.white);
        lblScreen.setBounds(0 , 0 , 100 , 20);
        pnlScreen.add(lblScreen);

        //Constructor for Seat Plan Button Array
        int button_width = 60;
        int button_height = 35;
        int button_gap = 10;
        JPanel pnlSeats = new JPanel();
        pnlSeats.setLayout(null);
        pnlSeats.setBounds(260 , 160 , (button_width*12)+(11*button_gap), 400);
        pnlSeats.setBackground(Color.decode("#242B40"));


        String[] btnIndex = {"A" , "B" ,"C" , "D" , "E" , "F" , "G" , "H" , "S"};
        String[] btnColorCodes = {"#FF6767" , "#67FF9C" , "#6796FF" , "#FFF367"};

        for(int i =  0 ; i < 9 ; i++)
        {

            for(int j = 0 ; j < 12 ; j++ )
            {
                Seats.add(new JButton());
                Seats.get((i*12)+j).setName("btn" +btnIndex[i] + (j+1));
                Seats.get((i*12)+j).setText(btnIndex[i] + (j+1));
                if(i<8)
                {
                    Seats.get((i * 12) + j).setBounds((j * (button_width + button_gap)), i * (button_height + button_gap), button_width, button_height);
                }
                else if(i==8)
                {
                    Seats.get((i * 12) + j).setBounds((j * (((2*button_width) +button_gap)+ button_gap)), i * (button_height + button_gap), (button_width*2)+button_gap, button_height);
                }
                if(i==8 && j==5)
                {
                    Seats.get((i*12)+j).setBorder(new LineBorder(Color.decode(btnColorCodes[3]) , 2));
                    Seats.get((i*12)+j).setBackground(Color.decode("#242B40"));
                    Seats.get((i*12)+j).setForeground(Color.white);
                    Seats.get((i*12) +j).setFont(new Font("DIN Alternate" , Font.PLAIN , 16));
                    Seats.get((i*12)+j).setContentAreaFilled(false);
                    Seats.get((i*12)+j).setOpaque(true);
                    pnlSeats.add(Seats.get((i*12)+j));
                    break;
                }
                Seats.get((i*12)+j).setBackground(Color.decode("#242B40"));
                if(i<2)
                {
                    Seats.get((i * 12) + j).setBorder(new LineBorder(Color.decode(btnColorCodes[0]) ,2));
                }
                else if(i<6 && i>1)
                {
                    Seats.get((i * 12) + j).setBorder(new LineBorder(Color.decode(btnColorCodes[1]), 2));
                }
                else if(i<8 && i >5)
                {
                    Seats.get((i * 12) + j).setBorder(new LineBorder(Color.decode(btnColorCodes[2]) , 2));
                }
                else
                {
                    Seats.get((i * 12) + j).setBorder(new LineBorder(Color.decode(btnColorCodes[3]) , 2));
                }

                Seats.get((i*12)+j).setForeground(Color.white);
                Seats.get((i*12)+j).setFont(new Font("DIN Alternate" , Font.PLAIN , 16));
                Seats.get((i*12)+j).setContentAreaFilled(false);
                Seats.get((i*12)+j).setOpaque(true);
                pnlSeats.add(Seats.get((i*12)+j));

            }

        }
        for (JButton btn : Seats)
        {
            btn.setSelected(false);

            btn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    String buttonName = btn.getName();
                    boolean isClicked = false;
                    if(!ButtonClicked.isClicked)
                    {
                        btn.setBackground(Color.white);
                        btn.setForeground(Color.decode("#242B40"));
                        ButtonClicked.isClicked = true;
                        lblMovieType.setText(buttonName);
                       // SelectedSeats.add(Seats.indexOf(btn));
                    }
                    else if(ButtonClicked.isClicked)
                    {
                        btn.setBackground(Color.decode("#242B40"));
                        btn.setForeground(Color.white);
                        ButtonClicked.isClicked = false;
                        lblMovieType.setText("3D");
                        //SelectedSeats.remove(SelectedSeats.indexOf(btn));

                    }

                }
            });

        }

        //Cinema Name Label
        JLabel lblCinemaname = new JLabel("Galaxy");
        lblCinemaname.setForeground(Color.decode("#FF6767"));
        lblCinemaname.setBounds(1000 , 620 , 200 , 50);
        lblCinemaname.setFont(new Font("Rockwell" , Font.PLAIN , 18));
        JLabel lblCinemaname1 = new JLabel("Cinemas");
        lblCinemaname1.setForeground(Color.decode("#E3E3E3"));
        lblCinemaname1.setBounds(1080 , 620 , 200 , 50);
        lblCinemaname1.setFont(new Font("Rockwell" , Font.PLAIN , 18));

        //Constructor for Ticket Price Labels
        JPanel pnlTicketPrice = new JPanel();
        pnlTicketPrice.setLayout(null);
        pnlTicketPrice.setBackground(Color.decode("#242B40"));
        pnlTicketPrice.setBounds(0 , (button_gap*11)+(button_height*9) , (button_width*10)+(button_gap*9) , (button_height*2)+(2*button_gap));
        pnlSeats.add(pnlTicketPrice);
        //Class C Seat Price Label
        JLabel lblClassC = new JLabel();
        lblClassC.setText(Admin_Manage_Seat_Plan.txtClassC.getText() + " Ks");
        lblClassC.setBounds(0 , 0 , (button_width*2)+button_gap , button_height );
        lblClassC.setForeground(Color.white);
        lblClassC.setBorder(new LineBorder(Color.decode(btnColorCodes[0]) , 2));
        lblClassC.setHorizontalAlignment(JLabel.CENTER);
        lblClassC.setFont(new Font("DIN Alternate" , Font.PLAIN , 20));
        pnlTicketPrice.add(lblClassC);
        //Class B Seat Price Label
        JLabel lblClassB = new JLabel();
        lblClassB.setText(Admin_Manage_Seat_Plan.txtClassB.getText() + " Ks");
        lblClassB.setBounds((button_width*2)+(2*button_gap) , 0 , (button_width*2) + button_gap , button_height);
        lblClassB.setForeground(Color.white);
        lblClassB.setBorder(new LineBorder(Color.decode(btnColorCodes[1]) , 2));
        lblClassB.setHorizontalAlignment(JLabel.CENTER);
        lblClassB.setFont(new Font("DIN Alternate" , Font.PLAIN , 20));
        pnlTicketPrice.add(lblClassB);
        //Classs A Ticket Price
        JLabel lblClassA = new JLabel();
        lblClassA.setText(Admin_Manage_Seat_Plan.txtClassA.getText() + " Ks");
        lblClassA.setBounds((button_width*4) + (4*button_gap) ,  0 , (button_width*2) + button_gap ,button_height);
        lblClassA.setForeground(Color.white);
        lblClassA.setHorizontalAlignment(JLabel.CENTER);
        lblClassA.setBorder(new LineBorder(Color.decode(btnColorCodes[2]) , 2));
        lblClassA.setFont(new Font("DIN Alternate" , Font.PLAIN , 20));
        pnlTicketPrice.add(lblClassA);
        //Classs A Ticket Price
        JLabel lblClassS = new JLabel();
        lblClassS.setText(Admin_Manage_Seat_Plan.txtCoupleSeat.getText() + " Ks");
        lblClassS.setBounds((button_width*6) + (6*button_gap) ,  0 , (button_width*2) + button_gap ,button_height);
        lblClassS.setForeground(Color.white);
        lblClassS.setBorder(new LineBorder(Color.decode(btnColorCodes[3]) , 2));
        lblClassS.setHorizontalAlignment(JLabel.CENTER);
        lblClassS.setFont(new Font("DIN Alternate" , Font.PLAIN , 20));
        pnlTicketPrice.add(lblClassS);

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
        btnLogOut.setBorder(new LineBorder(Color.decode("#FF6767") , 2));
        btnLogOut.setBounds(1080 , 40 , 90, 40);
        btnLogOut.setHorizontalAlignment(SwingConstants.CENTER);
        btnLogOut.addActionListener(buttons);

        //Constructor for Check Out Button
        JButton btnCheckOut = new JButton("Check Out");
        btnCheckOut.setBounds( Seats.get(101).getX(), Seats.get(101).getY()+button_height+button_gap, Seats.get(101).getWidth() , 50);
        btnCheckOut.setBackground(Color.decode("#FF6767"));
        btnCheckOut.setForeground(Color.white);
        btnCheckOut.setFont(new Font("Nadeem" , Font.BOLD , 16));
        btnCheckOut.setContentAreaFilled(false);
        btnCheckOut.setBorder(new LineBorder(Color.decode("#242B40") , 2));
        btnCheckOut.setOpaque(true);
        btnCheckOut.addActionListener(buttons);
        btnCheckOut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                btnCheckOut.setBackground(Color.white);
                btnCheckOut.setForeground(Color.decode("#FF6767"));
            }
        });
        btnCheckOut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                btnCheckOut.setBackground(Color.decode("#FF6767"));
                btnCheckOut.setForeground(Color.white);
            }
        });


        //Constructor for JPanel

        setLayout(null);
        setBackground(Color.decode("#242B40"));
        add(pnlUserName);
        add(btnTickets);
        add(lblCinemaname1);
        add(lblCinemaname);
        add(lblMovieName);
        add(btnLogOut);
        add(lblTheatreNo);
        add(lblMovieType);
        add(cboMovieTime);
        add(pnlScreen);
        add(pnlSeats);
        pnlSeats.add(btnCheckOut);

        //Constructor for JFrame
        Toolkit toolkit =  Toolkit.getDefaultToolkit ();
        Dimension dim = toolkit.getScreenSize();
        pnlSeats.setSize(dim.width , dim.height);

    }

    public static class ButtonClicked extends JButton
    {
        public static boolean isClicked = false;
    }
    public static class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnLogOut)
            {
                Sales_Seats.window.dispose();
                Login_Form frmLogin = new Login_Form();
            }
            else if(e.getSource() == btnTickets)
            {
                Sales_Seats.window.dispose();
                Sales_Tickets frmSalesTickets= new Sales_Tickets();
            }
            //else if(e.getSource() == btnManageSeatPlan)
        }
    }


}
