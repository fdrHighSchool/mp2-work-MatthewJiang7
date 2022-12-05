import java.util.*;

class Main {
  public static void main(String[] args) {
    String str1 = "abc";
    String str2 = "cat";
    String str3 = "fizzbuzz";
    String str4 = "oh hi, high school is so fun";
    String str5 = "school";
    String str6 = "fq2tg53yt";
    
    System.out.println(conCat(str1, str2));
    System.out.println(firstHalf(str3));
    System.out.println(repeatEnd(str3, 3));
    System.out.println(countHi(str4));
    System.out.println(withoutString(str4, str5));
    System.out.println(sumDigits(str6));
    System.out.println(makeSarcastic(str4));
  }

  public static String conCat(String str1, String str2) {
    if (str1.substring(str1.length() - 1).equals(str2.substring(0, 1))) {
      str2 = str2.substring(1);
    }
    return (str1 + str2);
  }

  public static String firstHalf(String str3) {
    return str3.substring(0, str3.length() / 2);
  }

  public static String repeatEnd(String str3, int n){
    String rep = str3.substring(str3.length()-n);
    return rep.repeat(n);
  }

  public static int countHi(String str4){
    int count = 0;
    for(int i=0; i<=str4.length()-2; i++) {
      if(str4.substring(i, i+2).equals("hi")) {
        count++;
      }
    }
    return count;
  }

  public static String withoutString(String str4, String str5) {
    String cut = "";
    String cut2 = "";
    for(int i=0; i<=str4.length()-str5.length(); i++) {
      if(str4.substring(i, i+str5.length()).equals(str5)) {
        cut += str4.substring(0, i);
        cut2 += str4.substring(i+str5.length());
      }
      
    }
    return cut + cut2;
  }

  public static int sumDigits(String str6) {
    int sum = 0;
    for(int i=0; i<str6.length(); i++) {
      if(str6.substring(i, i+1).equals("1") || str6.substring(i, i+1).equals("2") || str6.substring(i, i+1).equals("3") || str6.substring(i, i+1).equals("4") || str6.substring(i, i+1).equals("5") || str6.substring(i, i+1).equals("6") || str6.substring(i, i+1).equals("7") || str6.substring(i, i+1).equals("8") || str6.substring(i, i+1).equals("9")) {
        sum += Integer.parseInt(str6.substring(i,i+1));
      }
    return sum;
  }

  public static String makeSarcastic(String str4) {
    String sarstr = "";
    for(int i=0; i<str4.length(); i++) {
      if(i%2==0){
        sarstr += str4.substring(i, i+1).toUpperCase();
      }
      else {
        sarstr += str4.substring(i, i+1).toLowerCase();
      }
    }
    return sarstr;
  }
}
