import java.util.*;
class pr6_5{
    public static void main(String args[]){
        int ar1[] , a , b , c , d ,u,l,m;
        Scanner obj = new Scanner(System.in);
        Random rand = new Random() ;
        System.out.println("Enter the number of elements you want to enter in array");
        a = obj.nextInt();
        ar1 = new int[a];
        for(int i =0 ; i<a; i++){
            //ar1[i] = rand.nextInt(50);
            System.out.print(" Enter the "+(i+1)+" number ");
            ar1[i] = obj.nextInt();
        }
        System.out.print("Enter the number you want to find ");
        b = obj.nextInt();
        l = 0 ; u = a ;
        m = (l+u)/2;
        while(b!=ar1[m]){
            if(b<ar1[m]){
                u = m ;
                m = (l+u)/2 ;
            }
            if(b>ar1[m]){
                l = m ;
                m = (l+u) / 2;
            }
            if(b==ar1[m]){
                System.out.println("It is at "+ m + " th location");
                break;
            }
            if ((m-l==0) || (m-u==0)){
                System.out.println("it is not in the array");
                break;
            }
        }
        
        
    }
}