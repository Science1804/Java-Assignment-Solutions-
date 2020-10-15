class pr1_3{
    public static void main(String b[]){
        double simple_interest,principle,rate,period,final_amount ;
        principle = 800000 ;
        rate = 18 ; 
        period = 5; 
        simple_interest = (principle*rate*period)/100;
        final_amount = principle + simple_interest;
        System.out.println("The Principle amount is " + principle + " the rate is " + rate + "% , the period is " + period + " years ");
        System.out.println("The Simple Interest is "+ simple_interest );
        
    }
}