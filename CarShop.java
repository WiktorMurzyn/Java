public class CarShop {
    public static void main(String[] args) {

        Car car1 =  new Car();
        Car car2 = car1;
        car1.marka = "Honda";
        car2.model = "Civic";
        car1.kolor = "Czerwony";
        car2.kolorfelg = "Czarny";
        car1.koloropon = "Czarny";
        car2.drzwi = 5;
        String carInfo = car1.marka + ", " + car1.model + ", " + car1.kolor + ", "
                + car1.kolorfelg + ", " + car1.koloropon + ", " + car1.drzwi;

        System.out.println(carInfo);



//        Car car2 =  new Car();
//        car2.marka = "Ford";
//        car2.model = "Focus";
//        car2.kolor = "Niebiesk";
//        car2.kolorfelg = "Czarny";
//        car2.koloropon = "Czarny";
//        car2.drzwi = 5;
//
//        System.out.println(car2.marka );
//        System.out.println(car2.model );
//        System.out.println(car2.drzwi );
//
//        car2.marka = "Ferrari";
//        car2.model = "Enzo";
//        car2.drzwi = 5;
//        System.out.println(car2.marka);
//        System.out.println(car2.model);
//        System.out.println(car2.drzwi);






    }
}
