class pr3_7{
    public static void main(String args[]){
        int x1,x2,y2,y1 ;
        double d;
        x1 = Integer.parseInt(args[0]);
        x2 = Integer.parseInt(args[1]);
        y1 = Integer.parseInt(args[2]);
        y2 = Integer.parseInt(args[3]);
        d = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) ;
        d = Math.sqrt(d);
        System.out.println("The distance is " + d);
    }
    
}