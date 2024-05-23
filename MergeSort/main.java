package MergeSort;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        long baslangicZamani = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        mergesort ms = new mergesort();
        ms.run(x, n);

        System.out.println("Sıralanmış dizi:");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
    
        long bitisZamani = System.currentTimeMillis();
        long calismaSuresi = bitisZamani - baslangicZamani;
        System.out.println("Kodun çalışma süresi: " + calismaSuresi + " milisaniye.");
    }
    
}
