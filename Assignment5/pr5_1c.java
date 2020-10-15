class pr5_1c{
    public static void main(String args[]){
        int a ,b , c, d ;
        a = 1;
        for(int i =1 ; i<=5 ; i++){
            for(int j = 5;j>=i;j--){
                System.out.print(" ");
                
            }
            for(int k = 1; k<=i;k++){
                System.out.print("* ");   
            }
            System.out.println(); 
        }
    }
}