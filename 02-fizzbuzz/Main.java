class Main {
  public static void main(String[] args) {
  //   int i = 1;
  //   do {
  //     if(i%5==0 && i%3==0) {
  //       System.out.println("fizzbuzz");
  //     }
  //     else if(i%5==0) {
  //       System.out.println("buzz");
  //     }
  //     else if(i%3==0) {
  //       System.out.println("fizz");
  //     }
  //     else {
  //       System.out.println(i);
  //     }
  //     i++;
  //   }
  //   while(i<101);
    int num = 1;
    for(int i = 1; i<101; i++) {
      if(num%5==0 && num%3==0) {
        System.out.println("fizzbuzz");
      }
      else if(num%5==0) {
        System.out.println("buzz");
      }
      else if(num%3==0) {
        System.out.println("fizz");
      }
      else {
        System.out.println(num);
      }
      num += 1;
    } //end for loop
  }
}
