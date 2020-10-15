class pr3_2{
    public static void main(String args[]){
        int num1 , num2 ,num3;
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        num3 = Integer.parseInt(args[2]);
        if (num1>num2 && num1>num3){
            System.out.println(num1 + " > " + num2 + " and " + num3);
        }
        else if (num2>num1 && num2>num1){
            System.out.println(num2 + " > " + num1 + " and " + num3);
        }
        else
            System.out.println(num3 + " > " + num2 + " and " + num1);
             
    }
}