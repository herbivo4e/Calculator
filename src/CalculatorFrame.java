import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame implements ActionListener {
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel(new GridLayout(6, 4));
    private final JPanel displayPanel = new JPanel(new BorderLayout());
    private final JTextField display = new JTextField();
    private final Font displayFont = new Font("SansSerif", Font.BOLD, 40);
    private final Font buttonFont = new Font("SansSerif", Font.BOLD, 20);
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
    private final JButton buttonMultiply = new JButton("*");
    private final JButton buttonDivide = new JButton(":");
    private final JButton buttonPercent = new JButton("%");
    private final JButton buttonUndo = new JButton("⌫");
    private final JButton buttonChangeSign = new JButton("+/-");
    private final JButton buttonDecimalDot = new JButton(".");
    private final JButton buttonSqrt = new JButton("√x");
    private final JButton buttonSquare = new JButton("x²");
    private final JButton buttonFlip = new JButton("x⁻¹");

    public CalculatorFrame() {
        panel.setBorder(BorderFactory.createEmptyBorder(40, 30, 10, 30));
        panel.setBackground(Color.BLUE);
        panel.add(buttonPercent);
        panel.add(buttonCE);
        panel.add(buttonC);
        panel.add(buttonUndo);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivide);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMultiply);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonAdd);
        panel.add(buttonSubtract);
        panel.add(buttonDecimalDot);
        panel.add(button0);
        panel.add(buttonChangeSign);
        panel.add(buttonSqrt);
        panel.add(buttonSquare);
        panel.add(buttonFlip);
        panel.add(buttonEquals);
        button1.setBackground(Color.CYAN);
        button2.setBackground(Color.CYAN);
        button3.setBackground(Color.CYAN);
        button4.setBackground(Color.CYAN);
        button5.setBackground(Color.CYAN);
        button6.setBackground(Color.CYAN);
        button7.setBackground(Color.CYAN);
        button8.setBackground(Color.CYAN);
        button9.setBackground(Color.CYAN);
        button0.setBackground(Color.CYAN);
        buttonC.setBackground(Color.CYAN);
        buttonCE.setBackground(Color.CYAN);
        buttonEquals.setBackground(Color.CYAN);
        buttonAdd.setBackground(Color.CYAN);
        buttonSubtract.setBackground(Color.CYAN);
        buttonPercent.setBackground(Color.CYAN);
        buttonUndo.setBackground(Color.CYAN);
        buttonChangeSign.setBackground(Color.CYAN);
        buttonDecimalDot.setBackground(Color.CYAN);
        buttonDivide.setBackground(Color.CYAN);
        buttonMultiply.setBackground(Color.CYAN);
        buttonSqrt.setBackground(Color.CYAN);
        buttonSquare.setBackground(Color.CYAN);
        buttonFlip.setBackground(Color.CYAN);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setTitle("Calculator");
        frame.setBounds(200, 100, 350, 550);
        frame.setResizable(false);
        frame.add(displayPanel, BorderLayout.NORTH);
        display.setBackground(Color.GRAY);
        displayPanel.add(display);
        display.setFont(displayFont);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello World!");
    }
}
