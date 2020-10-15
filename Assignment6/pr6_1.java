import java.util.*;
class pr6_1{
    public static void main(String args[]){
        int matrix[][] , rows,cols,a,b,c,x,y;
        boolean k = true ; boolean l = true ; boolean z = true ;
        Random rand = new Random() ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to enter ");
        rows = obj.nextInt();
        System.out.println("Enter the number columns you want to enter ");
        cols = obj.nextInt() ;
        matrix = new int[rows][cols];
        System.out.println();
        for(int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<cols;j++){
                //matrix[i][j] = rand.nextInt(10);
                System.out.println("Enter the  " +i + " row and "+j+" thw row elesment ");
                matrix[i][j] = obj.nextInt();
            }
        }
        for(int i = 0 ; i<rows ; i++){
            for(int j=0 ; j<cols;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // for upper triangualr looking for zeros in lower part
        for(int i = 1 ; i<rows ; i++){
            for(int j = 0 ;j<i;j++){
                if(matrix[i][j] != 0){
                    k = false ;
                    break;
                }
            }
            
            for(int j=1; j>i ; j++){
                if(matrix[i][j] != 0){
                    l = false;
                    break;
                }
            }
            
            for(int j = 0 ;j<cols;j++){
                if(i!=j){
                    if(matrix[i][j] != 0){
                        z = false ;
                        break;
                    }
                }
            }      
        }
        
        if( k ){
            System.out.println("It is Upper Trainglular");
        }
        else{
            System.out.println("It is not Upper Trainglular");
        }
        
        // for lower triangualr matrix check if upper part has zeros
        
        if( l ){
            System.out.println("It is Lower Trainglular");
        }
        else {
            System.out.println("It is not lower Trainglular");
        } 
        
        // to check is diagonal
        if( z ){
            System.out.println("It is Diagonal Trainglular");
        }
        else {
            System.out.println("It is not Diagonal Trainglular");
        }
        
    }
}