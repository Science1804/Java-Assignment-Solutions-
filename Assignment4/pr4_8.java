import java.util.Scanner;
class pr4_8{
    public static void main(String args[]){
        int i,n , m , r , d , q ;
        Scanner obj  = new Scanner(System.in);
        System.out.println("Please input the greatest number n =");
        n = obj.nextInt();
        System.out.println("Please input the smaller number m = ");
        m = obj.nextInt();   
        // consider n > m thus m divides n
        for(i=1;;i++){
            q = n / m;
            r = n % m ;
            if (r==0){
                System.out.println("The gcd is   "+m);
                break;   
            }
            n = m ; m = r ;
        }
    }       
}
