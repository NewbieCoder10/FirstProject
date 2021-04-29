package lesson1;

public class Hey {
// How to Access using a class^^ right above.

  //Means you added 'Static keyword. Returning string as an argument.
  public static int age;
  public static  String DoSomething(String message){
    return message;
  }

  // Non "Static" Variables can be Accessed using the "Instance" of a class.
  // Basically the 2nd Version of the main class. Ex... (Hey)... (hey) <- using the 2nd usage is
  // the "Instance" of that Main Class, (Hey)

  public String DoSomethingElse(String message){
    return message;
  }

}
