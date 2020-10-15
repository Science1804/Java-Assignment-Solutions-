class pr2_1{
    public static void main(String args[]){
        int divisor,quotient,remainder,dividend;
        divisor = Integer.parseInt(args[0]);
        dividend = Integer.parseInt(args[1]);
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.println(" quotient = "+quotient+" , remainder = "+remainder);
        
    }
}