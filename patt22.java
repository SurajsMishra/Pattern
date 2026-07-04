public class patt22 {
    public static void main(String[] args){
        int n=5;
        int size = 2*n-1;
        for(int row=0; row<size; row++){
            for(int column=0; column<size; column++){
                int top=row;
                int left = column;
                int right= size-1-column;
                int bottom = size-1-row;
                int min = Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print(n-min+" ");
            }
            System.out.println();
        }
    }
}
