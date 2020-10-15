import java.util.Scanner;
class pr4_3{
    public static void main(String args[]){
        int n ,i; long a1 , d ; long b = 0;
        Scanner obj  = new Scanner(System.in);
        System.out.println("Please input the number of terms req n = ");
        n = obj.nextInt();
        System.out.println("Please input a1 = ");
        a1 = obj.nextInt();
        System.out.println("Please input d = ");
        d = obj.nextInt();
        for(i=1;i<=n;i++){
            b = a1 + (i - 1)*d;
            System.out.print(b+",");
        }
    }       
}