import java.util.*;
class pr6_6{
    public static void main(String args[]){
        int arr1[] , arr2[], arr3[],a,b,c,x,y;
        Random rand = new Random() ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elments you want to enter in array 1");
        a = obj.nextInt();
        arr1 = new int[a];
        for(int i = 0 ; i<a;i++){
            arr1[i] = rand.nextInt(10);
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        
        System.out.println("Enter the number of elments you want to enter in array 2");
        b = obj.nextInt() ;
        arr2 = new int[b];
        for(int i = 0 ; i<b;i++){
            arr2[i] = rand.nextInt(10);
            System.out.print(arr2[i]+" ");
        }
        
        System.out.println();
        System.out.println(" The concatenate array is ");
        arr3 = new int[a+b];
        for(int i = 0 ; i<a+b ; i++){
            if(i<a){
                arr3[i] = arr1[i];
            }
            else{
                arr3[i] = arr2[i-a];
            }
            System.out.print(arr3[i]+" ");
        }   
    }
}