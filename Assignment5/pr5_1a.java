class pr5_1a{
    public static void main(String args[]){
        int a ,b , c, d ;
        for(int i =5 ; i>=1 ; i--){
            for(int j = 5;j>=i;j--){
                System.out.print(" ");
            }
            
            for(int j = i;j>=1;j--){
                System.out.print("$");
            }
            System.out.println();     
        }
    }
}