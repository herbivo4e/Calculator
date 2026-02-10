import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame implements ActionListener {
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();
    private final JButton button1 = new JButton("1");
    private final JButton button2 = new JButton("2");
    private final JButton button3 = new JButton("3");
    private final JButton button4 = new JButton("4");
    private final JButton button5 = new JButton("5");
    private final JButton button6 = new JButton("6");
    private final JButton button7 = new JButton("7");
    private final JButton button8 = new JButton("8");
    private final JButton button9 = new JButton("9");
    private final JButton button0 = new JButton("0");
    private final JButton buttonC = new JButton("C");
    private final JButton buttonCE = new JButton("CE");
    private final JButton buttonEquals = new JButton("=");
    private final JButton buttonAdd = new JButton("+");
    private final JButton buttonSubtract = new JButton("-");
    private final JButton buttonPercent = new JButton("%");
    private final JButton buttonUndo = new JButton("⌫");
    private final JButton buttonChangeSign = new JButton("+/-");
    private final JButton buttonDecimalDot = new JButton(".");

    public CalculatorFrame(){
        panel.setBorder(BorderFactory.createEmptyBorder(80, 30, 10, 30));
        panel.setBackground(Color.BLUE);
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
        panel.add(buttonC);
        panel.add(buttonEquals);
        panel.add(buttonAdd);
        panel.add(buttonSubtract);
        panel.add(buttonCE);
        panel.add(buttonPercent);
        panel.add(buttonUndo);
        panel.add(buttonChangeSign);
        panel.add(buttonDecimalDot);
        button1.setBackground(Color.CYAN);
        button1.setPreferredSize(new Dimension(60, 60));
        button2.setBackground(Color.CYAN);
        button2.setPreferredSize(new Dimension(60, 60));
        button3.setBackground(Color.CYAN);
        button3.setPreferredSize(new Dimension(60, 60));
        button4.setBackground(Color.CYAN);
        button4.setPreferredSize(new Dimension(60, 60));
        button5.setBackground(Color.CYAN);
        button5.setPreferredSize(new Dimension(60, 60));
        button6.setBackground(Color.CYAN);
        button6.setPreferredSize(new Dimension(60, 60));
        button7.setBackground(Color.CYAN);
        button7.setPreferredSize(new Dimension(60, 60));
        button8.setBackground(Color.CYAN);
        button8.setPreferredSize(new Dimension(60, 60));
        button9.setBackground(Color.CYAN);
        button9.setPreferredSize(new Dimension(60, 60));
        button0.setBackground(Color.CYAN);
        button0.setPreferredSize(new Dimension(60, 60));
        buttonC.setBackground(Color.CYAN);
        buttonC.setPreferredSize(new Dimension(60, 60));
        buttonCE.setBackground(Color.CYAN);
        buttonCE.setPreferredSize(new Dimension(60, 60));
        buttonEquals.setBackground(Color.CYAN);
        buttonEquals.setPreferredSize(new Dimension(60, 60));
        buttonAdd.setBackground(Color.CYAN);
        buttonAdd.setPreferredSize(new Dimension(60, 60));
        buttonSubtract.setBackground(Color.CYAN);
        buttonSubtract.setPreferredSize(new Dimension(60, 60));
        buttonPercent.setBackground(Color.CYAN);
        buttonPercent.setPreferredSize(new Dimension(60, 60));
        buttonUndo.setBackground(Color.CYAN);
        buttonUndo.setPreferredSize(new Dimension(60, 60));
        buttonChangeSign.setBackground(Color.CYAN);
        buttonChangeSign.setPreferredSize(new Dimension(60, 60));
        buttonDecimalDot.setBackground(Color.CYAN);
        buttonDecimalDot.setPreferredSize(new Dimension(60, 60));
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
