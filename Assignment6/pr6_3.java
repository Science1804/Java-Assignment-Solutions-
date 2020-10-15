import java.util.*;
class pr6_3{
    public static void main(String args[]){
        int matrix[][] , transpose[][], rows,cols,a,b,c,x,y;
        Random rand = new Random() ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to enter ");
        rows = obj.nextInt();
        System.out.println("Enter the number columns you want to enter ");
        cols = obj.nextInt() ;
        matrix = new int[rows][cols];
        transpose = new int[cols][rows];
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
        
        for(int i = 0 ; i<rows;i++){
            for(int j = 0 ; j<cols;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        
        System.out.println("The transpose is ");
        for(int i = 0 ; i<cols ; i++){
            for(int j=0 ; j<rows;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
          
    }
}
