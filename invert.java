public class invert {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for(int row=n; row>=1; row--){
            for(int column=1; column<=row; column++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }    
}
