package ShellSort;
import java.util.Scanner;;
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

        interactiveShellSort(x);
    }

    public static void interactiveShellSort(int[] array) {
        int n = array.length;
        int gap = 1;

        // Gap dizisini hesapla
        while (gap < n / 3) {
            gap = gap * 3 + 1; // Knuth sequence: 1, 4, 13, 40, 121, ...
        }

        // Gap'ı azaltarak sıralama yap
        while (gap > 0) {
            System.out.println("\nGap = " + gap + ":");
            for (int i = gap; i < n; i++) {
                int key = array[i];
                int j = i;

                // Sub-array'i sırala
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;

                // Aşamayı ekrana yazdır
                printStep(array);
            }
            // Gap'ı güncelle
            gap = (gap - 1) / 3;
        }

        System.out.println("\nSıralanmış dizi:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Aşamayı ekrana yazdıran yardımcı metot
    public static void printStep(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
