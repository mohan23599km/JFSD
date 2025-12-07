public class Showroom {

    static void welcome(){
        System.out.println("Welcome to the showroom");
    }

   public static void main(String[]args){
        Showroom.welcome();

        Car C= new Car();
    ElectricCar EC=new ElectricCar();


    C.start();
    EC.start();
    C.fueltype();
    C.Wheels();

    }

    


}
