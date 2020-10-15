class pr3_2a{
    public static void main(String args[]){
        int num1;
        num1 = Integer.parseInt(args[0]);
        if (num1 < 0)
            num1 = -num1;
        System.out.println("Absolute value is "+num1);             
    }
}