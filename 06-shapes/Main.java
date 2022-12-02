class Main {
  public static void main(String[] args) {
    square(4);
    System.out.println();
    Rectangle(3,5);
    System.out.println();
    RightTriangle(4);
    System.out.println();
    Triangle(4);
  }
  
  public static void square(int s) {
    for(int row = 0; row<s; row++){
      for(int col = 0; col<s; col++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }//end square
  
  public static void Rectangle(int l, int w) {
    for(int row = 0; row<l; row++) {
      for(int col = 0; col<w; col++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }//end Rectangle
  
  public static void RightTriangle(int s) {
    String sy = "* ";
    for(int side = 0; side<s; side++) {
      System.out.println(sy);
      sy += "* ";
    }
    System.out.println();
  }//end RightTriangle
  
  public static void Triangle(int s) {
    String sy = "* ";
    String b = " ";
    String sp = b.repeat(s);
    for(int side = 0; side<s; side++) {
      System.out.println(sp + sy);
      sp = sp.substring(0, sp.length()-1);
      sy += "* ";
    }
    System.out.println();
  }//end Triangle
}
