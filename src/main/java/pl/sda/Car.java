package pl.sda;

import java.util.Objects;

public class Car {

    private String model;
    private String manufacturer;
    private String vin;
    private String colour;

    public void setModel(String model) {//setter
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {//setter
        this.manufacturer = manufacturer;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getModelAndManofacturer () {
        return model +" "+ manufacturer;
    }
    @Override
    public String toString(){ //przedefiniowanie metody toString
        return manufacturer +" " + model;
    }

   /* Main linia 35
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) &&
                Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturer);

    }
    */
    public boolean equals(Object anythingElse){
        if(!this.getClass().equals(anythingElse.getClass())){
            return false;

        }
        Car car = (Car) anythingElse;//rzutowanie
        if (this.vin.equals(car.vin)){
            return true;
        }
        else {
            return false;

        }


    }

}
