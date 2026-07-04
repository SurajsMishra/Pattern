public class binpatt {
    public static void main(String[] args) {
        int n = 5;
        for(int row=0; row<n; row++){
            for(int column=0; column<=row; column++){
                if((row+column)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
