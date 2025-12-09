public class pattterns {


public static void inverted_pyaramid(int n){

    for (int i = 1; i<= n; i++){

        for (int j = 1; j <= n-i; j++){

            System.out.print(" ");
        }  
        for (int j = 1; j <= i ; j++){

            System.out.print("*");
        }
        System.out.println();
    }
}



  public static void hollow_rectangle(int totalRow , int totalCol){
    for (int i = 1; i <= totalRow; i++){
        for (int j  =1; j <= totalCol; j++){
            if (i == 1 || i == totalRow || j == 1 || j == totalCol){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
  }

    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        inverted_pyaramid(4);
    }
}
