import java.util.* ;
class pr5_2{
    public static void main(String args[]){
        int a,b,mode,max,min ,d,cnt , mxcntvar ;
        double mean;
        int num[] , md[] ;
        Scanner n = new Scanner(System.in) ;
        System.out.println("How many numbers you want to input");
        a = n.nextInt();
        num = new int[a];
        md = new int[a]; 
        // intput array loop
        mean = 0 ;
        for(int l = 0 ; l<a ; l++){
            b = l + 1 ;
            System.out.println(" Enter the " + b +" number ");
            num[l] = n.nextInt();
            mean += num[l] ;
        }
        mean = mean / a ;
        max = num[0] ; min = num[0];
        for(int l = 1; l<a;l++){
            if(num[l] >= max){
                max = num[l];
            }
            if (num[l]<=min){
                min = num[l];
            }    
        }
        //check mode loop
        for (int l=0 ;l<a;l++){
            mode = num[l];d = 0 ;
            for (int k = 0 ; k<a ; k++){
                if(mode==num[k]){
                    d += 1;
                }
            }
            md[l] = d ;   
        }
        cnt = md[0] ; mxcntvar = num[0];
        for( int l = 0 ; l<a-1 ; l++){
            if(md[l+1]>md[l]){
                cnt = md[l+1];
                mxcntvar = num[l+1];
            }
        }
        
        System.out.println("the mean is "+mean+" the max is"+max+" the min is "+min+" and the mode is "+ mxcntvar);
        
    }
}
