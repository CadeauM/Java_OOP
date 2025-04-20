public class Car {
    //characteristics of the car
    private String make = "Tesla";
    private String model = "Model x";
    private String color = "Gray";
    private int door = 2;
    private boolean convertible = true;

    //adding a getter method
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }

    public boolean isConvertible() {
        return convertible;
    }
    public void setMake(String make) {
        //this.make = make;   // update the field, private string make with arguments passed and update here. Use this
        // by using these methods we can do validations this way the code creating objects cant make invalid objects

        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "Tesla", "Porsche", "Mercedes" -> this.make = make;
            default -> this.make = "Unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(door + "-Door "  +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
