class pr3_4{
    public static void main(String args[]){
        int num1 , num2 ,num3;
        num1 = Integer.parseInt(args[0]);
        if (num1>=75)
            System.out.println("Passed with Distinction");
        else if(num1>=60 && num1<75)
            System.out.println("Passed with Frist Class");
        else if(num1>=40 && num1<60)
            System.out.println("Passed with Second Class");
        else if(num1<40)
            System.out.println("Failed");
             
    }
}