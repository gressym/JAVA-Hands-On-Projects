package CarInventorySystem;

public class Car {
    private String mCarName;
    private int mYear;
    private double mCarPrice;
    private String mFuelStatus;
    private String mRegistration;

    public Car(String name, int year, double price, String type, String regNo){
        this.mCarName=name;
        this.mYear=year;
        this.mCarPrice=price;
        this.mFuelStatus =type;
        this.mRegistration=regNo;
    }

    public String getCarName() {
        return mCarName;
    }

    public void setName(String mName) {
        this.mCarName = mName;
    }

    public int getYear() {
        return mYear;
    }

    public void setYear(int mYear) {
        this.mYear = mYear;
    }

    public double getCarPrice() {
        return mCarPrice;
    }

    public void setCarPrice(double mCarPrice) {
        this.mCarPrice = mCarPrice;
    }

    public String getFuelStatus() {
        return mFuelStatus;
    }

    public void setFuelStatus(String mFuelStatus) {
        this.mFuelStatus = mFuelStatus;
    }

    public String getRegistration() {
        return mRegistration;
    }

    public void setRegistration(String mRegistration) {
        this.mRegistration = mRegistration;
    }


}
