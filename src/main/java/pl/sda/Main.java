package pl.sda;

public class Main {
    public static void main(String[] args) {
        createCarsBasic();

    }
    private static void createCarsBasic(){
        Car car = new Car();
        car.setModel("Forester");
        car.setManufacturer("Subaru");
        car.setVin("123");
        car.setColour("SpaceGrey");

        String modelAndManufacturer = car.getModelAndManofacturer();
        System.out.println(modelAndManufacturer);

        Car car2 = new Car();
        car2.setModel("Ascent");
        car2.setManufacturer("Subaru");
        car2.setVin("1234");
        car2.setColour("GreySpace");

        System.out.println(car2.getModelAndManofacturer());

        Car car3 =  car2;
        car3.setModel("Outback");

        System.out.println(car3.getModelAndManofacturer());
        System.out.println(car2.getModelAndManofacturer());//
        System.out.println(car3);

        Car car4 = new Car();
        car4.setModel("Forester");
        car4.setManufacturer("Subaru");
        car4.setVin("123");

        System.out.println("samochody takie same " + car4.equals(car));

        System.out.println("samochody te same: " + (car4 == car));
        System.out.println(car4.equals("123"));


    }
}
