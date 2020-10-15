import java.util.Scanner;
class pr4_2{
    public static void main(String args[]){
    
        int n ,i; long a , b ;a = 0 ;  b = 0 ;
        Scanner obj  = new Scanner(System.in);
        System.out.println("Please input the Number");
        n = obj.nextInt();
        for(i=1;;i++){
            if (n / 10 == 0){
                b = b + n ;
                break;
            }
            a = n % 10 ;
            n = n / 10 ; 
            b = b + a ;
            
        }
        System.out.println("The Sum of digits of given n is  "+b);
    }       
}
