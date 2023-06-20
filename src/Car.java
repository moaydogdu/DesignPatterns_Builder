public class Car {
    private String brand;
    private String model;
    private int year;
    private String type;

    Car(
            Builder builder
    ){
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.type = builder.type;
    }

    public static class Builder{
        private String brand;
        private String model;
        private int year;
        private String type;

        public Builder(String brand){
            super();
            this.brand = brand;
        }

        public Builder model(String model){
            this.model = model;
            return this;
        }

        public Builder year(int year){
            this.year = year;
            return this;
        }

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }
}
