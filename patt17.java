public class patt17 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0; row <n; row++){
            for(int column=0; column<=n-row-1; column++){
                System.out.print(" ");
            }
            for(int column=0; column<=row; column++){
                System.out.print((char)('A' + column));
            }
            for(int column= row-1;  column>=0; column--){
                System.out.print((char)('A' + column));
            }
            System.out.println();
        }
    }
}
