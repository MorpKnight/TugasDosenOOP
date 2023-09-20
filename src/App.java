import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Phone iPhone16 = new Phone("16", "iPhone", 2024, 8, 128, 3000, 999, false);
        iPhone16.getPhoneAge();

        Tablet SamsungTabS9 = new Tablet("S9", "Samsung", 2023, 12, 256, 5000, 1299, true, true);
        SamsungTabS9.getTabletAge();
        SamsungTabS9.openPen();
        SamsungTabS9.openApp(sc.nextLine());

        sc.close();
    }
}
