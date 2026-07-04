public class floyd {
    public static void main(String[] args) {
        int n=5;
        int number=1;
        for(int row=0; row<n; row++){
            for(int column=0; column<=row; column++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
