import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class Button {

    private JFrame frame;
    private JPanel panel;

    private JLabel label;
    private JLabel output;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button;

    public Button() {
        frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.orange);
        frame.add (panel);

        label = new JLabel();
        label.setText("Enter Numbers ");
        label.setForeground(Color.blue);

        output = new JLabel();
        output.setText("Sums total");

        textField1 = new JTextField(5);
        textField2 = new JTextField(5);

        button = new JButton("Add Them");

        panel.add(label);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(button);
        panel.add(output);

        frame.add(panel);

    }
    public void actionPerformed(ActiveEvent e){
        System.out.println(textField1.getText()+textField2.getText());
    }
}
