import java.util.* ;

class pr5_4{
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
        System.out.println("Enter the number you want to check");
        c = n.nextInt();
        
        for(int l =0 ; l<a ; l++){
            if(c==num[l]){
                System.out.println("The number is in the Loop");
                break;
            }
            else if(l == (a-1))
                System.out.println("The number is not in the array");
            
        }
        
    }
}