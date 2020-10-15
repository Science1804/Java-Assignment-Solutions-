class pr3_1{
    public static void main(String args[]){
        int year;
        year = Integer.parseInt(args[0]);
        if(year % 4 == 0)
            if (year % 100 == 0){
                if (year % 400 == 0)
                    System.out.print("It is a Leap Year");       
            } 
        
        else 
            System.out.print("It is not a Leap Year");
        
    }
}