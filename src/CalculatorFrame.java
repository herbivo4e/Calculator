import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton button0 = new JButton("0");


    public CalculatorFrame(){
        panel.setBorder(BorderFactory.createEmptyBorder(80, 30, 10, 30));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setTitle("Calculator");
        frame.setBounds(200, 100, 350, 550);
        frame.setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello World!");
    }
}
