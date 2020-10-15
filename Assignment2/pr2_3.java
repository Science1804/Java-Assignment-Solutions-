class pr2_3{
    public static void main(String args[]){
        int num1 ;
        num1 = Integer.parseInt(args[0]);
        
        if (num1 % 2 == 0 ){
            System.out.println(num1 +" Is a Multiple of 2");
        }
        if (num1 % 3 == 0){
            System.out.println(num1 +"Is a Multiple of 3");
        }
        if (num1 % 5 == 0){
            System.out.println(num1 +"Is a Multiple of 5");
        }
               
    }
}