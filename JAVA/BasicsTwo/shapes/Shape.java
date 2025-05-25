class Shape {
  public static void main (String[] arg) {
    for(int i=1; i<=17; i++) {
        for(int j=1; i<=17; j++) {
              if(i==17 || j==1 || i==j)
                  System.out.print("*");
                  else
                  System.out.print("  ");
              }
                System.out.println();
            }
      }
  }
