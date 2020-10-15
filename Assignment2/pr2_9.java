class pr2_9{
    public static void main(String args[]){
        int a , b , c ;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        if( a*a + b*b == c*c){
            System.out.println(" are sides of Right angle Triangle");
        }
        if( a*a + b*b != c*c){
            System.out.println(" are not sides Right angle Triangle");
        }
    }
}