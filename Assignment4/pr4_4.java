import java.util.Scanner;
class pr4_4{
    public static void main(String args[]){
        long i ,n , r , nfact , n_r, z ,k,rfact,n_rfact;
        Scanner obj  = new Scanner(System.in);
        System.out.println("please enter n =");
        n = obj.nextInt();
        System.out.println("Please input r = ");
        r = obj.nextInt();
        nfact = 1 ;n_r = n -r;
        for(i=2;i<=n;i++){
            nfact = nfact*i;
        }
        n_rfact = 1;
        for(i=2;i<=n_r;i++){
            n_rfact = n_rfact*i;
        }
        rfact=1;
        for(i=2;i<=r;i++){
            rfact = rfact*i;
        }
        z = nfact / n_rfact;
        k = z / rfact;
        System.out.println("The nPr is"+z+" and the nCr is "+k);
    }       
}