public class CompareOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        System.out.println("Czy X jest większy od Y?");
        boolean isXGreataterThenY = x>y;
        System.out.println(isXGreataterThenY);

        boolean xEquelsY = x != y;
        System.out.println("Czy Z jest różny Y?");
        System.out.println(xEquelsY);
        System.out.println(!xEquelsY);


    }
}
