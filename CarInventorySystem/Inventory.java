package CarInventorySystem;

import java.util.ArrayList;
import java.util.*;
import java.util.regex.Pattern;

public class Inventory  {
    ArrayList<Car> mCarList =new ArrayList<>();


    public void addCar(Car car) throws CustomException{

        if(!Objects.equals(car.getFuelStatus(), Constant.PETROL) && !Objects.equals(car.getFuelStatus(), Constant.ELECTRIC)){
            throw new CustomException("It's not a Petrol or Electric type car.");
        }
        else if(car.getYear()<Constant.AFTERYEAR || car.getYear()>Constant.BEFOREYEAR){
            throw new CustomException("The car should be in between 1990 and 2025.");
        }
        else if(car.getCarPrice()<0){
            throw new CustomException("Price should not be less than zero.");
        }
        else if(!Pattern.matches(Constant.REGEX,car.getRegistration())){
            throw  new CustomException("Car Registration Number is invalid.");
        }
        else{
            mCarList.add(car);
        }

    }

    public void deleteCar(String registration){
        //mCarList.removeIf(c -> Objects.equals(c.getCarName(), name) && Objects.equals(c.getRegistration(), registration));
        for(Car c: mCarList){
            if(c.getRegistration()==registration){
                mCarList.remove(c);
            }
        }
    }

    public void printListOfCars(){
        for(Car c: mCarList){
            System.out.println(c.getCarName());
        }
    }

    public void printListOfPetrolCars(){
        for(Car c: mCarList){
            if(c.getFuelStatus()==Constant.PETROL){
                System.out.println(c.getCarName());
            }
        }
    }

    public void printListOfElectricCars(){
        for(Car c: mCarList){
            if(c.getFuelStatus()==Constant.ELECTRIC){
                System.out.println(c.getCarName());
            }
        }
    }


    public static void main(String[] args) {
         Inventory mCarObj = new Inventory();

         Scanner sc=new Scanner(System.in);

         while(true) {
             mCarObj.taskList();
             int task=sc.nextInt();
             sc.nextLine();
             switch (task) {
                 case 1:
                     System.out.println("Enter the Car name:");
                     String mCName = sc.nextLine();

                     System.out.println("Enter the year:");
                     int mYear = sc.nextInt();

                     System.out.println("Enter the Price:");
                     double mCarPrice = sc.nextDouble();
                     sc.nextLine();
                     System.out.println("Enter the FuelStatus:(Petrol= P | Electric= E)");
                     String mFStatus = sc.nextLine();

                     System.out.println("Enter the Registration No.:");
                     String mRegistrationNo = sc.nextLine();

                     try {
                         mCarObj.addCar(new Car(mCName, mYear, mCarPrice, mFStatus, mRegistrationNo));
                         System.out.println("Car Added... ");
                     } catch (CustomException e) {
                         System.err.println(e);
                     }
                     break;

                 case 2:
                     System.out.println("Enter the Registration No.:(CASE SENSITIVE)");
                     String mNumber = sc.nextLine();
                     mCarObj.deleteCar(mNumber);
                     System.out.println("Car Deleted... ");
                     break;

                 case 3:
                     mCarObj.printListOfCars();
                     break;

                 case 4:
                     mCarObj.printListOfPetrolCars();
                     break;

                 case 5:
                     mCarObj.printListOfElectricCars();
                     break;
                 case 0:
                     System.out.println("Exit");
                     return;

                 default:
                     break;

             }
         }
    }


    public  void taskList(){
        System.out.println("TaskList:");
        System.out.println("1.Add Car Details(Name,Year,Price,FuelStatus(P/E),Registration No.)");
        System.out.println("2.Remove the Car Details by Registration No.");
        System.out.println("3.Show the list of Cars");
        System.out.println("4.Show the list of Petrol Cars");
        System.out.println("5.Show the list of electric Cars");
        System.out.println("0.Exit");
    }


}
