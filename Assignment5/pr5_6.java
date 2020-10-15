import java.util.* ;
class pr5_6{
    public static void main(String args[]){
        int a , b ,c,i , odd , even ;
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
        odd = 0 ; even = 0 ;
        for(int l = 0 ; l<a ; l++){
            if(num[l]%2 == 0){
                even += 1;
            }
            else
                odd += 1;
        }
        System.out.println("The number of odds are "+odd+" and the number of evens are "+even);
    }
}