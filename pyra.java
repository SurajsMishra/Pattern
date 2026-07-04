public class pyra {
    public static void main(String[] args) {
        int n = 5;
        for (int row =0; row<n; row++){
            for(int column =0; column<=n-row-1; column++){
                System.out.print(" ");
            }
            for(int column =0; column<2*row+1; column++){
                System.out.print("*");
            }
            for(int column = 0; column<=n-row-1; column++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int row=n-2; row>=0; row--){
            for(int column =0; column<=n-row-1; column++){
                System.out.print(" ");
            }
            for(int column =0; column<2*row+1; column++){
                System.out.print("*");
            }
            for(int column = 0; column<n-row-1; column++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
