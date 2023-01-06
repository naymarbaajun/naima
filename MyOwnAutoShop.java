class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(50, 30000, "Black", 22);
        Ford ford1 = new Ford(150, 50000, "pink", 2020, 2000);
        Ford ford2 = new Ford(200, 20000, "green", 2019, 1000);
        Car car = new Car(100, 30000, "blue");

        System.out.println("Sale price of sedan: " + sedan.getSalePrice());
        System.out.println("Sale price of first Ford: " + ford1.getSalePrice());
        System.out.println("Sale price of second Ford: " + ford2.getSalePrice());
        System.out.println("Sale price of car: " + car.getSalePrice());
    }
}
