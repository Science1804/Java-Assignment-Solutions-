class pr3_5{
   public static void main(String args[]){
       int a , b, c, d ;
        double x , y;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        d = b*b - 4*a*c;
       if (d>0){
           System.out.print("The roots are real and unequal");
           x = (-b + Math.sqrt(d))/(2*a);
           y = (-b - Math.sqrt(d))/(2*a);
           System.out.println("The roots are "+x+" and "+y);
       }
       else if (d==0){
           System.out.print("the roots are real and equal");
           x=y= (-b)/(2*a);
           System.out.print("The roots are "+x);
           
       }
       else {
           System.out.print("the roots are imaginary");
       }
   }
        
         
}