public class patt16 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0; row <n; row++){
            for(int column=0; column<=row; column++){
                System.out.print((char)('A' + row));
            }
            System.out.println();
        }
    }
}
