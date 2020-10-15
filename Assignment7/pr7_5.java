import java.util.* ;
class Function{
    double x ,a,v,b,c;
    void initialize(double l){
        x = l;
    }
    
    double evaluate(){
        a = x*x*x + 2*x*x + 6 ;
        return a ;
    }
}

class pr7_5{
    public static void main(String args[]){
        double a , b ;
        Function obj1 = new Function();
        
        obj1.initialize(5);
        System.out.println("The value if x^3 + 2x^2 + 6 at x=5 is "+obj1.evaluate());
        
        obj1.initialize(7.4);
        System.out.println("The value if x^3 + 2x^2 + 6 at x=7.4 is "+obj1.evaluate());
        
    }
}