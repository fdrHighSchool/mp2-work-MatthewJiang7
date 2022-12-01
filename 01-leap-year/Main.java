class Main {
  public static void main(String[] args) {
    System.out.println(Leapy(1900));
    System.out.println(Leapy(2000));
    System.out.println(Leapy(2001));
  }

  public static boolean Leapy(int year) {
    boolean Leapy = true;
    
    if(year%4!=0 || year%100==0 && year%400!=0){
      Leapy = false;
    }

    return Leapy;
  }
}
