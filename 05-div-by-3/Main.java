class Main {
  public static void main(String[] args) {
    System.out.println(divy3(7656));
  }
  public static boolean divy3(int num) {
    int total = 0;
    String numS = String.valueOf(num);
    for(int i=0; i < numS.length(); i++) {
      total += Integer.parseInt(numS.substring(i, i+1));
    }
    return total%3==0;
  }
}
