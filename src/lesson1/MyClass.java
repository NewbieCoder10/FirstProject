package lesson1;

import java.util.Scanner;

public class MyClass {
   /*

   ***** Variables & types in Java *****

   byte (number, 1 byte)
   short (number, 2 bytes)
   int (number, 4 bytes)
   long (number, 8 bytes)
   float (float number, 4 bytes)
   double ( float number, 8 bytes)
   char (a character, 2 bytes)
   boolean (true or false, 1 byte)

  public static void main(String[] args) {
     short my_variable = 10;
     float my_decimal = (float)4.5;
     double my_double = 11.56;
     char my_char = 'A';
     boolean is_true = false;
    System.out.println(my_variable);
    System.out.println(my_decimal);
    System.out.println(my_double);
    System.out.println(my_char);
    System.out.println(is_true);
  }

  ***** Getting User input *****

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter some string");
    String user_input_string = scan.nextLine();

    System.out.println("The entered string is");
    System.out.print(user_input_string);
  }

    ***** Math & arithmetic Operators in Java *****

   public static void main(String[] args) {
     int x , y , answer;
     x = 70;
     y = 30;
     answer = x / y;

     System.out.println("Answer = " + answer);
   }


   public static void main(String[] args) {
     int x = 10;
     x /= 5;
     System.out.println(x);
   }


   if (boolean_expression)
  {
    execute if the boolean expression is true
  }

    ***** Operators *****

   == is equal to
   != is not equal to
   > is greater than
   < is less than
   >= is greater than or equal to
   <= is less than or equal to

    ***** IF ... Else Statements  (Conditions) *****

   public static void main(String[] args) {
     int x = 10;

     if (x == 50) {
       System.out.println("yes x == 10");
     }
     else {
       System.out.println("not equal to 10");
     }
   }


    ***** Logical Operators in Java... && (AND)  || (OR) *****

   public static void main(String[] args) {
     int subject1 = 20;
     int subject2 = 25;
     //   && and      || or
     if((subject1 >= 35 || subject2 >= 35)) {
        System.out.println("The condition is true");
     } else {
       System.out.println("The condition is false");
     }

   }

    ***** Switch Statements *****

  public static void main(String[] args) {
    int score = 100;
    // byte, short, int, or char
    switch (score)
    {
      case 100:
      case 95:
      case 90 :
        System.out.println("Amazing Job");
        break;
      case 70 :
        System.out.println("Great Job");
        break;
      default:
        System.out.println("Grades are not given");
        break;

    }

  }


    ***** While Loop *****


   public static void main(String[] args) {
     int a = 0;

     while (a < 10)
     {
       System.out.println(a);
       a++;
     }

   }


    ***** Do - While Loop *****

   public static void main(String[] args) {
     int a = 0;

     while (a <= -1)
     {
       System.out.println(a);
       a++;
     }

     System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");

     int b = 0;
     do {
        System.out.println(b);
        b++;
     } while (b <= -1);

   }


   ***** Arrays *****
  public static void main(String[] args) {
    int[] myintarray = {100, 82, 33, 48, 58};

    int index = 0;
    while (index < 5) {
      System.out.println(myintarray[index]);
      index++;

    }
  }

   // ***** For-Loop *****

    public static void main(String[] args) {
      int[] myintarray = {100, 75, 50, 25, 0};

      /*int index = 0;
      while (index < 5) {
        System.out.println(myintarray[index]);
        index++;
      }

      // initialize / expression/ increment value
      for (int index = 0; index < 5; index++)
      {
        System.out.println(myintarray[index]);
      }

      // ****** Faster Way To Do Arrays *****

      for(int element : myintarray)
      {
        System.out.println(element);
      }



    }

   ***** Java Strings *****

   public static void main(String[] args) {
     String myString = "Java Learning";
     int myStringLength = myString.length();
     String myStringinCase = myString.toUpperCase();

     System.out.println(myStringinCase);
   }


   ***** Introduction to Methods *****
   public static void main(String[] args) {
     myFirstMethod();
   }

   public static void myFirstMethod() {
     System.out.println("Hello Khasiano");
     System.out.println("Hello Mom");
     System.out.println("Hello Dad");

   }

    */

   //***** Parameter Passing *****

   public static void main(String[] args) {
     sayHello(" Khasiano");
     sayHello(" Robert");
     sayHello(" Mom");

   }

   public static void sayHello(String name) {
      System.out.println("Hey" + name);
   }


}
