public class alpha {
    public static void main(String args[]){
        int n=5;
        char ch='A';
        for(int row=0; row<n; row++){
            for (int column =0; column<=row; column++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
