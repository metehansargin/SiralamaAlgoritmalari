package BubbleSort;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        long baslangicZamani = System.currentTimeMillis();
        System.out.println("Kac adet sayi siralansin.");
        int n=giris.nextInt();
        int []arr=new int[n];
        System.out.println("Enter'e basarak yeni eleman giriniz:::");
        for (int i = 0; i < n; i++) {
            arr[i]=giris.nextInt();
        }
        Bubble ne=new Bubble();
        ne.bubblesort(arr, n);
        System.out.println();
        long bitisZamani = System.currentTimeMillis();
        long calismaSuresi = bitisZamani - baslangicZamani;
        System.out.println("Kodun çalışma süresi: " + calismaSuresi + " milisaniye.");

    }
}