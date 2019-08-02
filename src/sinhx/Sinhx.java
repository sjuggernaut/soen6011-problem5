package sinhx;

import java.lang.NumberFormatException;
import java.util.Scanner;

/**
 * Class to calculate the value of Sinhx.
 * 
 * @author Sivaji Ganesh Chundu.
 */
public class Sinhx {
  /**
   * Main Method.
   * 
   * @param args array of arguments.
   */
  public static void main(String[] args) {
    double input = readInput();
    double result = calculationOfSinhx(input);
    System.out.println(result);
  }

  /**
   * This function will display a message saying the user to enter the value of x to calculate
   * sinhx. This function also allows user to enter correct value as many times as possible, when an
   * non numeric value is entered by the user.
   * 
   * @return Numeric value given by the user.
   */
  public static double readInput() {
    double input = 0.0;
    System.out.println("Enter value of x to compute sinhx");
    while (true) {
      String s = readInputFromConsole();
      if (s != null) {
        input = Double.parseDouble(s);
        break;
      }
    }
    return input;
  }

  /**
   * This function simply reads the input from the user and pass it to another function which checks
   * whether the entered number is numeric or not.
   * 
   * @return The input value which was given by user from the console.
   */
  public static String readInputFromConsole() {
    @SuppressWarnings("resource")
    Scanner x = new Scanner(System.in);
    String inp = x.nextLine();
    String input = readInputUntillNumFound(inp);
    return input;
  }

  /**
   * This function makes the application user friendly by displaying a message if the user wrongly
   * enters a non numeric value.
   * 
   * @param inp entered by the user.
   * @return Null in case if the user enters non numeric value and returns input by the user if he,
   *         enters numeric value.
   */
  public static String readInputUntillNumFound(String inp) {
    String input1 = inp;
    try {
      Double.parseDouble(input1);
    } catch (NumberFormatException e) {
      System.out
          .println("Please input value of x in the range of" + " minus infinity to plus infinity");
      return null;
    }
    return input1;
  }


  /**
   * Calculate the value of Sinhx for given input value. Since Sinh(x) = Sinh(-x), the sinhx is
   * calculated only for values of positive x. If the user inputs a negative value, the value of
   * sinhx is calculated by converting it to, positive value.
   * 
   * @param inp is the value of input for which Sinhx is caluculated.
   * @return value of Sinhx.
   */
  public static double calculationOfSinhx(double inp) {
    double posInp = 0.0;
    if (inp < 0) {
      posInp = -inp;
    } else {
      posInp = inp;
    }
    int factorialInc = 3;
    double sinhx = 0.0;
    double multiplier = posInp;
    while (posInp > 1E-16) {
      sinhx += posInp;
      posInp = posInp * multiplier * multiplier;
      posInp /= (factorialInc * (factorialInc - 1));
      factorialInc = factorialInc + 2;
    }
    if (inp < 0) {
      return 0 - sinhx;
    } else {
      return sinhx;
    }
  }
}

