class pr5_1b{
    public static void main(String args[]){
        int a ,b , c, d ;
        a = 1;
        for(int i =1 ; i<=5 ; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" "+a);
                a += 1;
            }
            System.out.println();    
        }
    }
}