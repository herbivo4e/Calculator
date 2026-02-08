import javax.swing.*;
import java.awt.*;

public class CalculatorFrame {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();


    public CalculatorFrame(){
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setTitle("Calculator");
        frame.setBounds(200, 100, 350, 550);
        frame.setResizable(false);
    }
}
