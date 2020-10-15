import java.util.*;
class pr6_4{
    public static void main(String args[]){
        int matrix1[][] , product[][], matrix2[][] ,rows1,cols1,rows2,cols2,a,b,c,x,y;
        Random rand = new Random() ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to enter in matrix 1");
        rows1 = obj.nextInt();
        System.out.println("Enter the number columns you want to enter in matrix1 ");
        cols1 = obj.nextInt() ;
        matrix1 = new int[rows1][cols1];
        System.out.println("Enter the number of rows you want to enter in matrix 2");
        rows2 = obj.nextInt();
        System.out.println("Enter the number columns you want to enter in matrix 2");
        cols2 = obj.nextInt() ;
        matrix2 = new int[rows2][cols2];
        if(cols1 == rows2){
            product = new int[rows1][cols2];
            System.out.println();
            c = 0 ;
            for(int i = 0 ; i<rows1 ; i++){
                for(int j=0 ; j<cols1;j++){
                    matrix1[i][j] = rand.nextInt(10);
                    //System.out.println("Enter the  " +i + " row and "+j+" thw row elesment ");
                    //matrix[i][j] = obj.nextInt();
                }
            }
            for(int i = 0 ; i<rows2 ; i++){
                for(int j=0 ; j<cols2;j++){
                    matrix2[i][j] = rand.nextInt(10);
                    //System.out.println("Enter the  " +i + " row and "+j+" thw row elesment ");
                    //matrix[i][j] = obj.nextInt();
                }
            }
            
            
            System.out.println(" The First matrix is ");
            for(int i = 0 ; i<rows1 ; i++){
                for(int j=0 ; j<cols1;j++){
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(" The second matrix is ");
            for(int i = 0 ; i<rows2 ; i++){
                for(int j=0 ; j<cols2;j++){
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
           
            for(int i = 0; i<rows1;i++){
                for(int j = 0 ; j<cols2;j++){
                    product[i][j] = 0;
                }
            }
            
            for(int i = 0 ; i <rows1; i++){
                for(int j = 0 ; j<cols2; j++){
                    for(int k = 0 ; k < cols1; k++){
                        product[i][j] += (matrix1[i][k]*matrix2[k][j]) ;
                    }
                }
            }
            
            System.out.println(" The product matrix is ");
            for(int i = 0 ; i<rows1 ; i++){
                for(int j=0 ; j<cols2;j++){
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
            
        }    
    }
}
