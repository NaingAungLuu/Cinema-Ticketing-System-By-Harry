package java_class_test.Admin;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Admin_Manage_Movies_Edit_Show_Times {

    static JPanel content = new JPanel();
    static JFrame window  = new JFrame();
    static JButton btnSave = new JButton("Save");
    ButtonHandler buttons = new ButtonHandler();
    String showtimes[] = {"9:00am" , "11:30am" , "1.30pm" , "3:00pm" , "5:00pm" , "7:00pm"};

    public static void main(String[] arg)
    {
        Admin_Manage_Movies_Edit_Show_Times frmshowtimes = new Admin_Manage_Movies_Edit_Show_Times();
    }

    Admin_Manage_Movies_Edit_Show_Times()
    {
        //Constructor for JCheckBoxes
        int i = 0;
        for(String showtime : showtimes)
        {
            String text = "\t\t" + showtime;
            JCheckBox chk = new JCheckBox();
            chk.setName("chk" + i);
            chk.setBounds(50 , 16+(i*40) , text.length()*15 , 40);
            chk.setText(text);
            chk.setForeground(Color.white);
            chk.setFont(new Font("Arial" , Font.BOLD , 20));
            content.add(chk);
            i++;
        }

        //Constructor for Show times panel
        btnSave.setBounds(50 , 270 , 135 , 50);
        btnSave.setBackground(Color.decode("#FF6767"));
        btnSave.setForeground(Color.WHITE);
        btnSave.setContentAreaFilled(false);
        btnSave.setBorder(new LineBorder(Color.decode("#242B40") , 2));
        btnSave.setOpaque(true);
        btnSave.addActionListener(buttons);
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
        content.add(btnSave);


        //Constructor for Edit JFrame
        window.setContentPane(content);
        window.setSize(230 , 370);
        window.setLocation(450 , 300);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }

    public static class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnSave)
            {
                window.dispose();
                window.setAlwaysOnTop(false);
                Admin_Manage_Movies_Edit.window.setEnabled(true);
            }

        }
    }

}
