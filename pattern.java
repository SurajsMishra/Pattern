import java.util.Scanner;
class pattern{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter formate");
       int n = sc.nextInt();
    
       for(int row=n; row>0; row--){
        for(int column=0; column<=row; column++){
            System.out.print("*");
        }
        System.out.println();
       }
       sc.close();
    }
}