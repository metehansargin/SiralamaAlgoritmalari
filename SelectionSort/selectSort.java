package SelectionSort;

public class selectSort {
    public void run(int[]x,int n){
        int index,large;
        for(int i=0; i<n; i++) {
            large = x[n-i-1]; index=n-i-1;
            for(int j=0; j<n-i; j++)
            if(x[j]>large) { 
                large = x[j];
                index = j; 
            }
            x[index] = x[n-i-1];
            x[n-i-1] = large;
}}
}