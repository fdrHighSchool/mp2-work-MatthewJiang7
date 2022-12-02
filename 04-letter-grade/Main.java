class Main {
  public static void main(String[] args) {
    System.out.println(letterGrade(100));
    System.out.println(letterGrade(97));
    System.out.println(letterGrade(96));
    System.out.println(letterGrade(90));
    System.out.println(letterGrade(88));
    System.out.println(letterGrade(73));
    System.out.println(letterGrade(61));
    System.out.println(letterGrade(0));
  }
  public static String letterGrade(int grade) {
      String letter = "";
    if (grade < 60) {
      letter = "F";
    }
    else if (grade < 70) {
      letter = "D";
    }
    else if (grade < 80) {
      letter = "C";
    }
    else if (grade < 90) {
      letter = "B";
    }
    else if (grade >= 90) {
      letter = "A";
    }
    
    if (grade%10>=7 || grade == 100) {
        letter += "+";
    }
    else if (grade%10 <= 2) {
        letter += "-";
    }
    return letter;
  }
}
