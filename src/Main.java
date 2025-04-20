public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoor(2);
        car.setConvertible(true);
        car.setColor("Black");
        System.out.println("make = " + car.getMake());
        car.describeCar();
    }
}