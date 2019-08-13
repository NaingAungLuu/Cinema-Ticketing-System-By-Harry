package java_class_test;

import java_class_test.Sales.Sales_Tickets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIHandler implements ActionListener {

    public static final String LAUNCH_LOGIN_GUI = "LAUNCH_GUI";

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(LAUNCH_LOGIN_GUI)) {
            GUI.show(GUI.LOGIN);
        }
    }

}
