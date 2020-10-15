import java.util.*;
class pr6_8{
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
            }
        }
        
        for(int i = 0 ; i<rows ; i++){
                for(int j=0 ; j<cols;j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        
        
        
        for(int i = 0 ; i<rows ; i++){
            a = 0 ;
            for(int j=0 ; j<cols;j++){
                a += matrix[i][j];
            }
            System.out.println("the sum of row "+(i+1) +" is " + a );
        }
        
        for(int j = 0 ; j<cols ; j++){
            a = 0 ;
            for(int i=0 ; i<rows;i++){
                a += matrix[i][j];
            }
            System.out.println("the sum of cols  "+(j+1) +" is " + a );
        }   
       
    }
}
