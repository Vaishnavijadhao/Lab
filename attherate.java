class attherate {

  public static void main(String args[]) {
    int n = 5;
    //Loop for  row
    for (int i=n-1; i>=0; i--) {
      //Loop for column
      for (int j=0; j<=i; j++) {
        System.out.print("@");
      }
      System.out.println();
    }
  }
}