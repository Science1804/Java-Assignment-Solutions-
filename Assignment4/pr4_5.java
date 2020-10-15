import java.util.Scanner;
class pr4_5{
    public static void main(String args[]){
        int n ,i; double a , b ;a = 0 ;  b = 0 ;
        Scanner obj  = new Scanner(System.in);
        System.out.println("Please input the n =");
        n = obj.nextInt();
        for(i=1;i<=n;i++){
            b = i;
            a = a + (1/b);
        }
        System.out.println("The Sum of harmonic sequence n is  "+a);
    }       
}