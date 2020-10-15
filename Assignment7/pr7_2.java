class Mobile{
    String Resolution , Storage ;
    Double RAM ; // in Giga byte ; 
}
class pr7_2{
    public static void main(String args[]){
        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile();
        
        mobile1.Resolution = " 1250*250";
        mobile2.Resolution = " 1260*250";
        
        mobile1.Storage = "256GB";
        mobile2.Storage = "128GB";
        
        mobile1.RAM = 8.0;
        mobile2.RAM = 16.0;
        
    }
}