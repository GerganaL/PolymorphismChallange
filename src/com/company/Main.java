package com.company;

class Car{
    private String name;
    private int cylinders;
    private boolean engine ; //private boolean engine = true;
    private int wheels ; //private int wheels = 4;

    public Car(String name, int cylinders){
    this.name=name;
    this.cylinders = cylinders;
    this.engine=true;
    this.wheels=4;
    }

    public String getName(){
        return name;
    }

    public  int getCylinders(){
        return cylinders;
    }

    public String startEngine(){
        return getClass().getSimpleName()+ " -> startEngine()";
    }
    public String accelerate(){
        return getClass().getSimpleName()+ " -> accelerate()";
    }
    public String brake(){
        return getClass().getSimpleName()+" -> brake()";
    }
}

class Ford extends Car{
    public Ford(String name,int cylinders){
        super(name,cylinders);
    }

    @Override
    public String startEngine() {
       return getClass().getSimpleName()+ "-> start engine()";
    }

    @Override
    public String accelerate() {
          return getClass().getSimpleName()+ "-> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+ " -> brake()";
    }
}

class Toyota extends Car{
    public Toyota(String name,int cylinders){
        super(name,cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ "-> start engine()";
    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota -> brake()";
    }
}

class Audi extends Car{
    public Audi(String name,int cylinders){
        super(name,cylinders);
    }

    @Override
    public String startEngine() {
        return "Audi -> start engine()";
    }

    @Override
    public String accelerate() {
        return "Audi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Audi -> brake()";
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
//        for (int i = 1; i <11 ; i++) {
//            Car car = randomCar();
//            System.out.println("Car # " + i + ":" + car.getName()  + "\n" +
//                    "cylinders: " + car.getCylinders()+ "\n" +
//                    "engine: " + car.isEngine()+ "\n"+
//                    "wheels: " + car.getWheels()+ "\n");
//        }

        Car car = new Car("Base car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println( car.brake());

        Ford ford = new Ford("Focus",2 );
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println( ford.brake());

        Toyota toyota = new Toyota("Landcrusier",6 );
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        Audi audi = new Audi("A3",5 );
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

    }


//    public static Car randomCar() {
//        int randomCar = (int) (Math.random() * 3) + 1;
//        System.out.println("Random car generated was: " + randomCar);
//        switch (randomCar){
//            case 1:
//                return new Ford();
//            case 2:
//                return new Toyota();
//            case 3:
//                return new Audi();
//        }
//        return  null;
//    }
}
