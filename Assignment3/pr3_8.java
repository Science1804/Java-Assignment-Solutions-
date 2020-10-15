class pr3_8{
    public static void main(String args[]){
        int a ,b,c ;
        double s,area;
        
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        s = (a+b+c)/2;
        
        if (a+b>c && b+c>a && a+c > b){
            area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Triangle is Possible, and the area is "+ area);
        }
        else
            System.out.println("Triangle not possible");
        
    }
}