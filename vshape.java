public class vshape {
    public static void main(String args[]){
        int  n = 5;
        for(int row = 0; row<n; row++){
            for(int column = 0; column<=row; column++){
                System.out.print(column+1);
            }
            for(int space = 0; space<2*(n-row-1); space++){
                System.out.print(" ");
            }
            for(int column = row; column>=0; column--){
                System.out.print(column+1);
            }
            System.out.println();
        }
    }
}
