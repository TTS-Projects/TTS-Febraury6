package ExceptionsAndErrors;

import java.util.InputMismatchException;
import java.util.Scanner;

//public class Main {
//  public static void main(String[] args) {
//    int x = 100;
//    int y = 0;
//    System.out.println(divide(x, y));
//  }
//
//  private static int divide(int x, int y) {
//    return x / y;
//  } 
//  // Throws an ArithmeticException because
//  // you can't divide any number by zero
//}

//package com.tts
//public class Main {
//  public static void main(String[] args) {
//    int x = 100;
//    int y = 0;
//    System.out.println(divideLBYL(x, y));
//    System.out.println(divideEAFP(x, y));
//  }
//
//  private static int divideLBYL(int x, int y) {
//    if(y != 0) {
//      return x / y;
//    } else {
//      return 0;
//    }
//  }
//
//  private static int divideEAFP(int x, int y) {
//    try {
//      return x / y;
//    } catch(ArithmeticException e) {
//      return 0;
//    }
//  }
//}

//
//import java.util.Scanner;
//
//public class Main {
//  public static void main(String[] args) {
//    int x = getInt();
//    System.out.println("x is " + x);
//  }
//
//  public static int getInt() {
//    Scanner s = new Scanner(System.in);
//    return s.nextInt();
//  }
//}
//
//public class Main {
//  public static void main(String[] args) {
//    int x = getIntLBYL();
//    System.out.println("x is " + x);
//  }
//
//  public static int getIntLBYL() {
//    Scanner s = new Scanner(System.in);
//    boolean isValid = true;
//    System.out.println("Please enter a number.");
//    String input = s.next();
//    for(int i=0; i<input.length(); i++) {
//      if(!Character.isDigit(input.charAt(i))) {
//        isValid = false;
//        break;
//      }
//    }
//    if(isValid) {
//      return Integer.parseInt(input);
//    }
//    return 0;
//  }
//}

public class Main {
  public static void main(String[] args) {
    int x = getIntEAFP();
    System.out.println("x is " + x);
  }

  public static int getIntEAFP() {
    Scanner s = new Scanner(System.in);
    System.out.println("Please enter a number.");
    try {
      return s.nextInt();
    } catch(InputMismatchException e) {
      return 0;
    }
  }
}