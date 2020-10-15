import java.util.* ;

class pr5_3{
    public static void main(String args[]){
        int a , b ,i ;
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
        // check prime loop 
        for(int t=0 ; t<a;t++){
            d = 0 ;
            for(int k = 1 ; k <= num[t] ; k++){
                if(num[t] % k == 0){
                    d += 1 ;
                }
            }
            if(d==2){
                System.out.println("the prime number is " + num[t]);
            }     
        }
    }
}