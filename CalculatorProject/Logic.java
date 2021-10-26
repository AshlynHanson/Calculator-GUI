package com.calculatorproject;

/**
 * Implements the logic of a calculator
 * @author Ashlyn Hanson
 */
public class Logic {
    /**
     * Calculates the answer to the provided math question.
     * Iterates through the provided text to determine the operator
     * and numbers and runs that operation.
     * @param text the information entered into the calculator
     * @return the String of calculated information
     */
    public static String calculate(String text) {
        String num1 = "";
        String num2 = "";
        String operation = "";

        for (int index = 0; index < text.length(); index ++) {
            if (text.charAt(index) >= '0' && text.charAt(index) <= '9' ||
                    text.charAt(index) == '.') {
                if (operation.isEmpty()) {
                    num1 += text.charAt(index);
                } else {
                    num2 += text.charAt(index);
                }
            }

            if (text.charAt(index) == '+' || text.charAt(index) == '-' ||
                    text.charAt(index) == '/' || text.charAt(index) == '*') {
                operation += text.charAt(index);
            }
        }
        return math(num1, num2, operation);
    }

    /**
     * Calculates the math in the text entered into the calculator
     * @param num1 the first number entered
     * @param num2 the second number entered
     * @param operation the operation to be run based on the given operator
     * @return the String of text to be displayed on the calculator
     */
    private static String math(String num1, String num2, String operation) {
        double result = 0;

        if (operation.equals("+")) {
            result = add(num1, num2);
        }
        else if (operation.equals("-")) {
            result = subtract(num1, num2);
        }
        else if (operation.equals("*")) {
            result = multiply(num1, num2);
        }
        else if (operation.equals("/")) {
            result = divide(num1, num2);
        }
        return num1 + operation + num2 + " = " + result;
    }

    /**
     * Adds the two numbers together
     * @param num1 the first number to be added
     * @param num2 the second number to be added
     * @return the sum of the two numbers
     */
    private static double add(String num1, String num2) {
        return (Double.parseDouble(num1)) + (Double.parseDouble(num2));
    }

    /**
     * Performs the subtraction of one number from another
     * @param num1 the first number to subtract from
     * @param num2 the number to subtract
     * @return the resulting number after the subtraction
     */
    private static double subtract(String num1, String num2) {
        return (Double.parseDouble(num1)) - (Double.parseDouble(num2));
    }

    /**
     * Multiplies two numbers together
     * @param num1 the first number to multiply
     * @param num2 the second number to multiply
     * @return the product of the two numbers
     */
    private static double multiply(String num1, String num2) {
        return (Double.parseDouble(num1)) * (Double.parseDouble(num2));
    }

    /**
     * Divide two numbers
     * @param num1 the dividend
     * @param num2 the divisor
     * @return the quotient
     */
    private static double divide(String num1, String num2) {
        return (Double.parseDouble(num1)) / (Double.parseDouble(num2));
    }

    /**
     * Deleted individual characters from the entered text.
     * Performs the backspace functionality.
     * @param text the entered tect
     * @return the entered text minus the last character
     */
    public static String delete(String text) {
        String newText = "";
        for (int index = 0; index < text.length(); index++) {
            if (index != text.length() - 1) {
                newText += text.charAt(index);
            }
        }
        return newText;
    }

    /**
     * Performs the square root function on a number
     * @param text the given text
     * @return the square root of an entered number
     */
    public static String sqrt(String text) {
        double num;
        num = Double.parseDouble(text);
        num = Math.sqrt(num);
        return text + "sqrt" + " = " + num;
    }
}
