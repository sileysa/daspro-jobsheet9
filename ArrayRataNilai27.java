import java.util.Scanner;

public class ArrayRataNilai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs= new int[10];
        double total = 0;
        double rata2, rataLulus, rataTdkLulus, nilaiLulus = 0, nilaiTdkLulus = 0;
        int jumlahLulus = 0, jmlTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
                nilaiLulus += nilaiMhs[i];
            } else{
                jmlTdkLulus++;
                nilaiTdkLulus += nilaiMhs[i];
            }
        }
        rataLulus = nilaiLulus/jumlahLulus;
        rataTdkLulus = nilaiTdkLulus/jmlTdkLulus;
        System.out.println("Rata-rata nilai lulus : "+ rataLulus);
        System.out.println("Rata-rata nilai tidak lulus : "+ rataTdkLulus);
    }
}
