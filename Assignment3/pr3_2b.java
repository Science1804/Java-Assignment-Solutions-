class pr3_2b{
    public static void main(String args[]){
        int num1;
        String k , l;
        num1 = Integer.parseInt(args[0]);
        k = (num1>0) ? "Positive":"Negative" ;
        l = (num1==0) ? "Zero":"Non-zero";
        System.out.println("The given number is " + l );
        System.out.println("The given number is " + k );
    }
}
