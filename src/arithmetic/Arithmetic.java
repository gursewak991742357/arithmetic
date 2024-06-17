/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code and check the output
 * @author 
 */
public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        double n = 10.0;
        double m = 5.0;

        // Perform all operations
        double resultAdd = r.calculate(n, m, Operation.PLUS);
        double resultSubtract = r.calculate(n, m, Operation.MINUS);
        double resultMultiply = r.calculate(n, m, Operation.TIMES);
        double resultDivide = r.calculate(n, m, Operation.DIVIDE);

        // Print results
        System.out.println("Addition Result: " + resultAdd);
        System.out.println("Subtraction Result: " + resultSubtract);
        System.out.println("Multiplication Result: " + resultMultiply);
        System.out.println("Division Result: " + resultDivide);
    }
}
