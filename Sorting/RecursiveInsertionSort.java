package Sorting;
import java.util.*;
public class RecursiveInsertionSort {
    public static void recursiveInsertionSort(int a[],int n,int i){
        if(i==n) return;
        int z=i;
        while(z>0 && a[z-1]>a[z]){
            int temp=a[z];
            a[z]=a[z-1];
            a[z-1]=temp;
            z--;
        }
        recursiveInsertionSort(a, n, i+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        recursiveInsertionSort(a,n,1);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}
