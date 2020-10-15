import java.util.* ;
class pr7_1{
    public static void main(String args[]){
        double det , a ,b ,c,d ;
        int matrix[][] ;
        double inverse[][];
        Random rand = new Random() ;
        
        matrix = new int[2][2] ;
        inverse = new double[2][2] ;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrix[i][j] = rand.nextInt(10);
            }
        }
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }
        
        det = matrix[0][0]*matrix[1][1] - matrix[1][0]*matrix[0][1] ;
        
        if (det!=0){
            det = 1/det ;          
            inverse[0][0] = det*matrix[1][1];
            inverse[1][1] = det*matrix[0][0];
            inverse[1][0] = -det*matrix[1][0];
            inverse[0][1] = -det*matrix[0][1];
            
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(inverse[i][j] + " ");
                }
                System.out.println();
            }         
        }
        else{
            System.out.println("Inverse doesnt exit");       
        }    
    }
}