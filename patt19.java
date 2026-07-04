public class patt19 {
    public static void main(String[] args) {
        int n=5;
        for(int row =0; row<n; row++){
            for(int column =0; column<n-row; column++){
                System.out.print("*");
            }
            for(int column =0; column<2*row; column++){
                System.out.print(" ");
            }
            for(int column=0; column<n-row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row =0; row<n; row++){
            for(int column =0; column<=row; column++){
                System.out.print("*");
            }
            for(int column=0; column<2*(n-row-1); column++){
                System.out.print(" ");
            }
            for(int column=0; column<=row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
