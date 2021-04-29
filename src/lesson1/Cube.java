package lesson1;

public class Cube {
    int length;
    int bredth;
    int height;

    public int getCubeVolume() {
      return (length * bredth * height);
    }

    //Can provide "Parameters" within parenthesis, Same name as Class, Never returns Values.
    // Example like the "Return" Statement Above ^^^ It can take Values though./ Also Print things.

    Cube () {
      length = 13;
      bredth = 5;
      height = 99;
    }

    Cube (int l, int b, int h) {
    length = l;
    bredth = b;
    height = h;
  }

}
