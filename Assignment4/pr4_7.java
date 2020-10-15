import java.util.Scanner;
class pr4_7{
    public static void main(String args[]){
        int n ,i; long a , b,d ;a = 0 ;  b= 0 ;
        Scanner obj  = new Scanner(System.in);
        System.out.println("Please input the n =");
        n = obj.nextInt();d = 0 ;
        for(i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+",") ;
            }
        }
    }       
}
