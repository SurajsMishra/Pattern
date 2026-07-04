public class numbers {
    public static void main(String[] args) {
        int n=5;
        for(int row=0; row <n; row++){
            for(int column=0; column<=row; column++){
                System.out.print(column+1);
            }
            System.out.println();
        }
        for(int row=n-1; row>=0; row--){
            for(int column=0; column<row; column++){
                System.out.print(column+1);
            }
            System.out.println();
        }
    }
}
