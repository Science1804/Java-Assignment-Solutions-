class pr2_6{
    public static void main(String args[]){
        int num1 ;
        num1 = Integer.parseInt(args[0]);
        
        if (num1 > 0 ){
            System.out.println(num1 +" Is Positive");
        }
        if (num1 < 0){
            System.out.println(num1 +"Is Negative");
        }
        if (num1 == 0){
            System.out.println(num1 +"Is Zero");
        }
               
    }
}