public class patt18 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0; row<n; row++){
            char start = (char)('A' + n- row -1 );
            for(char ch = start; ch <='A' + n-1; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
    