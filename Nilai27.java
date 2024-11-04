import java.util.Scanner;

public class Nilai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input jumlah mahasiswa : ");
        n = sc.nextInt();

        int nilai[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + " = ");
            nilai[i]= sc.nextInt();
            sum= sum+nilai[i];
        }
        double rata2 = sum/n;
        System.out.println("Nilai rata-rata = " + rata2);

        int min, max;
        min = max = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i]>max) 
                max = nilai[i];
            if (nilai[i]<min) 
                min = nilai[i];
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
