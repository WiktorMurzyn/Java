public class zmienne {
    public static void main(String[] args)
    {
        String firstName = "Jan";
        String lastName = "Kowalski";
        int age = 25;
        double height = 180;
        String pesel = "1234567890";


        System.out.println(firstName + " " + lastName + " ma " + age + " lat");
        System.out.println("Jan " + lastName + " ma pesel " + pesel);
        System.out.println("Jan ma wzrost " + height);
        System.out.println("Jeżeli Jan urośnie o 5cm, to będzie mia ł" + (height + 5) + "cm");
    }
}
