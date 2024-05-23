package MergeSort;

import java.util.Scanner;

public class mergesort {
    public void run(int[] x, int n) {
        int[] aux = new int[n];
        int i, j, k, L1, L2, size, u1, u2, tur = 0;
        size = 1;
        Scanner scanner = new Scanner(System.in); // Scanner'ı burada tanımlıyoruz

        while (size < n) {
            L1 = 0;
            tur++;
            k = 0;
            System.out.printf("Tur Sayısı: %d\n", tur);
            System.out.println("Devam etmek için bir tuşa basın...");
            scanner.nextLine(); // Kullanıcıdan bir tuş beklemek

            while (L1 + size < n) {
                L2 = L1 + size;
                u1 = L2 - 1;
                u2 = (L2 + size - 1 < n) ? L2 + size - 1 : n - 1;
                for (i = L1, j = L2; i <= u1 && j <= u2; k++) {
                    if (x[i] <= x[j])
                        aux[k] = x[i++];
                    else
                        aux[k] = x[j++];
                    System.out.printf("aux[%d] = %d\n", k, aux[k]);
                }
                for (; i <= u1; k++) {
                    aux[k] = x[i++];
                    System.out.printf("aux[%d] = %d\n", k, aux[k]);
                }
                for (; j <= u2; k++) {
                    aux[k] = x[j++];
                    System.out.printf("aux[%d] = %d\n", k, aux[k]);
                }
                L1 = u2 + 1;
            }
            for (i = L1; k < n; i++) {
                aux[k++] = x[i];
                System.out.printf("aux[%d] = %d\n", k, aux[k]);
            }
            for (i = 0; i < n; i++)
                x[i] = aux[i];
            size *= 2;
        }
    }
}