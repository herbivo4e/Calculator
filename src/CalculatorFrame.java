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
    private final JButton[] numberButtons = {button0, button1, button2, button3, button4, button5, button6, button7, button8, button9};
    private final JButton[] operationButtons = {buttonC, buttonCE, buttonEquals, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonPercent, buttonUndo, buttonChangeSign, buttonDecimalDot, buttonSqrt, buttonSquare, buttonFlip};
    private final JButton[] orderedButtons = {buttonPercent, buttonCE, buttonC, buttonUndo, button7, button8, button9, buttonDivide, button4, button5, button6, buttonMultiply, button1, button2, button3, buttonAdd, buttonSubtract, buttonDecimalDot, button0, buttonChangeSign, buttonAdd, buttonSqrt, buttonSquare, buttonFlip, buttonEquals};
    double firstNumber = 0;
    double secondNumber = 0;
    char operator = ' ';
    boolean secondNumberIsBeingTyped = false;

    public CalculatorFrame() {
        panel.setBorder(BorderFactory.createEmptyBorder(40, 30, 10, 30));
        panel.setBackground(Color.BLUE);
        for (JButton b : orderedButtons) {
            panel.add(b);
            b.setFont(buttonFont);
            b.setBackground(Color.CYAN);
        }
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
        display.setText("0");
        for (JButton b : numberButtons) {
            b.addActionListener(this);
        }
        for (JButton b : operationButtons) {
            b.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Character.isDigit(e.getActionCommand().charAt(0))) {
            if (secondNumberIsBeingTyped || display.getText().equals("0")) {
                display.setText(e.getActionCommand());
                secondNumberIsBeingTyped = false;
            } else {
                display.setText(display.getText() + e.getActionCommand());
            }
        } else {

            if (e.getActionCommand().equals("+") || e.getActionCommand().equals("-") || e.getActionCommand().equals("*") || e.getActionCommand().equals(":")) {
                secondNumberIsBeingTyped = true;
                operator = e.getActionCommand().charAt(0);
                firstNumber = Double.parseDouble(display.getText());
            } else if (e.getActionCommand().equals("=")) {
                secondNumber = Double.parseDouble(display.getText());
                secondNumberIsBeingTyped = true;
                switch (operator) {
                    case '+':
                        display.setText(String.valueOf(firstNumber + secondNumber));
                        break;
                    case '-':
                        display.setText(String.valueOf(firstNumber - secondNumber));
                        break;
                    case '*':
                        display.setText(String.valueOf(firstNumber * secondNumber));
                        break;
                    case ':':
                        display.setText(String.valueOf(firstNumber / secondNumber));
                        break;
                }
            } else if (e.getActionCommand().equals("CE")) {
                secondNumberIsBeingTyped = true;
                display.setText("0");
            } else if (e.getActionCommand().equals("C")) {
                firstNumber = 0;
                operator = ' ';
                display.setText("0");
                secondNumberIsBeingTyped = false;
            } else if (e.getActionCommand().equals("⌫")) {
                if (display.getText().length() != 1) {
                    display.setText(display.getText().substring(0, display.getText().length() - 1));
                } else {
                    display.setText("0");
                }
            } else if (e.getActionCommand().equals("√x")) {
                display.setText(String.valueOf(Math.sqrt(Double.parseDouble(display.getText()))));
            } else if (e.getActionCommand().equals("x²")) {
                display.setText(String.valueOf(Math.pow(Double.parseDouble(display.getText()), 2)));
            } else if (e.getActionCommand().equals("x⁻¹")) {
                display.setText(String.valueOf(1 / Double.parseDouble(display.getText())));
            } else if (e.getActionCommand().equals("+/-")) {
                display.setText(String.valueOf(-1 * Double.parseDouble(display.getText())));
            } else if (e.getActionCommand().equals(".") && !display.getText().contains(".")) {
                display.setText(display.getText() + ".");
            }

        }
    }
}

