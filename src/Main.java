public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.model);
        System.out.println(car1.make);

        System.out.println(car2.model);
        System.out.println(car2.make);

        car1.drive();
        car1.brake();
    }
}