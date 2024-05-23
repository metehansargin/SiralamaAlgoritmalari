package InsertionSort;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int n = sc.nextInt();
        int[] x = new int[n];
        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        sc.close();

        insertionSort(x);

        System.out.println("Sıralanmış dizi:");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + " ");
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // key'den büyük olan öğeleri bir konum öteye taşır
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
