public class tri {
    public static void main(String[] args) {
        int n = 5;
        for (int row=0; row<=n; row++){
            for (int column = 0; column<=row; column++){
                System.out.print(" ");
            }
            for(int column =0; column<2*n-(2*row+1); column++){
                System.out.print("*");
            }
            for(int column = 0; column<=row; column++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
