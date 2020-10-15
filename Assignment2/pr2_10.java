class pr2_10{
    public static void main(String args[]){
        int a , n ;
        n = Integer.parseInt(args[0]);
        a = (n*(n+1)*(2*n + 1))/6 ;
        System.out.println(" Sum of squares of first "+n+" numbers is "+a);
    }
}