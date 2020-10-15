import java.util.*;
class pr6_2{
    public static void main(String args[]){
        int matrix[][] , rows,cols,a,b,c,x,y;
        Random rand = new Random() ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to enter ");
        rows = obj.nextInt();
        System.out.println("Enter the number columns you want to enter ");
        cols = obj.nextInt() ;
        matrix = new int[rows][cols];
        System.out.println();
        c = 0 ;
        for(int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<cols;j++){
                matrix[i][j] = rand.nextInt(10);
                //System.out.println("Enter the  " +i + " row and "+j+" thw row elesment ");
                //matrix[i][j] = obj.nextInt();
                if(i==j){
                    c = c + matrix[i][j] ;
                }
            }
        }
        
        for(int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<cols;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("The trace of the matix is "+c);
    }
}
