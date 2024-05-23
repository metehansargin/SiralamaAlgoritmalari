package RadixSort;
import java.util.Arrays;;
public class main {
    public static void main(String[] args) {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};
        
        System.out.println("Sıralanmamış Dizi:");
        System.out.println(Arrays.toString(array));
        
        radixSort(array);
        
        System.out.println("Sıralanmış Dizi:");
        System.out.println(Arrays.toString(array));
    }
    
    public static void radixSort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        
        // Tüm basamaklara göre sırala
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(array, exp);
        }
    }
    
    public static void countingSort(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);
        
        // Count dizisini oluştur
        for (int i = 0; i < n; i++) {
            count[(array[i] / exp) % 10]++;
        }
        
        // count dizisini güncelle
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        
        // output dizisini oluştur
        for (int i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }
        
        // output dizisini array'e kopyala
        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
    }
}
