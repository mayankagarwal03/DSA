package Sorting;
import java.util.*;
public class SelectionSort{
    public static int[] selectionsort(int num[],int n){
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(num[min]>num[j]){
                    min=j;
                }
            }
            int temp=num[min];
            num[min]=num[i];
            num[i]=temp;
        }
        return num;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        nums=selectionsort(nums,n);
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
        sc.close();
    }
}