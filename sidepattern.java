public class sidepattern {
    public static void main(String args[]){
        int n =5;
        for(int row=0; row<n; row++){
            for(int column=0; column<=row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=n-2; row>=0; row--){
            for(int column =0; column<=row; column++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
