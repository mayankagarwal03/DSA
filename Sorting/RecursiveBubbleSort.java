package Sorting;
import java.util.*;
public class RecursiveBubbleSort {
    public static void recursiveBubbleSort(int a[],int n){
        if (n==1) return;
        for(int i=0;i<=n-2;i++){
            if(a[i]>a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        recursiveBubbleSort(a, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        recursiveBubbleSort(a, n);
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}
