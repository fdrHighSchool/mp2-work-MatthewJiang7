class Main {
  public static void main(String[] args) {
    int a = 25;
    String num = String.valueOf(a);
    String cents;
    if(num.length()<2){
      cents = num;
    }
    else {
      cents = num.substring(num.length()-2, num.length());
    }
    int cients = Integer.parseInt(cents);
    System.out.println(cients/25);
  }
}
// if(a<10){
//   cents = a;
// else {
//  cents = a%100;
