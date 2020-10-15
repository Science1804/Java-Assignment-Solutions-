class pr3_6{
    public static void main(String args[]){
        int x,z;
        double y ;
        String k , l;
        x = Integer.parseInt(args[0]);
        y = Math.sqrt(x);
        z = (int) y ;
        if (y-z == 0)
            System.out.println("Perfect Square");
        else
            System.out.println("Not Perfect Square");
    }
    
}