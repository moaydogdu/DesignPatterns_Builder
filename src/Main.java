public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car araba = new Car.Builder("BMW")
                .model("3.20")
                .year(2023)
                .type("Sedan")
                .build();


    }
}