import java.util.* ;

class pr5_5{
    public static void main(String args[]){
        int a , b ,c,i ;
        boolean o ;
        long d ;
        int num[];
        Scanner n = new Scanner(System.in);
        System.out.println("How many numbers you want to input");
        a = n.nextInt();
        num = new int[a];
        // intput array loop
        for(int l = 0 ; l<a ; l++){
            b = l + 1 ;
            System.out.println(" Enter the " + b +" number ");
            num[l] = n.nextInt();
        } 
        // check numer
       
        for(int l = a ; l>=1 ; l--){
            System.out.print(" "+num[l-1]);
        }
    }
}