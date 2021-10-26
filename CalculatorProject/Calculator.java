package com.calculatorproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * This class represents a Calculator.
 * It extends JFrame and implements ActionListener.
 * This calculator can handle binary operations.
 * @author Ashlyn Hanson
 */
public class Calculator extends JFrame implements ActionListener {
    private final int TOTAL = 19;
    private final int COLS = 5;
    private final int ROWS = 4;
    private final JButton buttons[] = new JButton[TOTAL];
    private final String captions[] = {
            "1","2","3","+","<-",
            "4","5","6","-","sqrt",
            "7","8","9","/","=",
            ".","0","AC","*"
    };
    private final JPanel buttonPanel = new JPanel(new GridLayout(ROWS, COLS));
    private final JTextField output = new JTextField(TOTAL);
    private final Container frame;

    /**
     * Creates an instance of a Calculator object.
     * Sets up the JFrame and adds an ActionListener to
     * each button.
     */
    public Calculator()
    {
        this.frame = getContentPane();
        for (int count=0;count<TOTAL;count++)
        {
            this.buttons[count] = new JButton(this.captions[count]);
            this.buttonPanel.add(this.buttons[count]);
        }
        this.frame.setLayout(new BorderLayout());
        this.frame.add(this.output,BorderLayout.NORTH);
        this.frame.add(this.buttonPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        for (JButton button : this.buttons) {
            button.addActionListener(this);
        }
    }

    /**
     * Performs some function whenever a button has been clicked
     * @param e an ActionEvent of some button that has been clicked
     */
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        if (action.charAt(0) == 'A' && action.charAt(1) == 'C') {
            this.output.setText("");
        }
        else if (action.charAt(0) == '=') {
            this.output.setText(Logic.calculate(this.output.getText()));
        }
        else if (action.charAt(0) == '<' && action.charAt(1) == '-') {
            this.output.setText(Logic.delete(this.output.getText()));
        }
        else if (action.charAt(0) == 's' && action.charAt(1) == 'q' &&
                 action.charAt(2) == 'r' && action.charAt(3) == 't') {
            this.output.setText(Logic.sqrt(this.output.getText()));
        }
        else {
           this. output.setText(this.output.getText() + action);
        }
    }

    /**
     * Creates a calculator object.
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
    }
}
