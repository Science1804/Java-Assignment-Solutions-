import java.util.* ;
class Factorial{
    double n ;
    
    long findfact(double l){
        n = l ;
        long fact  = 1;
        for(int i = 2 ;i<=n ;i++){
            fact = fact*i;
        }
        return fact;
    }
}

class pr7_4{
    public static void main(String args[]){
        double a , b, c ;
        //Scanner a = new Scanner(System.in);
        Factorial obj1 = new Factorial();
        
        a = obj1.findfact(5) ;
        
        b = obj1.findfact(12);
        
        System.out.println("the factorial of 5 is " +a+"  and of 12 is " + b);   
    }
}