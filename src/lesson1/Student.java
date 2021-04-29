package lesson1;

public class Student {

  String name;
  int age;
  static int NoOfStudents = 0;
  // Static so it can be shared by all the instances.

  //Constructor will Increase value of the Students by 1, keep track of # of Students.
  Student (){
    NoOfStudents++;
  }

  //Public Function to get Value of the # of Students.
  public static int getNoOfStudents(){
    return NoOfStudents;
  }





  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}