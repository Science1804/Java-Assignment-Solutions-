class pr2_2{
    public static void main(String args[]){
        int num1 , num2;
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        if (num1>num2){
            System.out.println(num1 + " > " + num2);
        }
        if (num1<num2){
            System.out.println(num1 + " < " + num2);
        }
             
    }
}