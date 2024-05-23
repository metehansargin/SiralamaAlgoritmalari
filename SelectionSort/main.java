package SelectionSort;

public class main {
    public static void main(String[] args) {
        long baslangicZamani = System.currentTimeMillis();
        int []dizi={25,11,43,67,91,55,15,72,11,21421,1,123,123,12,312,312,312,3,124,253,4,6,43,2342,34};
        selectSort ss=new selectSort();
        ss.run(dizi, 8);
        for (int i = 0; i < 8; i++) {
            System.out.print(" "+dizi[i]);
        }
        long bitisZamani = System.currentTimeMillis();
        long calismaSuresi = bitisZamani - baslangicZamani;
        System.out.println("Kodun çalışma süresi: " + calismaSuresi + " milisaniye.");
    }
}


