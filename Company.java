public class Company {
    public static void main(String[] args) {
        Employee empl = new Employee();
        empl.imię = "Jan";
        empl.nazwisko = "Kowalski";
        empl.rokUrodzenia = 1980;
        empl.stażPracy = 5;

        Employee empl2 = new Employee();
        empl2.imię = "Kamil";
        empl2.nazwisko = "Nowak";
        empl2.rokUrodzenia = 1990;
        empl2.stażPracy = 2;

        Employee empl3 =new Employee();
        empl3.imię = "Marek ";
        empl3.nazwisko = "Murzyn";
        empl3.rokUrodzenia = 1985;
        empl3.stażPracy = 10;

        System.out.println("Pracownicy w firmie:");
        System.out.println(empl.imię + " " + empl.nazwisko + ", ur. " + empl.rokUrodzenia + ",staż: "
        + empl.stażPracy + " lata");

        System.out.println("Pracownicy w firmie 2:");
        System.out.println(empl2.imię + " " + empl2.nazwisko + ", ur. " + empl2.rokUrodzenia + ",staż: "
        + empl2.stażPracy + " lata");

        System.out.println("Pracownicy w firmie 3:");
        System.out.println(empl3.imię + " " + empl3.nazwisko + ", ur. " + empl3.rokUrodzenia + ",staż: "
        + empl3.stażPracy + " lata");



    }
}
