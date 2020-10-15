import java.util.Scanner;
class pr4_6{
    public static void main(String args[]){
        int n ,i; long a , b,d ;a = 0 ;  b= 0 ;
        Scanner obj  = new Scanner(System.in);
        System.out.println("Please input the n =");
        n = obj.nextInt();d = 0 ;
        for(i=1;i<=n;i++){
            if (n%i==0){
                d += 1 ;
            }  
        }
        if (d==2){
            System.out.println("THe number is prime");
        }
        else
            System.out.println("The Numner is not a prime  ");
        
    }       
}
