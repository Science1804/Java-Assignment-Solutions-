import java.util.Scanner;
class pr4_1{
    public static void main(String args[]){
    
        int n ,i;
        long a , b ;
        a = 0 ; 
        b = 0 ;
        b = 0 ;
        Scanner obj  = new Scanner(System.in);
        System.out.println("Please input the Number");
        n = obj.nextInt();
        for(i=1;i<=n;i++){
            a = a + i*i;
            b = b + i*i*i;
             
        }
        System.out.println("The Sum of squares is "+a+" and the sum of cubes is "+b);
    }       
}
