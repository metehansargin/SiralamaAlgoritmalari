package BubbleSort;

public class Bubble {
public void bubblesort(int []arr,int n){
for (int i = 0; i < n-1; i++) {
    for (int j = 0; j < n-1; j++) {
        if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
}    
System.out.println(".....Sıralanmış liste.....");
for (int i = 0; i <n; i++) {
    System.out.println(arr[i]+" ");
}
System.out.println();
}

}
