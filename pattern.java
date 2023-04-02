class pattern {

  public static void main(String args[]) {
    int i,j,n = 4;
    //Loop for  row
    for (int i = 5; i <= n; i--) {
      //Loop for column
      for (int j = 1; j <= i; j++) {
        System.out.print("@");
      }
      System.out.println();
    }
  }
}