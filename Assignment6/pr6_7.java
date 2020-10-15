import java.util.*;
class pr6_7{
    public static void main(String[] args){
        int c; String temp;
        Scanner obj = new Scanner(System.in); 
        System.out.print("Enter number of strings you would like to enter ");
        c = obj.nextInt();
        
        String mystring[] = new String[c];
        //Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the Strings one by one ");
        for(int i = 0; i < c; i++){
            mystring[i] = obj.nextLine();
        }
        for (int i = 0; i < c; i++) {
            for (int j = i + 1; j < c; j++){ 
                
                if (mystring[i].compareTo(mystring[j])>0){
                    temp = mystring[i];
                    mystring[i] = mystring[j];
                    mystring[j] = temp;
                }
            }
        }
        System.out.print("Strings in Sorted Order ");
        for (int i = 0; i <= c - 1; i++) {
            System.out.print(mystring[i] + ", ");
        }
    }
}