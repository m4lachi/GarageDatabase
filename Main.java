import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to your Garage DataBase ");
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = n.nextLine();
        System.out.println("Hello " + name + " !");

        System.out.println("To get started let see how many cars you have!");
        Scanner num = new Scanner(System.in);
        System.out.println("Enter how cars do you have? ");
        int numOfCars = num.nextInt();

        Car[] garageDB = new Car[numOfCars];
        for (int i =0; i< garageDB.length; i++){
            garageDB[i] = new Car();
            Scanner model = new Scanner(System.in);
            System.out.println("Enter model name; ");
            String modelName = model.nextLine();
            garageDB[i].setModel(modelName);
            }

        Car[] carPlate = new Car[numOfCars];
        for (int i =0; i< carPlate.length; i++){
                carPlate[i] = new Car();
                Scanner plate = new Scanner(System.in);
                System.out.println("Enter License Plate name; ");
                String licensePlate = plate.nextLine();
                garageDB[i].setPlate(licensePlate);
        }
        System.out.println("We are done!");
        System.out.println("Here a list of all your cars!");
        System.out.println(name + "'s GarageDB");
        for (int i =0; i< garageDB.length; i++) {
                System.out.println(garageDB[i]);
        }
        
    }
}