package com.mycompany.myapp.calcul;

public class Calcul {

  public static String operate(String operation){
    String[] elements = operation.split(" ");

    int number1 = Integer.parseInt(elements[0]);
    int number2 = Integer.parseInt(elements[1]);
    String operator = elements[2];

    switch(operator){
      case "+":
        return add(number1, number2);
      case "-":
        return subtraction(number1, number2);
      case "*":
        return multiplication(number1, number2);
      case "/":
        return division(number1, number2);
    }
    return "";
  }

  private static String add(int number1, int number2){
    int result = number1 + number2;
    return Integer.toString(result);
  }

  private static String subtraction(int number1, int number2) {
    int result = number1 - number2;
    return Integer.toString(result);
  }

  private static String multiplication(int number1, int number2) {
    int result = number1 * number2;
    return Integer.toString(result);
  }

  private static String division(int number1, int number2) {
    int result = number1 / number2;
    return Integer.toString(result);
  }

}
