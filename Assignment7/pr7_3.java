class Car{
    String Name, Company;
}
class pr7_3{
    public static void main(String args[]){
        
        Car car1 = new Car() ;
        Car car2 = new Car() ;
        
        car1.Name = "urus";
        car1.Company = "Lamborgihini";
        
        car2.Name = "q8";
        car2.Company = "Audi";
        
        System.out.println(" THe car one details are " +car1.Name +" and  company : " + car1.Company);
        
        System.out.println(" THe car one details are " +car2.Name +" and  company : " + car2.Company);
    }
}