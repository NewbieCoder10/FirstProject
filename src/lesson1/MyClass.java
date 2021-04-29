package lesson1;

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

   //***** Parameter Passing && Returning a Value from a method *****

   public static void main(String[] args) {

     int sum = Divide(500,2, 2);
     int result = sum * 15;
     System.out.println(sum);

   }

   public static void sayHello(String name) {
      System.out.println("Hey" + name);
   }

   public static int Divide (int a, int b, int c)
   {
      //System.out.println(a + b + c);
      return(a / b / c);
   }

   // ***** Classes & Objects in Java *****

   public static void main(String[] args) {
     Student khasiano = new Student(); //khasiano -> object or instance

      khasiano.setId(13);
      khasiano.setName("Khasiano");
      khasiano.setAge(23);

      Student Cesar = new Student(); // Cesar -> object or instance

      Cesar.setId(2);
      Cesar.setName("Cesar");
      Cesar.setAge(10);

      System.out.println(khasiano.getName() + " is " + khasiano.getAge() + " years old");
      System.out.println(Cesar.getName() + " is " + Cesar.getAge() + " years old");
   }


   // ***** Class Constructor in Java *****

   public static void main(String[] args){
      Cube cube = new Cube();

      System.out.println(cube.getCubeVolume());

      Cube cube2 = new Cube(20, 20, 20);

      System.out.println(cube2.getCubeVolume());
   }

   // ***** Method Overloading *****
   // Define different Methods with the same name, but performs different logic
   public static void main(String[] args) {
      System.out.println(Add(2, 35));
      System.out.println(Add(22.40, 35.50));
      System.out.println(Add("Im", " Tired"));

   }
   public static int Add (int a, int b){
      return (a + b);
   }
   public static double Add (double a, double b){
      return (a + b);
   }
   public static String Add (String a, String b){
      return (a + b);
   }

   // ***** "Static && NON - Static" Example in a Class *****

   public static void main(String[] args) {
      //Static members belong to the class instead of a specific instance.
      Hey hey = new Hey();
      Hey.age = 5;
      System.out.println(Hey.age);
      //Hey.DoSomething("Learning Java");
      //hey.DoSomethingElse("Ay Ay");

      Hey hey1 = new Hey();
      Hey.age = 50;
      System.out.println(Hey.age);

   }

   // ***** "Static" Examples in a Class *****

   public static void main(String[] args){
      Student Chey = new Student();
      System.out.println(Chey.getNoOfStudents());

      Student Sheba = new Student();
      System.out.println(Sheba.getNoOfStudents());

      //System.out.println(Student.getNoOfStudents());

   }

    */


}
