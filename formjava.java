import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

class INFORFORM {

public static void main(String[] args) {
    String[] selections = {"QUESTIONS", "REQUESTS", "INFORMATION", "INQUIERY", "PRESS","OTHER"};
    
    JComboBox comboX = new JComboBox(selections);
    
    JTextField NAME = new JTextField("WIRED2TECH");
    
    JTextField EMAIL = new JTextField("WIRED2TECH2@AOL.COM");
    
    JTextField QUESTION=new JTextField("CAN YOU WRITE AN ARTICLE ABOUT MY SCHOOL");
    
    JPanel panel = new JPanel(new GridLayout(12, 10,13,15));
    panel.setBorder(BorderFactory.createEmptyBorder(10,10,8,8));

    
    panel.add(comboX);
    
    panel.add(new JLabel("NAME:"));
    panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    panel.add(NAME);
    
    panel.add(new JLabel("EMAIL:"));
   panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    panel.add(EMAIL);
    
    panel.add(new JLabel("QUESTION:"));
    panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    panel.add(QUESTION);
   
   int result = JOptionPane.showConfirmDialog(null, panel, "RUN",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
        System.out.println(comboX.getSelectedItem()
            + " " + NAME.getText()
            + " " + EMAIL.getText());
    } else {
        System.out.println("Operation Cancelled!?");
    }
}
}