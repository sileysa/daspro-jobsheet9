import java.util.Scanner;

public class Kafe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ketersediaan = false;

        String menu[] = { "Nasi Goreng", "Mie Goreng", "Roti Bakkar",
                "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };

        String masukkan;
        System.out.print("Masukkan menu: ");
        masukkan = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (masukkan.equalsIgnoreCase(menu[i])) {
                ketersediaan = true;
                break;
            } else {
                ketersediaan = false;
            }
        }
        if (ketersediaan) {
            System.out.println("Menu Tersedia");
        } else {
            System.out.println("Menu Tidak Tersedia");
        }
    }
}
