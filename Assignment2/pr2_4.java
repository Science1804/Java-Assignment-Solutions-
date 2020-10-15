class pr2_4{
    public static void main(String args[]){
        int num1 , num2;
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        if ((num1-num2) % 8 == 0){
            System.out.println(num1+" is congruent "+num2+"  modulo 8");
        }
        if ((num1-num2) % 8 != 0){
            System.out.println(num1+" is not congruent"+num2+" modulo 8");
        }
             
    }
}