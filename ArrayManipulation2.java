class Car
{
    private String make;
    private String model;

    public Car(String make, String model)
    {
        this.make=make;
        this.model=model;
    }
    public void start()
    {
        System.out.println(model);
        System.out.println("Starting the car");
        System.out.println(make);
    }
    public static void main(String[] args) {
        Car car=new Car("Toyota" , "Camry");
        car.start();
        /*car.stop(); -----------stop function does  not exist that causes error.*/

    }
}